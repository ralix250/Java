package primerPaquete;

/* 
   Clases:
   - La primera letra debe ser may�scula.
   - Java es sensible a may�sculas y min�sculas.
   - El nombre del archivo Java debe coincidir con el nombre de la clase.
*/

public class PrimeraClase {
   /* 
      M�todo Main:
      - Cualquier c�digo que contenga main() ser� ejecutado.
   */
   public static void main(String[] args){
      /* 
         Nomenclatura de variables:
         - La primera letra en min�scula, con la primera letra de cada palabra subsiguiente en may�scula.
         - Evita caracteres especiales y n�meros en los nombres de las variables.
      */

      /* DATOS PRIMITIVOS */

      // Tipos enteros:
      byte  numeroByte  = 50;         // Rango de -128 a 127.
      short numeroShort = 50;         // Rango de -32,768 a 32,767.
      int   numeroInt   = 50;         // Rango de -2^31 a 2^31 - 1.
      long  numeroLong  = 50L;        // Rango de -2^63 a 2^63 - 1.  // Debe terminar con una "L" al final del valor

      // Tipos de punto flotante:
      float  numeroFloat  = 50.5f;    // Rango de aproximadamente �3.4e-38 a �3.4e+38.  Debe terminar con una "f" al final del valor
      double numeroDouble = 50.5;     // Rango de aproximadamente �1.7e-308 a �1.7e+308.


      // Tipo booleano:
      boolean booleano = true; // Representa verdadero (true) o falso (false).

      // Tipo de car�cter:
      char caracter = 'A'; // Representa un solo car�cter Unicode.

      /* DATOS DE OBJETO */

      // String: Representa una secuencia de caracteres.
      String texto = "Hola, mundo!";

      // Arrays: Java tambi�n proporciona soporte para arreglos.
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
         - {} Indican el inicio y final de un bloque de c�digo.
         - En Java, un m�todo es un bloque de c�digo que realiza una tarea espec�fica y puede ser invocado desde otras partes del programa.
         - Los m�todos se utilizan para dividir el c�digo en fragmentos m�s peque�os y manejables, lo que facilita la lectura, la reutilizaci�n y el mantenimiento del c�digo.
         - Un m�todo puede tener cero o m�s par�metros, que son valores que se pasan al m�todo para que realice su tarea.
         - Un m�todo puede devolver un valor (o ning�n valor) despu�s de completar su tarea. Este valor de retorno tiene un tipo de datos asociado.
         - Algunos m�todos est�n predefinidos en las clases de Java (como println() en la clase System), mientras que otros m�todos pueden ser definidos por el usuario.
         
         Ejemplo de c�mo usar un m�todo predefinido:
      */
         
      public class EjemploMetodo {
         public static void main(String[] args) {
            String mensaje = "�Hola, mundo!";
            
            // Utilizamos el m�todo println() para imprimir el mensaje en la consola.
            System.out.println(mensaje);
         }
      }

   }
}
