package teoria;

public class Hilos {

      public static void main(String[] args) {
         /*     NOTAS
          * Hilos: permiten realizar varios procesos al mismo tiempo
          * el uso de nuclos del CPU permite el procesamiento de task
          */

         //ejemplo de bucle sin hilos
         for(int i=0; i<10;i++){
            System.out.println("Soy el bucle 1");
         }
         //ejemplo de bucle sin hilos
         for(int i=0; i<10;i++){
            System.out.println("Soy el bucle 2");
         }
         System.out.println("Comenzamos con el uso de las clases");
         //se genera un objeto de nombre hilo1 con las caracteristicas
         //de la clase Hilo1
         Hilo1 hilo1 = new Hilo1();
         //Se instancia y se solicita ejecutar el metodo start()
         hilo1.start();
         
         //se genera un objeto de nombre hilo1 con las caracteristicas
         //de la clase Hilo1
         Thread hilo2 = new Thread( new Hilo2());
         hilo2.start();
      }
}

// La nueva clase Hilo1 hereda caracteristicas de Thread
/*    NOTA
 *  Java solo permite heredar de una clase, por lo cual
 * no es posible generar una segunda clase que herede de Thread
*/
class Hilo1 extends Thread{
   public void run(){
      for(int i=0; i<1000 ;i++){
         try {
            Thread.sleep(20);
            System.out.println("Soy el bucle de la clase hilo1");
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
}

//Implementa la interface Runnable
// Java permite que se implementen todas las interfaces que sean necesarias
// Se recomienda usar la implementacin de interfaces
class Hilo2 implements Runnable{
   public void run(){
      for(int i=0; i<1000 ;i++){
         try {
            Thread.sleep(20);
            System.out.println("Soy el bucle de la clase hilo2");
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
}