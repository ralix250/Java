package bucles;

import java.util.Scanner;

public class Ejercicio4 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num0 = 0;
      int num1 = 1;
      int aux;
      
      System.out.println("Calculemos la serie de Fibonnaci, ¿Cuantos numeros quieres que calcule?");
      int cantidad = sc.nextInt();

      for(int i=0; i< cantidad; i++){
         if (i == 0) System.out.print("0");
         else if(i == 1) System.out.print("1");
         else {
            System.out.print(num0+num1);
            aux=num0+num1;
            num0 = num1;
            num1 = aux;
         }
         if (i!= cantidad-1)System.out.print(", ");
      }
   }
}
