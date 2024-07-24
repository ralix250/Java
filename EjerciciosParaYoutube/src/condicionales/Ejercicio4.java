package condicionales;

import java.util.Scanner;

/*
 * Ejercicio costo Entradas
 * Calcula el previo de boletos de cine dependiendo de la siguiente función
 * precio normal $8, miercoles $5 y jueves 2x1, si presenta tarjeta 10% de descuento total
 * Datos a solicitar: Total de boletos, día y si tiene tarjeta
 */
public class Ejercicio4 {

   public static void main(String[] args) {
      System.out.println("Bienvenido \n Calcula el costo de tus boletos");
      //Ingreso de datos
      Scanner sc = new Scanner(System.in);
      System.out.println("¿Cuantos boletos vas a comprar?");
      int boletos = sc.nextInt();
      sc.nextLine();
      System.out.println("¿Que día los necesitas?");
      String dia = sc.nextLine();
      System.out.println("¿Cuentas con tarjeta? (S/N)");
      String tarjeta = sc.nextLine();

      // Validaciones
      int costo = 0;
      int aux_boletos = 0;
      int previo = 0;
      double total = 0.0;
      // Nota para comparar texto se usa equals("texto_comparar")
      if ( dia.toLowerCase().equals("miercoles")) {
         costo = 5;
      } else {
         costo = 8;
      }

      if ( boletos%2 == 0 ){
         aux_boletos = boletos/2;
      }else {
         aux_boletos = ( boletos/2 ) + 1;
      }
      System.out.println("boletos a cobrar["+aux_boletos+"], costo del boleto["+costo+"]");
      previo = costo * aux_boletos;
      total = previo;
      if ( tarjeta.toUpperCase().equals("S") ) {
         total = ( previo * 0.90 );
      }
      System.out.println("Total de boletos es: "+ boletos +" y el total de tu compra es de: $" + total);
   }
}
