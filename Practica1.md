# Preguntas de Practica

## Pregunta 1

```Java
public class MathFunctions {    
	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
    }
    
    public static void main(String[] args) {
    	var a = 15;
        var b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
     }
}
```
### Cual es el resultado?

<ol type="a">
  <li>10</li>
  <li>15</li>
  <li>25</li>
  <li>Compiler error on line 3</li>
  <li>Compiler error on line 8</li>
  <li>None of the above</li>
</ol>



#### Solución
<details>
  <summary>Ver solución</summary>
  
  B. El código se compila correctamente, por lo que las opciones D y E son incorrectas. El valor de a no se puede cambiar con el método addToInt(), sin importar lo que haga el método, porque suno se pasa una copia de la variable al parámetro x. Por lo tanto, no cambia y la salida en la línea 9 es 15.
</details>

---

## Pregunta 2

¿Cuál es el resultado del siguiente programa? (Elija todas las que correspondan).

```Java
1:  interface HasTail { int getTailLength(); }
2:  abstract class Puma implements HasTail {
3:     protected int getTailLength() { return 4; }
4:  }
5:  public class Cougar implements HasTail {
6:     public static void main(String[] args) {
7:        var puma = new Puma();
8:        System.out.println(puma.getTailLength());
9:     }
10:    public int getTailLength(int length) { return 2; }
11: }
```
### Alternativas

<ol type="a">
  <li>2</li>
  <li>4</li>
  <li>The code will not compile because of line 3.</li>
  <li>The code will not compile because of line 5.</li>
  <li>The code will not compile because of line 7.</li>
  <li>The code will not compile because of line 10.</li>
  <li>The output cannot be determined from the code provided.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativas: C, D y E
  
  El programa contiene tres errores de compilación. Primero, el método getTailLength() en la interfaz HasTail es implícitamente público, ya que es un método de interfaz abstracto. Por lo tanto, la línea 3 no compila ya que es una sobre-escritura no válida, porque reduce la visibilidad del método y hace que la opción C sea correcta. 
  
A continuación, la clase Cougar implementa una versión sobrecargada de getTailLength() con una firma diferente a la del método de interfaz abstracta que hereda. Por esta razón, la declaración de Cougar no es válida y la opción D es correcta. 

Finalmente, la opción E es correcta, ya que Puma está marcado como abstracto y no se puede instanciar.
</details>

---

## Pregunta 3

¿Cuál es el resultado del siguiente fragmento de código?

```Java
 int moon = 9, star = 2 + 2 * 3;
 float sun = star>10 ? 1 : 3;
 double jupiter = (sun + moon) - 1.0f;
 int mars = --moon <= 8 ? 2 : 3;
 System.out.println(sun+"-"+jupiter+"-"+mars); 
```
### Alternativas

<ol type="a">
  <li>1‐11‐2</li>
  <li>3.0‐11.0‐2</li>
  <li>1.0‐11.0‐3</li>
  <li>3.0‐13.0‐3</li>
  <li>3.0f‐12‐2</li>
  <li>The code does not compile because one of assignments requires an explicit numeric cast.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativa: B 
  
  Inicialmente, a moon se le asigna un valor de 9, mientras que a star se le asigna un valor de 8. El operador de multiplicación (*) tiene un orden de precedencia más alto que el operador de suma (+), por lo que se evalúa primero. 
  
  Dado que star no es mayor que 10, a sun se le asigna un valor de 3, que se promueve a 3.0f como parte de la asignación. El valor de jupiter es (3.0f + 9) - 1.0, que es 11.0f. Este valor se promueve implícitamente al doble cuando se asigna. 
  
  En la última asignación, moon se predecrementa de 9 a 8, con el valor de la expresión devuelto como 8. Dado que 8 menor o igual que 8 es verdadero, mars se establece en un valor de 2. 
  
  La salida final es 3.0-11.0 ‐2, haciendo que la opción B sea la respuesta correcta. Tenga en cuenta que mientras que Java genera el decimal para los valores flotantes y dobles, no genera la f para los valores flotantes.

</details>

---

## Pregunta 4

¿Cuántas veces se imprime la palabra "true"?

