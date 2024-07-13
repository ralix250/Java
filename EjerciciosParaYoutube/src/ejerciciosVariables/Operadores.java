package ejerciciosVariables;

public class Operadores {
    public static void main(String[] args) throws Exception {

        double num1=5;
        double num2=10;
        double num3=30;

        double resultado;

        /* Bloque de comentarios
         * OPERADORES ARITMETICOS
         */
        resultado = num1 + num2;
        // Otra forma de hacer una suma es num1+=num2;
        System.out.println(resultado);
        resultado = num1 - num2;
        // Otra forma de hacer una resta es num1-=num2;
        System.out.println(resultado);
        resultado = num1 * num2;
        // Otra forma de hacer una multiplicación es num1*=num2;
        System.out.println(resultado);
        resultado = num1 / num2;
        // Otra forma de hacer una división es num1/=num2;
        System.out.println(resultado);
        //modulo
        resultado = num1 % num2;
        System.out.println(resultado);
        // ++ es el incremento de 1 para la variable
        resultado++;
        System.out.println(resultado);
        // -- es el decremento de 1 para la variable
        resultado--;
        System.out.println(resultado);

        /*
         * OPERADORES RELACIONALES
         */
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2); 
        System.out.println(num1 == num2);  //Igual?
        System.out.println(num1 != num2);  //Diferente a
        System.out.println(num1 == num2 && num1!= num3 );  //&& para indicar un AND
        System.out.println(num1 == num2 || num1!= num3 );  //|| para indicar un OR
    }
}
