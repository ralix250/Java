public class EjemploStringTestRendimientoConcat {
   public static void main(String[] args) {
      String a = "a";
      String b = "b";
      String c = a;
      StringBuilder sb = new StringBuilder(a);

      long inicio = System.currentTimeMillis();
      for (int i= 0; i<10000; i++){
         //c = c.concat(a).concat(b).concat("\n"); //500 => 1ms; 10,000 => 138ms
         //c += a + b + "\n"; //500 => 23ms; //1000 => 23ms; 10,000 => 71 ms
         sb.append(a).append(b).append("\n");  //500 => 1ms;  1000 => 2ms; 10,000 => 2ms
      }

      long fin = System.currentTimeMillis();
      System.out.println("c["+c+"]");
      System.out.println("sb["+sb.toString()+"]");
      System.out.println(fin - inicio);

   }

}
