# Preguntas de Practica Modulos

## Pregunta 1

### Which of the following is an advantage of the Java Platform Module System?

<ol type="a">
<li>A central repository of all modules</li>
<li>Encapsulating packages</li>
<li>Encapsulating objects</li>
<li>No defined types</li>
<li>Platform independence</li>
</ol>


#### Solución
<details>
  <summary>Ver solución</summary>
  
  B. La opción B es correcta ya que los módulos le permiten especificar qué paquetes pueden ser llamados por código externo. Las opciones C y E son incorrectas porque las proporciona Java sin el sistema de módulos. La opción A es incorrecta porque no hay un depósito central de módulos. La opción D es incorrecta porque Java define tipos.
</details>

---

## Pregunta 2

### Which statement is true of the following module?

```
  zoo.staff
  |---zoo
     |-- staff
       |-- Vet.java
```

<ol type="a">
<li>The directory structure shown is a valid module.</li>
<li>The directory structure would be a valid module if module.java were added directly underneath zoo.staff.</li>
<li>The directory structure would be a valid module if module.java were added directly underneath zoo.</li>
<li>The directory structure would be a valid module if module-info.java were added directly underneath zoo.staff.</li>
<li>The directory structure would be a valid module if module-info.java were added directly underneath zoo.</li>
<li>None of these changes would make this directory structure a valid module.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  D. Se requiere que los módulos tengan un archivo module-info.java en el directorio raíz del módulo. La opción D cumple con este requisito.
</details>

---

## Pregunta 3

### Suppose module **puppy** depends on module **dog** and module **dog** depends on module **animal**. Fill in the blank so that code in module **dog** can access the **animal.behavior** package in module animal.

```
  module animal {
     ________ animal.behavior;
  }
```

<ol type="a">
<li>export</li>
<li>exports</li>
<li>require</li>
<li>requires</li>
<li>require transitive</li>
<li>requires transitive</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  B. Las opciones A, C y E son incorrectas porque se refieren a palabras clave que no existen. La palabra clave exports se usa cuando se permite que un paquete sea llamado por código fuera del módulo, haciendo que la opción B sea la respuesta correcta. Tenga en cuenta que las opciones D y F son incorrectas porque requiere que se utilicen nombres de módulos y no de paquetes.
</details>

---

## Pregunta 4

### Fill in the blanks so this command to run the program is correct:

```
  java
  _______ zoo.animal.talks/zoo/animal/talks/Peacocks
  _______ modules
```

<ol type="a">
<li>-d and -m</li>
<li>-d and -p</li>
<li>-m and -d</li>
<li>-m and -p</li>
<li>-p and -d</li>
<li>-p and -m</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  G. La opción -m o --module se usa para especificar el módulo y el nombre de la clase. La opción -p o -module-path se utiliza para especificar la ubicación de los módulos. La opción D sería correcta si el resto del comando fuera correcto. Sin embargo, ejecutar un programa requiere especificar el nombre del paquete con puntos (.) En lugar de barras. Dado que el comando es incorrecto, la opción G es correcta.

</details>

---

## Pregunta 5

### Which of the following statements are true in a module-info.java file? (Choose all that apply.)

<ol type="a">
<li>The opens keyword allows the use of reflection.</li>
<li>The opens keyword declares an API is called.</li>
<li>The use keyword allows the use of reflection.</li>
<li>The use keyword declares an API is called.</li>
<li>The uses keyword allows the use of reflection.</li>
<li>The uses keyword declares an API is called.</li>
<li>The file can be empty (zero bytes).</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  A, F, G. Las opciones C y D son incorrectas porque no hay una palabra clave de uso. Las opciones A y F son correctas porque se abre para la reflexión y los usos declaran una API que consume un servicio. La opción G también es correcta ya que el archivo puede estar completamente vacío. Esto es solo algo que tienes que memorizar.

</details>

---

## Pregunta 6

### What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)

```
module com.food.supplier {}
```

<ol type="a">
<li>All packages inside the module are automatically exported.</li>
<li>No packages inside the module are automatically exported.</li>
<li>A main method inside the module can be run.</li>
<li>A main method inside the module cannot be run since the class is not exposed.</li>
<li>The module-info.java file contains a compiler error.</li>
<li>The module-info.java filename is incorrect.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
  B, C. Los paquetes dentro de un módulo no se exportan de forma predeterminada, lo que hace que la opción B sea correcta y la opción A sea incorrecta. La exportación es necesaria para que otro código utilice los paquetes; no es necesario llamar al método main () en la línea de comando, haciendo que la opción C sea correcta y la opción D sea incorrecta. El archivo module-info.java tiene el nombre correcto y se compila, lo que hace que las opciones E y F sean incorrectas.

</details>

---

## Pregunta 8

