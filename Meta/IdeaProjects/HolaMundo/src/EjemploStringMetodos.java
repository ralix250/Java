public class EjemploStringMetodos {

   public static void main(String[] args) {

      String nombre = "Rafael Flores";

      System.out.println("nombre.lenght["+nombre.length()+"]");
      System.out.println("nombre.toUpperCase["+nombre.toUpperCase()+"]");
      System.out.println("nombre.toLowerCase["+nombre.toLowerCase()+"]");
      System.out.println("nombre.equals(\"Rafael Flores\")["+nombre.equals("Rafael Flores")+"]");
      System.out.println("nombre.equals(\"rafael flores\")["+nombre.equals("rafael flores")+"]");
      System.out.println("nombre.equalsIgnoreCase(\"rafael flores\")["+nombre.equalsIgnoreCase("rafael flores")+"]");
      System.out.println("nombre.compareTo["+nombre.compareTo("Rafael Flores")+"]");
      System.out.println("nombre.compareTo["+nombre.compareTo("rafael flores")+"]");
      System.out.println("nombre.charAt(0)["+nombre.charAt(0)+"]");
      System.out.println("nombre.charAt(1)["+nombre.charAt(1)+"]");
      System.out.println("nombre.charAt(2)["+nombre.charAt(2)+"]");
      System.out.println("nombre.charAt(10)["+nombre.charAt(10)+"]");
      System.out.println("nombre.charAt(nombre.length()-1)["+nombre.charAt(nombre.length()-1)+"]");

      System.out.println("nombre.substring(0)["+nombre.substring(0)+"]");
      System.out.println("nombre.substring(1)["+nombre.substring(1)+"]");
      System.out.println("nombre.substring(1, 4)["+nombre.substring(1, 4)+"]");
      System.out.println("nombre.substring(1, 12)["+nombre.substring(1, 12)+"]");
      //System.out.println("nombre.["+nombre.+"]");
      //System.out.println("nombre.["+nombre.+"]");
   }
}