```Java
 var s1 = "Java";
 var s2 = "Java";
 var s3 = "Ja".concat("va");
 var s4 = s3.intern();
 var sb1 = new StringBuilder();
 sb1.append("Ja").append("va");
 
 System.out.println(s1 == s2);
 System.out.println(s1.equals(s2));
 System.out.println(s1 == s3);
 System.out.println(s1 == s4);
 System.out.println(sb1.toString() == s1);
 System.out.println(sb1.toString().equals(s1)); 
```
### Alternativas

<ol type="a">
  <li>Once</li>
  <li>Twice</li>
  <li>Three times</li>
  <li>Four times</li>
  <li>Five times</li>
  <li>Six times</li>
  <li>The code does not compile.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativa: D
  
  Los literales de String se utilizan desde el "pool" de Strings. Esto significa que s1 y s2 se refieren al mismo objeto y son iguales. Por lo tanto, las dos primeras declaraciones se imprimen "true". El método concat() fuerza la creación de una nueva cadena, lo que hace que la tercera declaración de impresión imprima falsa. 
  
  El método intern() recupera el String desde el "pool" de String. Por lo tanto, la cuarta declaración impresa imprime verdadera. 
  
  La quinta declaración print imprime falso porque toString() usa un método para calcular el valor, y no es del "pool" de String. 
  
  La impresión final vuelve a imprimir verdadero porque equals() mira los valores de los objetos String.

</details>

---

## Pregunta 5

El siguiente código aparece en un archivo llamado Flight.java. ¿Cuál es el resultado de compilar este archivo fuente?

```Java
1: public class Flight { 
2:    private FlightNumber number; 
3: 
4:    public Flight(FlightNumber number) { 
5:       this.number = number; 
6:    } }
7: public class FlightNumber { 
8:    public int value; 
9:    public String code; }
```
### Alternativas

<ol type="a">
  <li>The code compiles successfully and two bytecode files are generated: Flight.class and FlightNumber.class.</li>
  <li>The code compiles successfully and one bytecode file is generated: Flight.class.</li>
  <li>A compiler error occurs on line 2.</li>
  <li>A compiler error occurs on line 4.</li>
  <li>A compiler error occurs on line 7.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativa: E
  
  El código no se compila porque Java permite como máximo una clase pública en el mismo archivo. La clase FlightNumber no debe declararse pública o debe trasladarse a su propio archivo fuente llamado FlightNumber.java. El error del compilador ocurre en la línea 7, por lo que la respuesta es la opción E.

</details>

---

## Pregunta 6

¿Cuál de los siguientes ejecutará un programa modular?

### Alternativas

<ol type="a">
  <li>java ‐cp modules mod/class</li>
  <li>java ‐cp modules ‐m mod/class</li>
  <li>java ‐cp modules ‐p mod/class</li>
  <li>java ‐m modules mod/class</li>
  <li>java ‐m modules ‐p mod/class</li>
  <li>java ‐p modules mod/class</li>
  <li>java ‐p modules ‐m mod/class</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativa: G
  
  El examen requiere saber cómo ejecutar desde la línea de comandos. La nueva opción ‐p especifica la ruta del módulo. La nueva opción ‐m precede al programa que se ejecutará en el formato nombreMódulo / nombreClasecompletamentecalificado. La opción G es la única que cumple con estos requisitos.

</details>

---

## Pregunta 7

¿Cuál es el resultado de ejecutar el siguiente fragmento de código?

```Java
final int score1 = 8, score2 = 3;
char myScore = 7;
switch (myScore) {
    default:
    score1:
    2: 6: System.out.print("great-");
    4: System.out.print("good-"); break;
    score2:
    1: System.out.print("not good-");
}
```

### Alternativas

<ol type="a">
  <li>great‐good‐</li>
  <li>good‐</li>
  <li>not good‐</li>
  <li>great‐good‐not‐good‐</li>
  <li>The code does not compile because default is not a keyword in Java.</li>
  <li>The code does not compile for a different reason.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativa: F
  
  El código no se compila porque las declaraciones de cambio requieren declaraciones de caso antes de los dos puntos (:). Por ejemplo, case score1: se compilaría. Por esta razón, la opción F es la respuesta correcta. Si las seis declaraciones de casos faltantes se agregan a lo largo de este fragmento, entonces la rama predeterminada se ejecutaría ya que 7 no coincide en ninguna de las declaraciones de casos, lo que da como resultado una salida de gran-bien- y hace que la opción A sea correcta.

