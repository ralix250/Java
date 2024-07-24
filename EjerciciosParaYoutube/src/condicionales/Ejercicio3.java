package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

   public static void main(String[] args) {
      // Solicita una cifra y muestra en pantalla el primer y ultimo digito del valor ingresado
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite un numero (positivo y maximo 5 cifras)");

      int num = sc.nextInt();
      int aux = num;

      if ( num < 0  || num > 99999 ) {
         System.out.println("Aprende numeros, obedece indicaciones");
         System.exit(0);
      }

      System.out.println("La ultima cifra del numero " + num + " es " + ( num % 10 ) );

      if ( num < 10 ) System.out.println("La primer cifra es la misma que la ultima");
      else if ( num < 100 ) {
         aux/=10;
         System.out.println("La primer cifra del numero " + num + " es " + (aux%10));
      } else if ( num< 1000 ){
         aux/=100;
         System.out.println("La primer cifra del numero " + num + " es " + (aux%10));
      } else if ( num< 10000 ){
         aux/=1000;
         System.out.println("La primer cifra del numero " + num + " es " + (aux%10));
      } else {
         aux/=10000;
         System.out.println("La primer cifra del numero " + num + " es " + (aux%10));
      }
   }
}
