package ejerciciosVariables;

import java.util.Scanner;

public class Ejercicio3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa numero y mostrare la tabla de multiplicar has el 10");

      int num = sc.nextInt();
      System.out.println(num + "x1 = " + num );
      System.out.println(num + "x2 = " + num*2 );
      System.out.println(num + "x3 = " + num*3 );
      System.out.println(num + "x4 = " + num*4 );
      System.out.println(num + "x5 = " + num*5 );
      System.out.println(num + "x6 = " + num*6 );
      System.out.println(num + "x7 = " + num*7 );
      System.out.println(num + "x8 = " + num*8 );
      System.out.println(num + "x9 = " + num*9 );
      System.out.println(num + "x10 = " + num*10 );
   }
}
