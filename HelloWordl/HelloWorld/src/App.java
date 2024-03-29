public class App {
   public static void main(String[] args) throws Exception {
      // Hola mundo!
      System.out.println("Hello, World!");
      /* Segmento de comentarios
       * 
       * 
      */
      //Creando variable string
      String myString = "Esto es una cadena de texto";
      myString = "Aqui cambio el valor de la cadena de texto";
      System.out.println(myString);
      //Creando variable integer
      int myInt = 7;
      //Clase Integer
      Integer myInt1 = 7;
      myInt1 = myInt1 + 4;
      System.out.println(myInt1 - 1);
      //Numero con decimales
      Double myDouble = 6.5;
      System.out.println(myDouble);
      //Float
      Float myFloat = 6.5f;
      System.out.println(myFloat);
      //Suma de float + double
      System.out.println(myFloat + myDouble);
      //Suma de float + double + integer
      System.out.println(myFloat + myDouble + myInt1);
      //Booleanos
      Boolean myBolean = true;
      System.out.println(myBolean);
      //null
      myBolean = null;
      System.out.println(myBolean);
   }
}
