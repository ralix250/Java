
public class Claseif1 {
   public static void main(String[] args) {
      int numero = 200;
      if (numero < 100 && numero > 50) {
         System.out.print("Condicion AND ");
         System.out.println("El numero escogido es: " + numero);
      } else if(numero > 100){
         System.out.println("El numero " + numero + " Es grandecito");
      } else {
         System.out.println("El numero " + numero + "no cumple con la condición");
      }
      
      if (numero < 100 || numero > 50) {
         System.out.print("Condicion OR ");
         System.out.println("El numero escogido es: " + numero);
      } 

      System.out.println("Fin del programa");
   }
}
