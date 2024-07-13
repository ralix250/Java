import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
   public static void main(String[] args) throws Exception {
      // Hola mundo!
      System.out.println("Hello, World!");
      /* Segmento de comentarios
       * 
      */
      //Creando variable string
      // si se escribe "final" en una variable se vuelve una constante
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
      //Condicional if
      myFloat = null;
      if (myFloat != null){
         System.out.println("Mi float es distinto de nulo");
      } else {
         System.out.println("Mi float es nulo");
      }
      /*Condicion if; 
       * == se usa para comparar valores; 
       * = se usa para asignar valor
      */
      if (myInt == 11) {
         System.out.println("myInt = 11");
      } else if (myInt == 12) {
         System.out.println("myInt = 12");
      } else {
         System.out.println("El valor no es ni 11 o 12");
      }
      // Estructuras
      /* Listas
      * Cuando se usa new es para crear nuevas clases
      * add es para agregar información a la lista
      */
      @SuppressWarnings("rawtypes")
      List myList = new ArrayList();
      myList.add(myString);
      myList.add(myInt);
      System.out.println(myList);
      /*Si a la lista se define <TipoDato> 
       * solo se puede agregar ese tipo 
      */
      List<String> myList1 = new ArrayList();
      myList1.add(myString);
      //la clase .toString() solo funciona con datos tipo clase como String y no con int
      myList1.add(myInt1.toString());
      /* MAPAS
      * Serie de valores que funcionan con la estructura clave-valor
      * put es para agregar información al mapa
      */
      Map<String, String> myMap = new HashMap();
      myMap.put("string", myString);
      myMap.put("int", myInt1.toString());
      System.out.println(myMap);
      System.out.println(myMap.get("int"));
      /* Ciclos
      * iteracion de valores
      */
      System.out.println("Comienza el for");
      for(int index = 0; index < myList1.size();index++){
         System.out.println(myList1.get(index));
      }
      Main myMain = new Main();
      myMain.myFunction(4, 1);
      myMain.myFunction(4, 12121);
   }
   /* Funciones
   * Agrupación de codigo que puede repetirse más de una vez
   */
      public void myFunction(int myFirstNumber, int mySecundNumber){
         System.out.println(myFirstNumber + mySecundNumber);
      }
}
