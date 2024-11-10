public class EjemploStringInmutable {

   public static void main(String[] args) {
      //Los valroes del string nunca cambia
      String curso = "Programación Java";
      String profesor = "Rafael Flores";

      String resultado = curso.concat(profesor);
      System.out.println("curso: " + curso);
      System.out.println("resultado: " + resultado);
      System.out.println("curso == resultado: " + curso == resultado);

      /*
       * transform es un método de la clase String introducido en Java 12.
       * Permite aplicar una función a un String y devolver un resultado
       *    transformado sin modificar el String original (recuerda que los
       *    String son inmutables en Java).
       *
       * Expresión Lambda (c -> { ... }):
       *    c es una variable que representa el String contenido en curso.
       *    La expresión { return c + " con " + profesor; } concatena
       *    c (el valor de curso) con el String " con " y el valor de profesor.
       *    Finalmente, el resultado de esta concatenación se devuelve y se asigna a resultado2.
       *
       * La línea curso.transform(c -> { return c + " con " + profesor; });
       *    toma el String en curso, le aplica una operación de concatenación
       *    con " con " y el String profesor, y devuelve el resultado sin
       *    modificar el String original.
       */
      String resultado2 = curso.transform(c -> {
         return c + " con " + profesor;
      });
      /*
       * Función lambda
       *    Expresión que representa un comportamiento o bloque de código
       *    que puedes pasar como parámetro, almacenar en una variable, o
       *    incluso devolver desde un método.
       *    Son muy útiles cuando tienes que pasar pequeñas funcionalidades
       *    a métodos que aceptan interfaces funcionales.
       */
      System.out.println("curso: " + curso);
      System.out.println("resultado2: " + resultado2);

      String resultado3 = resultado.replace("a","A");
      System.out.println("resultado: " + resultado);
      System.out.println("resultado3: " + resultado3);
   }
}
