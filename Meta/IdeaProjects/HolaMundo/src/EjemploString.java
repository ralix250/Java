public class EjemploString {

   public static void main(String[] args) {
      //Objeto tipo String
      String curso = "Programación Java";
      //Paso de argumento en el constructor
      String curso2 = new String("Programación Java");
      // Validación de atributos (Compara Objetos)
      boolean esIgual = (curso == curso2);
      System.out.println("curso == curso2["+esIgual+"]");
      //Validación por contenido
      esIgual = curso.equals(curso2);
      System.out.println("curso.equals(curso2)["+esIgual+"]");
      //función para comparar sin importar mayusculas o minusculas
      curso2 = new String("programación java");
      esIgual = curso.equalsIgnoreCase(curso2);
      System.out.println("curso.equalsIgnoreCase(curso2)["+esIgual+"]");
      //Compara instancia entre objetos
      String curso3 = "Programación Java";
      esIgual = (curso == curso3);
      System.out.println("curso == curso3["+esIgual+"]");
   }
}
