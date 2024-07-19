package teoria;

import java.util.Scanner;

public class Bucles {
   public static void main(String[] args) {
   // Bucle determinado, sabemos la cantidad exacta 
      System.out.println("Contador; condición; Incremental");
      for(int i = 0;   i < 10;  i++ ){
         System.out.println("Hola");
      }
      System.out.println("Adios");
      System.out.println("Bucle decremental 1 en 1");
      for(int i = 10;   i > 0;  i-- ){
         System.out.println(i);
      }
      System.out.println("Adios");
      System.out.println("Bucle decremental 2 en 2");
      for(int i = 10;   i > 0;  i-=2 ){
         System.out.println(i);
      }
      System.out.println("Adios");
      System.out.println("Ejemplo recorrido de arreglo");
      int[] miArray = {1,2,3,4,5};
      //recorrido del arreglo for each
      for(int n:miArray )System.out.println(n);
      // Bucle indeterminado, no sabemos la cantidad exacta
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa una contraseña ...");
      String pass = sc.nextLine();
      // Primero haz la validación y si se cumple realiza el codigo
      while(!pass.equals("1234")){
         System.out.println("Contraseña incorrecta. Prueba de nuevo");
         pass = sc.nextLine();
      }
      System.out.println("Bienvenido a tu perfil. Has vuelto");
      //Ejemplo do while
      System.out.println("Ejemplo de bucle indefinido");
      do{
         System.out.println("Solicito la contraseña ...");
         pass = sc.nextLine();
      } while(!pass.equals("1234"));
   }
}
