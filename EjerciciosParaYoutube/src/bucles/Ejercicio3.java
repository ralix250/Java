package bucles;

import java.util.Scanner;
public class Ejercicio3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int contador  = 0;
      double sumaTotal = 0;
      double num;

      do{
         System.out.println("Introduce un numero. Si quieres salir, ingresa un numero negativo.");
         num = sc.nextDouble();
         if (num >= 0){
            contador++;
            sumaTotal+=num;
         }
      }while(num >= 0);
      System.out.println("Has introducido " + contador + " numeros. La media de todos es de " + sumaTotal/contador);
   }
}
