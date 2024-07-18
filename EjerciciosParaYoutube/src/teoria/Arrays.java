package teoria;

public class Arrays {
   public static void main(String[] args) {
      // Formas de declarar un array
      int[] arrayInt1;
      int arrayInt2[];
      arrayInt1 = new int[5];
      arrayInt2 = new int[10];
      int arrayInt3[] = {1,2,3,4,5,6,7,8,9};
      // Arreglo bidimencional
      int arrayInt4[][] = new int [2][3];

      arrayInt1[0] = 10;
      arrayInt2[0] = 20;
      arrayInt1[1] = 11;
      arrayInt2[1] = 21;
      arrayInt1[2] = 12;
      arrayInt2[2] = 22;
      arrayInt1[3] = 13;
      arrayInt2[3] = 23;
      arrayInt1[4] = 14;
      arrayInt2[4] = 24;
      arrayInt4[0][0] = 100;
      arrayInt4[0][1] = 200;
      arrayInt4[0][2] = 300;

      System.out.println("El valor del arreglo 1 es: " + arrayInt1[0]);
      System.out.println("El valor del arreglo 2 es: " + arrayInt2[0]);
      System.out.println("El valor del arreglo 3 es: " + arrayInt3[0]);
      System.out.println("El valor del arreglo 4 es: " + arrayInt4[0][1]);
   }
}
