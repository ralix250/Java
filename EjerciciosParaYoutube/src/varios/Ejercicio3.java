package varios;

import java.util.Scanner;

public class Ejercicio3 {

   public static void main(String[] args) {
      System.out.println("Adivina un numero entre el 1 y el 100, tienes 10 intentos");
      Scanner sc = new Scanner(System.in);
      int aleatorio,intentos,num;
      intentos = 10;
      aleatorio = (int) (Math.random() * 100) + 1;
      for( int i = 1; i <= intentos; i++ ){
         System.out.println("Intento " + i + " dame un numero: ");
         num = sc.nextInt();
         if (num == aleatorio){
            System.out.println("Has adivinado...");
            break;
         } else {
            if (i == intentos){
               System.out.println("El numero era: " + aleatorio);
            } else {
               if (num > aleatorio) System.out.println("El numero ingresado es mayor, intenta de nuevo");
               if (num < aleatorio) System.out.println("El numero ingresado es menor, intenta de nuevo");
            }
         }
         
      }
   }
}