### Which commands take a --module-path parameter? (Choose all that apply.)

<ol type="a">
<li>javac</li>
<li>java</li>
<li>jar</li>
<li>jdeps</li>
<li>jmod</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
A, B, D. Las opciones A y B son correctas porque la opción -p (--module-path) se puede pasar al compilar o ejecutar un programa. La opción D también es correcta porque jdeps puede usar la opción --module-path cuando enumera la información de dependencia.

</details>

---

## Pregunta 9

### Which of the following are legal commands to run a modular program? (Choose all that apply.)

<ol type="a">
<li>java -p x -m x/x</li>
<li>java -p x-x -m x/x</li>
<li>java -p x -m x-x/x</li>
<li>java -p x -m x/x-x</li>
<li>java -p x -m x.x</li>
<li>java -p x.x -m x.x</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
A, B. La -p especifica la ruta del módulo. Esto es solo un directorio, por lo que todas las opciones tienen una ruta de módulo legal. -M especifica el módulo, que tiene dos partes separadas por una barra. Las opciones E y F son incorrectas ya que no hay barra. La primera parte es el nombre del módulo. Está separado por puntos (.) En lugar de guiones (-), lo que hace que la opción C sea incorrecta. La segunda parte es el paquete y el nombre de la clase, nuevamente separados por puntos. Los nombres de paquetes y clases deben ser identificadores legales de Java. No se permiten guiones (-), descartando la opción D. Esto deja las opciones A y B como las respuestas correctas.

</details>

---

## Pregunta 10

### Which would best fill in the blank to complete the following code?

```java
  module ________ {
     exports com.unicorn.horn;
     exports com.unicorn.magic;
  }
```

<ol type="a">
<li>com</li>
<li>com.unicorn</li>
<li>com.unicorn.horn</li>
<li>com.unicorn.magic</li>
<li>The code does not compile.</li>
<li>The code compiles, but none of these would be a good choice.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B. Un módulo reclama los paquetes que se encuentran debajo. Por lo tanto, las opciones C y D no son buenos nombres de módulo. Cualquiera de los dos excluiría el otro nombre de paquete. Las opciones A y B cumplen los criterios de ser un paquete de nivel superior. Sin embargo, la opción A reclamaría muchos otros paquetes, incluido com.sybex. Esta no es una buena elección, por lo que la opción B es la respuesta correcta.

</details>

---

## Pregunta 11

### Which are valid modes for the jmod command? (Choose all that apply.)

<ol type="a">
<li>add</li>
<li>create</li>
<li>delete</li>
<li>describe</li>
<li>extract</li>
<li>list</li>
<li>show</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B, D, E, F. This is another question you just have to memorize. The jmod command has five modes you need to be able to list: create, extract, describe, list, and hash. The hash operation is not an answer choice. The other four are making options B, D, E, and F correct.

</details>

---

## Pregunta 12

### Suppose you have the commands javac, java, and jar. How many of them support a --show-module-resolution option?

<ol type="a">
<li>0</li>
<li>1</li>
<li>2</li>
<li>3</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B. El comando java usa esta opción para imprimir información cuando se carga el programa. Puede pensar que jar hace lo mismo ya que también ejecuta un programa. Por desgracia, este parámetro no existe en jar.

</details>

---

## Pregunta 13

### Which are true statements about the following module? (Choose all that apply.)

```java
  class dragon {
     exports com.dragon.fire;
     exports com.dragon.scales to castle;
  }
```

<ol type="a">
<li>All modules can reference the com.dragon.fire package.</li>
<li>All modules can reference the com.dragon.scales package.</li>
<li>Only the castle module can reference the com.dragon.fire package.</li>
<li>Only the castle module can reference the com.dragon.scales package.</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
E. Aquí hay un truco. Una definición de módulo utiliza la palabra clave módulo en lugar de clase. Dado que el código no se compila, la opción E es correcta. Si el código se compilara, las opciones A y D serían correctas.

</details>

---

## Pregunta 14

### Which would you expect to see when describing any module?

<ol type="a">
<li>requires java.base mandated</li>
<li>requires java.core mandated</li>
<li>requires java.lang mandated</li>
<li>requires mandated java.base</li>
<li>requires mandated java.core</li>
<li>requires mandated java.lang</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
A. Al ejecutar java con la opción -d, se enumeran todos los módulos necesarios. Además, el módulo java.base aparece en la lista, ya que se incluye automáticamente. La línea termina con obligatorio, haciendo que la opción A sea correcta. El java.lang es un truco ya que es un paquete que se importa por defecto en una clase en lugar de un módulo.

</details>

---

## Pregunta 15

### Which of the following statements are correct? (Choose all that apply.)

