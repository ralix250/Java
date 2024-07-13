package primerPaquete;

/* 
   Clases:
   - La primera letra debe ser mayúscula.
   - Java es sensible a mayúsculas y minúsculas.
   - El nombre del archivo Java debe coincidir con el nombre de la clase.
*/

public class PrimeraClase {
   /* 
      Método Main:
      - Cualquier código que contenga main() será ejecutado.
   */
   public static void main(String[] args){
      /* 
         Nomenclatura de variables:
         - La primera letra en minúscula, con la primera letra de cada palabra subsiguiente en mayúscula.
         - Evita caracteres especiales y números en los nombres de las variables.
      */

      /* DATOS PRIMITIVOS */

      // Tipos enteros:
      byte  numeroByte  = 50;         // Rango de -128 a 127.
      short numeroShort = 50;         // Rango de -32,768 a 32,767.
      int   numeroInt   = 50;         // Rango de -2^31 a 2^31 - 1.
      long  numeroLong  = 50L;        // Rango de -2^63 a 2^63 - 1.  // Debe terminar con una "L" al final del valor

      // Tipos de punto flotante:
      float  numeroFloat  = 50.5f;    // Rango de aproximadamente ±3.4e-38 a ±3.4e+38.  Debe terminar con una "f" al final del valor
      double numeroDouble = 50.5;     // Rango de aproximadamente ±1.7e-308 a ±1.7e+308.


      // Tipo booleano:
      boolean booleano = true; // Representa verdadero (true) o falso (false).

      // Tipo de carácter:
      char caracter = 'A'; // Representa un solo carácter Unicode.

      /* DATOS DE OBJETO */

      // String: Representa una secuencia de caracteres.
      String texto = "Hola, mundo!";

      // Arrays: Java también proporciona soporte para arreglos.
      int[] arregloEnteros = {1, 2, 3, 4, 5};
      String[] arregloStrings = {"uno", "dos", "tres"};

      // Clases personalizadas: Puedes crear tus propias clases en Java.
      public class Persona {
          String nombre;
          int edad;
      
          public Persona(String nombre, int edad) {
              this.nombre = nombre;
              this.edad = edad;
          }
      }
      Persona persona1 = new Persona("Juan", 30);

      // Colecciones: Java proporciona una variedad de colecciones en el paquete java.util.
      import java.util.ArrayList;
      import java.util.HashMap;

      ArrayList<String> listaStrings = new ArrayList<>();
      listaStrings.add("uno");
      listaStrings.add("dos");

      HashMap<String, Integer> mapa = new HashMap<>();
      mapa.put("clave1", 1);
      mapa.put("clave2", 2);

      // Tipos de datos envolventes (Wrapper classes):
      Integer enteroEnvoltorio = 5;
      Double doubleEnvoltorio = 3.14;

      /* 
         METODOS:
         - {} Indican el inicio y final de un bloque de código.
         - En Java, un método es un bloque de código que realiza una tarea específica y puede ser invocado desde otras partes del programa.
         - Los métodos se utilizan para dividir el código en fragmentos más pequeños y manejables, lo que facilita la lectura, la reutilización y el mantenimiento del código.
         - Un método puede tener cero o más parámetros, que son valores que se pasan al método para que realice su tarea.
         - Un método puede devolver un valor (o ningún valor) después de completar su tarea. Este valor de retorno tiene un tipo de datos asociado.
         - Algunos métodos están predefinidos en las clases de Java (como println() en la clase System), mientras que otros métodos pueden ser definidos por el usuario.
         
         Ejemplo de cómo usar un método predefinido:
      */
         
      public class EjemploMetodo {
         public static void main(String[] args) {
            String mensaje = "¡Hola, mundo!";
            
            // Utilizamos el método println() para imprimir el mensaje en la consola.
            System.out.println(mensaje);
         }
      }

   }
}
