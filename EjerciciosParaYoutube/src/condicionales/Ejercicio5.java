package condicionales;

import java.util.Scanner;

/*
 * Piedra, papel, tijera, lagarto, spock
 */
public class Ejercicio5 {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("¿Que escoges... \n Piedra, Papel, Tijeras, Lagarto, Spock ?");
      String eleccion = sc.nextLine();

      int num = ( (int) (Math.random()*5)+1 );
      String eleccionVs;
      switch (num) {
         case 1:
            eleccionVs = "piedra";
            break;
         case 2:
            eleccionVs = "papel";
            break;
         case 3:
            eleccionVs = "tijeras";
            break;
         case 4:
            eleccionVs = "lagarto";
            break;
            default:
            eleccionVs = "Spock";
            break;
      
      }
      if (eleccion.toLowerCase().equals("piedra") && eleccionVs.equals("Tijeras")){
         System.out.println("Has ganado, Piedra rompe Tijeras");
      }
      if (eleccion.toLowerCase().equals("piedra") && eleccionVs.equals("Lagarto")){
         System.out.println("Has ganado, Piedra aplasta Lagarto");
      }
      if (eleccion.toLowerCase().equals("papel") && eleccionVs.equals("Piedra")){
         System.out.println("Has ganado, Papel envuelve Piedra");
      }
      if (eleccion.toLowerCase().equals("papel") && eleccionVs.equals("Spock")){
         System.out.println("Has ganado, Papel invalida Spock");
      }
      if (eleccion.toLowerCase().equals("tijeras") && eleccionVs.equals("Papel")){
         System.out.println("Has ganado, Tijeras cortan Papel");
      }
      if (eleccion.toLowerCase().equals("tijeras") && eleccionVs.equals("Lagarto")){
         System.out.println("Has ganado, Tijeras decapitan Lagarto");
      }
      if (eleccion.toLowerCase().equals("lagarto") && eleccionVs.equals("Papel")){
         System.out.println("Has ganado, Lagarto come papel");
      }
      if (eleccion.toLowerCase().equals("lagarto") && eleccionVs.equals("Spock")){
         System.out.println("Has ganado, Lagarto envenena a Spock");
      }
      if (eleccion.toLowerCase().equals("Spock") && eleccionVs.equals("Tijeras")){
         System.out.println("Has ganado, Spock rompe tijeras");
      }
      if (eleccion.toLowerCase().equals("Spock") && eleccionVs.equals("Piedra")){
         System.out.println("Has ganado, Spock vaporiza piedra");
      }else if (eleccion.toLowerCase().equals(eleccionVs.toLowerCase())){
         System.out.println("Empate, escogieron lo mismo");
      }else {
         System.out.println("Has perdido, elegiste " + eleccion + " y el contrincante eligio " + eleccionVs);
      }
   }
}
