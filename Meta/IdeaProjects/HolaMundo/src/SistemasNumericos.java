public class SistemasNumericos {
    public static void main(String[] args) {
        int numericoDecimal = 500;
        System.out.println("numeroDecimal = " + numericoDecimal);
        System.out.println("numero binario de " + numericoDecimal + " = " + Integer.toBinaryString(numericoDecimal));
        // Java incorporó el prefijo 0b en la versión 7 para representar números binarios.
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        
        //Convención heredada de lenguajes más antiguos como C, que también emplean un 0 inicial para identificar números en octal. 
        System.out.println("numero octal de " + numericoDecimal + " = " + Integer.toOctalString(numericoDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //0x fue adoptado para señalar hexadecimal y se usa seguido de los dígitos hexadecimales (0-9 y A-F)
        System.out.println("numero hexadecimal de " + numericoDecimal + " = " + Integer.toHexString(numericoDecimal));
        int numeroHexadecimal1 = 0764;
        int numeroHexadecimal2 = 0x1F4;
        System.out.println("numeroHexadecimal1 = " + numeroHexadecimal1);
        System.out.println("numeroHexadecimal2 = " + numeroHexadecimal2);
    }
}
