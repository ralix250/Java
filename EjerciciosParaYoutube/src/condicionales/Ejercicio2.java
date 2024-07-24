package condicionales;
import java.util.Scanner;

public class Ejercicio2 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese 2 numeros, y el programa valida si son divisibles entre 2 y 5");
      
      System.out.println("Ingrese primer numero ...");
      int num1 = sc.nextInt();
      System.out.println("Ingrese segundo numero ... \n Debe ser un numero diferente al primero");
      int num2 = sc.nextInt();

      if (num1==num2) {
         System.out.println("Los numeros no deben ser iguales, bye");
         System.exit(0);   //Ejecuta un fin del programa
      } 

      if (num2 > num1) num1 = num2;

      if (num1%2==0) System.out.println("Numero es par");
      else System.out.println("Numero no es par");

      if (num1%5==0) System.out.println("Numero es divisible entre 5");
      else System.out.println("Numero no es divisible entre 5");
   }

}
