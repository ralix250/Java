import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        //Instancia de un objeto de la clase scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número entero");
        
        int numeroDecimal = 0;
        try{
            //intenta ejecutar el código dentro
            numeroDecimal = scanner.nextInt();
        //} catch (InputMismatchException e){
        } catch (Exception e){
            //Si algo sale mal, específicamente si se lanza una excepción de tipo NumberFormatException
            /* 
             * InputMismatchException: Manejo específico de errores de tipo de entrada.
             *      catch (InputMismatchException e) es específica para un tipo de error
             * Exception: Úsala como último bloque catch en un bloque try con múltiples capturas, para manejar cualquier excepción inesperada que no hayas anticipado.
             *      catch (Exception e) es más general y cubre todas las excepciones posibles.
            */

            System.out.println("Valor no es númerico ");
            /*Llama al método main de nuevo (se asume que args es el mismo que los argumentos pasados a main).
            Esto hace que el programa se reinicie, volviendo a pedir la entrada al usuario,*/
            main(args);
            //Cierra el programa por completo con un código de salida 0
            System.exit(0);
        }

        String resultadoBinario = ("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        String resultadoOctal   = ("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        String resultadoHexa    = ("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        String mensaje  = resultadoBinario;
               mensaje += "\n" + resultadoOctal;
               mensaje += "\n" + resultadoHexa;
        System.out.println(mensaje);
    }
}
