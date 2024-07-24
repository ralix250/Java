package bucles;

import java.util.Scanner;

public class Ejercicio1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Genera la tabla del numero indicado del 1 al 10 \n Ingresa un numero ...");
      int num = sc.nextInt();

      for(int i = 1; i <= 10; i++){
         System.out.println(num + " x " + i + " = " + (num*i) );
      }

   }
}
