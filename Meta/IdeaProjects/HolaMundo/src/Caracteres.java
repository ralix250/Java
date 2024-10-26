public class Caracteres {
/*
 * Todos los tipos primitivos tienen clases equivalentes
 */
    public static void main(String[] args) {
        //Para char se usan comillas simples, para string comilla doble
        char caracter = 'a';
        //representación en forma decimal
        char caracter2 = '\u0040';
        //representación en forma unicode
        char decimal = 64;
        //directo
        char arroba = '@';
        // Estandar de codificación unicode
        System.out.println("caracter: " + caracter);
        System.out.println("caracter: " + caracter2);
        System.out.println("decimal: "  + decimal);
        System.out.println("decimal = caracter2: "+ (decimal == caracter2) );
        System.out.println("arroba: " + arroba);

        //uso de var
        var variableChar = '@';
        System.out.println("variableChar: " + variableChar);

        //Clase equivalente a char
        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bytes: " + Character.SIZE);
        System.out.println("char valor minimo: " + Character.MAX_VALUE);
        System.out.println("char valor maximo: " + Character.MIN_VALUE);
    }
}
