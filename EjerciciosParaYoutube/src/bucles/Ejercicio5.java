package bucles;

import java.util.Scanner;

//Recibir un numero y escribirlo en la salida al reves
public class Ejercicio5 {
   public static void main(String[] args) {
   /* opción 1
      Scanner sc = new Scanner(System.in);
      int contador = 0;
      System.out.println("Dame un numero y escribire las cifras al reves");
      long valor = sc.nextLong();
      long numReverso = 0;
      while(valor!=0){
         
         numReverso = (numReverso*10) + (valor%10);
         
         valor/=10;
         
         contador++;
      }
      System.out.println("El numero al reves es " + numReverso + ".\n Tiene " + contador + " cifras.");
   */

   /* OPCIÓN 2 */
      Scanner sc = new Scanner(System.in);
      int contador = 0;
      String valor;
      String alReves;

      System.out.println("Dame un numero y escribire las cifras al reves");
      valor = sc.nextLine();
      int longitud = valor.length();

      alReves = "";
      for (int i = longitud-1; i>= 0; i-- ){
         alReves += valor.charAt(i);
         contador++;
      }
      System.out.println("El numero al reves es " +alReves+ " y la cantidad de caracteres son: " + contador );
   }
}
