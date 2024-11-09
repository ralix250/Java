public class PrimitivosCaracteres {
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

        char espacio      = ' ';      // Espacio en blanco
        char espacio1     = '\u0020'; // Espacio en blanco (usando código Unicode)
        char retroceso    = '\b';     // Retroceso (elimina el último carácter en algunas consolas)
        char tabulador    = '\t';     // Tabulador horizontal (avanza varias posiciones)
        char nuevaLinea   = '\n';     // Nueva línea (salta a la línea siguiente)
        char retornoCarro = '\r';     // Retorno de carro (vuelve al inicio de la línea actual)


        //Clase equivalente a char
        /*   Si se utiliza un /t directamente en el codigo se toma como un caracter especial
        System.out.println("char corresponde en \t byte: " + Character.BYTES);
        */
        /*  Se utilizan para obtener el separador de línea del sistema
            Windows utiliza \r\n como separador de líneas.
            Linux y macOS utilizan \n.
        */
        System.out.println("char valor maximo: " + System.getProperty("lineSeparator") + Character.BYTES);
        System.out.println("char valor maximo: " + System.lineSeparator() + Character.BYTES);  //Mas usado hoy día
    }
}
