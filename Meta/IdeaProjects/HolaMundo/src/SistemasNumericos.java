import javax.swing.JOptionPane;

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

        //Entrada de datos desde ventana de dialogo INTERFAZ GRAFICA
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        //Manejo de errores con try catch
        int numeroDecimal2 = 0;
        try{
            //intenta ejecutar el código dentro
            numeroDecimal2 = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            //Si algo sale mal, específicamente si se lanza una excepción de tipo NumberFormatException
            JOptionPane.showMessageDialog(null, "Valor no es númerico ");
            /*Llama al método main de nuevo (se asume que args es el mismo que los argumentos pasados a main).
            Esto hace que el programa se reinicie, volviendo a pedir la entrada al usuario,*/
            main(args);
            //Cierra el programa por completo con un código de salida 0
            System.exit(0);
        }

        System.out.println("Número ingresado por el usuario; " + numeroDecimal2);

        System.out.println("numeroDecimal = " + numeroDecimal2);
        System.out.println("numero binario de " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2));
        // Java incorporó el prefijo 0b en la versión 7 para representar números binarios.
        int numeroBinario2 = numeroDecimal2;
        System.out.println("numeroBinario2 = " + numeroBinario2);
        
        //Convención heredada de lenguajes más antiguos como C, que también emplean un 0 inicial para identificar números en octal. 
        System.out.println("numero octal de " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2));
        int numeroOctal2 = 0764;
        System.out.println("numeroOctal2 = " + numeroOctal2);

        //0x fue adoptado para señalar hexadecimal y se usa seguido de los dígitos hexadecimales (0-9 y A-F)
        System.out.println("numero hexadecimal de " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal2));

        String  mensaje  = ("\n numero binario de " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2) );
                mensaje += ("\n numero octal de " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2) );
                mensaje += ("\n numero hexadecimal de " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal2) );
        JOptionPane.showMessageDialog(null, mensaje);

        //Restructura del codigo anterior como buenas practicas
        String mensajeBinario = ("numero binario de " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2));
        String mensajeOctal   = ("numero octal de " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2));
        String mensajeHexa    = ("numero hexadecimal de " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal2));
        String mensaje2  = mensajeBinario;
               mensaje2 += "\n" + mensajeOctal;
               mensaje2 += "\n" + mensajeHexa;
        JOptionPane.showMessageDialog(null, mensaje2);
    }
}
