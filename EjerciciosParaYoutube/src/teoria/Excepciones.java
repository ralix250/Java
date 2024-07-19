package teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingresa un numero entero y positivo.");

      try{
         
         int num = sc.nextInt();
         // throw indica que lance una excepciùn a peticiùn del usuario
         if (num<0) throw new Exception();
      /*     Nota
      * La clase padre de InputMismatchException es Exception
      *  por lo cual colocando solo Exception se consideran todos
      *  los posibles errores
      */ 
      //} catch(InputMismatchException e){
      } catch(Exception e){
         
         System.out.println("Valor ingresado es incorrecto");
         e.printStackTrace();
      }

      System.out.println("Salimos del bloque try catch");
      
      /*     NOTA
      * llamar a ejecutar el metodo introduceNumero();
      * devolvera un error por no controlar una excepcion.
      * Todos los metodos que lancen excepciones verificadas (Exception)
      * deben ser controladas por un bloque try catch, las excepciones
      * no verificadas no necesitan ser controladas con un bloque
      */
      try {
         introduceNumero();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         System.out.println("Fallo todo, ya se rompio");
      }
   }
   public static void introduceNumero() throws Exception{
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingresa un numero entero y positivo.");
      int num = sc.nextInt();
      System.out.println("El numero introducido es: " + num);
   }
}
