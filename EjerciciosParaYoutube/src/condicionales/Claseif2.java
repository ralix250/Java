package condicionales;
import java.util.Scanner;

public class Claseif2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce un punto cardinal ...");

      String cardinal = sc.nextLine();

      switch (cardinal.toLowerCase()) {
         case "norte":
            System.out.println("Te diriges al Norte.");
            break;
         case "sur":
            System.out.println("Te diriges al Sur.");
            break;
         case "Este":
            System.out.println("Te diriges al Este.");
            break;
         case "Oeste":
            System.out.println("Te diriges al Oeste.");
            break;
            
            default:
            System.out.println("No es direccion valida.");
            break;
      }
   }
}