</details>

---

## Pregunta 8

¿Cuál de las siguientes líneas puede llenar el espacio en blanco para imprimir verdadero? (Elija todas las que correspondan).

```Java
10: public static void main(String[] args) {
11:    System.out.println(____________________________);
12: }
13: private static boolean test(Predicate<Integer> p) {
14:    return p.test(5);
15: }
```

### Alternativas

<ol type="a">
  <li>test(i ‐> i == 5)</li>
  <li>test(i ‐> {i == 5;})</li>
  <li>test((i) ‐> i == 5)</li>
  <li>test((int i) ‐> i == 5)</li>
  <li>test((int i) ‐> {return i == 5;})</li>
  <li>test((i) ‐> {return i == 5;})</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativas: A, C y F 
  
  La interfaz Predicate toma un solo parámetro y devuelve un booleano. Las expresiones lambda con un parámetro pueden omitir los paréntesis alrededor de la lista de parámetros, lo que hace que las opciones A y C sean equivalentes y ambas correctas. La declaración de devolución es opcional cuando hay una sola declaración en el cuerpo, lo que hace que la opción F sea correcta. La opción B es incorrecta porque se debe usar una declaración de retorno si se incluyen llaves alrededor del cuerpo. Las opciones D y E son incorrectas porque el tipo es Integer en el predicado e int en el lambda. El autoboxing funciona para colecciones que no infieren predicados. Si estos dos se cambiaran a Integer, serían correctos.
</details>

---

## Pregunta 9

¿Cuáles de los siguientes son miembros de instancia válidos de una clase? (Elija todas las que correspondan).

### Alternativas

<ol type="a">
  <li>var var = 3;</li>
  <li>Var case = new Var();</li>
  <li>void var() {}</li>
  <li>int Var() { var _ = 7; return _;}</li>
  <li>String new = "var";</li>
  <li>var var() { return null; }</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativas: C 
  
  La opción A es incorrecta porque var solo se permite como tipo para variables locales, no miembros de instancia. Las opciones B y E son incorrectas porque new y case son palabras reservadas y no se pueden usar como identificadores. La opción C es correcta, ya que se puede usar var como nombre de método. La opción D es incorrecta porque no se puede usar un solo guión bajo (_) como identificador a partir de Java 9. Finalmente, la opción F es incorrecta porque no se puede especificar var como el tipo de retorno de un método.
</details>

---

## Pregunta 10

¿Cuál de los siguientes tipos se puede insertar en el espacio en blanco que permite que el programa se compile correctamente? (Elija todas las que correspondan).

```Java
1:  import java.util.*;
2:  interface CanSwim {}
3:  class Amphibian implements CanSwim {}
4:  abstract class Tadpole extends Amphibian {}
5:  public class FindAllTadPole {
6:     public static void main(String[] args) {
7:        var tadpoles = new ArrayList<Tadpole>();
8:        for (Amphibian amphibian : tadpoles) {
9:           ____________ tadpole = amphibian;
10: } } }
```

### Alternativas

<ol type="a">
  <li>CanSwim</li>
  <li>Boolean</li>
  <li>Amphibian</li>
  <li>Tadpole</li>
  <li>Object</li>
  <li>None of the above; the program contains a compilation error.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  Alternativas: A, C y E
  
  El bucle for-each lanza implícitamente cada objeto Tadpole a una referencia Amphibian, lo cual está permitido porque Tadpole es una subclase de Amphibian. A partir de ahí, se permite cualquier supertipo de anfibio sin un elenco explícito. Esto incluye CanSwim, que Amphibian implementa, y Object, desde donde se extienden todas las clases, lo que hace que las opciones A y E sean correctas. La opción C también es correcta, ya que la referencia se convierte en el mismo tipo. La opción B es incorrecta, ya que booleano no es un supertipo de anfibio. La opción D también es incorrecta. Aunque el objeto subyacente es una instancia de Tadpole, requiere un lanzamiento explícito en la línea 9 ya que el tipo de referencia es Anfibio. La opción F es incorrecta porque hay opciones que permiten que el código se compile.
</details>