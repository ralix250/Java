public class EjemploStringConcatenacion {
   public static void main(String[] args) {
      String curso = "Programación Java";
      String profesor = "Rafael Flores";
      String detalle = curso + " con el instructor " + profesor;
      System.out.println(detalle);

      int numeroA = 10;
      int numeroB = 5;
      //Las expresiones de evaluan de Izquierda a Derecha
      /*
       * Es la forma más sencilla y legible.
       * Java lo optimiza internamente en tiempo de compilación cuando el código es simple (pocos elementos concatenados).
       * Se recomienda para concatenaciones rápidas y simples (por ejemplo, para combinar unos pocos valores o en sentencias
       */
      System.out.println(detalle + " " + numeroA + numeroB);
      //Los parentesis tienen prioridad de precendencia
      System.out.println(detalle + " " + (numeroA + numeroB));
      System.out.println(numeroA + numeroB + detalle);
      //Los string son inmutables
      /*
       * Ideal cuando trabajas con String sin variables de tipo primitivo, ya que concat() solo acepta otros String.
       * Puede ser un poco más eficiente en términos de rendimiento cuando concatenas varios String, ya que concat() directamente crea un nuevo String en lugar de realizar conversiones.
       * Es útil para cadenas largas y múltiples concatenaciones encadenadas.
      */
      String detalle2 = curso.concat(profesor);
      System.out.println(detalle2);
      String detalle3 = curso.concat(" con ".concat(profesor));
      System.out.println(detalle3);
      String detalle4 = curso.concat(" con ").concat(profesor);
      System.out.println(detalle4);
   }
}
