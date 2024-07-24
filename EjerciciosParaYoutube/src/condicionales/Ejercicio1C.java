package condicionales;
import java.util.Scanner;

public class Ejercicio1C {
   public static void main(String[] args) {
      /*    FUNCIONAMIENTO
       * Solicitar 3 calificaciones
       * Obtener el promedio
       * Indicar "reprobado(< 5), aprobado(8 y 9) o sobresaliente (10)"
       */
      //Solicitar 3 calificaciones
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa primer calificacion");
      double num1 = sc.nextDouble();
      System.out.println("Ingresa segunda calificacion");
      double num2 = sc.nextDouble();
      System.out.println("Ingresa tercera calificacion");
      double num3 = sc.nextDouble();
      //Obtener el promedio
      double promedio = (num1 + num2 + num3) / 3;
      System.out.println("Tu promedio es de " + promedio);
      // NOTA: el switch no puede trabajar con numeros con decimales
      //      Todo lo que se pede hacer con un switch se puede hacer con un if
      //      No todo lo que se pede hacer con un if se puede hacer con un switch
      if ( promedio < 5) {
         System.out.println("Reprobado. Esfuerzate más la proxima vez");
      } else if ( promedio < 6) {
         System.out.println("Suficiente. Al menos no reprobaste");
      } else if ( promedio < 7) {
         System.out.println("Bueno.Puedes mejorar aun más");
      } else if ( promedio < 9) {
         System.out.println("Notable. Eso campeon");
      } else if ( promedio < 10) {
         System.out.println("Sobresaliente. Que orgullo");
      } else if ( promedio == 10) {
         System.out.println("Barbaro. Lo tuyo es el exito");
      } else {
         System.out.println("Estoy decepcionado de ti, la trampa no es buena");
      }


   }
}
