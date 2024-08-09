package bucles;

import java.util.Scanner;

public class Ejercicio2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int base, altura;
      //Solicitud de datos
      System.out.println("Dibujar un rectangulo.");
      System.out.println("Ingrese altura");
      altura = sc.nextInt();
      System.out.println("Ingrese base");
      base = sc.nextInt();
      //Pinta el rectangulo relleno
      //for( int i = 0; i < altura; i++ ) {
      //   for( int j = 0; j < base; j++ ) {
      //      System.out.print("*");
      //   }
      //   System.out.println("");
      //}
      //System.out.println("");
      //Pinta contorno del rectangulo
      for( int i = 0; i < altura; i++ ) {
         for( int j = 0; j < base; j++ ) {
            if (i == 0 || i == (altura - 1)) System.out.print("*");
            else {

               if (j == 0 || j == (base -1))System.out.print("*");
               else {
                  System.out.print(" ");
               }
            }
         }
         System.out.println("");
      }
   }
}
