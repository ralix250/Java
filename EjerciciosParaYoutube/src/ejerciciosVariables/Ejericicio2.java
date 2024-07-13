package ejerciciosVariables;

import java.util.Scanner;

public class Ejericicio2 {

   public static void main(String[] args) throws Exception {

      Scanner miEScanner = new Scanner(System.in);
      System.out.println("Ingrese el radio del circulo.");
      //Obtiene dato del radio
      double radio = miEScanner.nextDouble();
      //Calculo del area
      double areaCirculo = Math.PI * (Math.pow( radio, 2 ));
      System.out.println("El area del circulo es: " + areaCirculo);
   }
}