<ol type="a">
<li>The jar command allows adding exports as command-line options.</li>
<li>The java command allows adding exports as command-line options.</li>
<li>The jdeps command allows adding exports as command-line options.</li>
<li>Adding an export at the command line is discouraged.</li>
<li>Adding an export at the command line is recommended.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B, D. El comando java tiene una opción --add-export que permite exportar un paquete en tiempo de ejecución. Sin embargo, no se recomienda su uso, por lo que las opciones B y D son la respuesta.

</details>

---

## Pregunta 16

### Which are valid calls to list a summary of the dependencies? (Choose all that apply.)

<ol type="a">
<li>jdeps flea.jar</li>
<li>jdeps -s flea.jar</li>
<li>jdeps -summary flea.jar</li>
<li>jdeps --summary flea.jar</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B, C. La opción A se ejecutará, pero imprimirá detalles en lugar de un resumen. Las opciones B y C son opciones válidas para el comando jdeps. Recuerde que -summary usa un solo guión (-).

</details>

---

## Pregunta 17

### Which is the first line to contain a compiler error?

```java
  1: module snake {
  2:    exports com.snake.tail;
  3:    exports com.snake.fangs to bird;
  4:    requires skin;
  5:    requires transitive skin;
  6: }
```

<ol type="a">
<li>Line 1.</li>
<li>Line 2.</li>
<li>Line 3.</li>
<li>Line 4.</li>
<li>Line 5.</li>
<li>The code does not contain any compiler errors.</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
E. El nombre del módulo es válido al igual que las declaraciones de exportación. Las líneas 4 y 5 son complicadas porque cada una es válida de forma independiente. Sin embargo, no se permite el uso del mismo nombre de módulo en dos instrucciones require. El segundo no se compila en la línea 5, por lo que la opción E es la respuesta.

</details>

---

## Pregunta 18

### Which of the following would be a legal module name? (Choose all that apply.)

<ol type="a">
<li>com.book</li>
<li>com-book</li>
<li>com.book$</li>
<li>com-book$</li>
<li>4com.book</li>
<li>4com-book</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
A, C. Los nombres de los módulos se parecen mucho a los nombres de los paquetes. Cada segmento está separado por un punto (.) Y utiliza caracteres válidos en identificadores de Java. Dado que los identificadores no pueden comenzar con números, las opciones E y F son incorrectas. Tampoco se permiten guiones (-), descartando las opciones B y D. Eso deja las opciones A y C como las respuestas correctas.

</details>

---

## Pregunta 19

### What can be created using the Java Platform Module System that could not be created without it? (Choose all that apply.)

<ol type="a">
<li>JAR file</li>
<li>JMOD file</li>
<li>Smaller runtime images for distribution</li>
<li>Operating system specific bytecode</li>
<li>TAR file</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B, C. La opción A es incorrecta porque los archivos JAR siempre han estado disponibles independientemente del JPMS. La opción D es incorrecta porque el código de bytes se ejecuta en la JVM y no es específico del sistema operativo por definición. Si bien es posible ejecutar el comando tar, esto no tiene nada que ver con Java, lo que hace que la opción E sea incorrecta. La opción B es una de las respuestas correctas ya que el comando jmod crea un archivo JMOD. La opción C es la otra respuesta correcta porque especificar dependencias es uno de los beneficios del JPMS.

</details>

---

## Pregunta 20

### Which of the following options does not have a one-character shortcut in any of the commands studied in this chapter? (Choose all that apply.)

<ol type="a">
<li>describe-module</li>
<li>list-modules</li>
<li>module</li>
<li>module-path</li>
<li>show-module-resolution</li>
<li>summary</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
B, E. La opción A es incorrecta porque describe-module tiene el equivalente d. La opción C es incorrecta porque el módulo tiene el equivalente m. La opción D es incorrecta porque module-path tiene el equivalente p. La opción F es incorrecta porque el resumen tiene el equivalente s. Las opciones B y E son las respuestas correctas porque no tienen equivalentes.

</details>

---

## Pregunta 21

### Which of the following are legal commands to run a modular program where n is the package name and c is the class name? (Choose all that apply.)

<ol type="a">
<li>java –module-path x -m n.c</li>
<li>java --module-path x -p n.c</li>
<li>java --module-path x -m n/c</li>
<li>java --module-path x -p n/c</li>
<li>java --module-path x -m n c</li>
<li>java --module-path x -p n c</li>
<li>None of the above</li>
</ol>

#### Solución
<details>
  <summary>Ver solución</summary>
  
C. La opción -p es una forma más corta de --module-path. Dado que la misma opción no se puede especificar dos veces, las opciones B, D y F son incorrectas. La opción --module-path es una forma alternativa de -p. El nombre del módulo y el nombre de la clase se separan con una barra, lo que hace que la opción C sea la respuesta.

</details>