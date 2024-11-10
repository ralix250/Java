import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
/*
 * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
    Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
    Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
    Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
    Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
    
    Por ejemplo, el resultado podría ser algo así:
        La factura producto de oficina tiene un total bruto de 134.78, 
        con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882

    IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales, 
        no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega 
        final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y 
        todas traen incluidas el código de solución.
        Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con 
        checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso 
        ni el instructor, así es como funciona la plataforma de Udemy.

    Preguntas de esta tarea
        Envía y publica acá tu código fuente del requerimiento (la clase main), 
        pero también es importante que lo realices en tu equipo con el IDE y pruebes antes de enviarlo.
 */
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de facturación RALIX");
        // Variables
        Scanner scanner = new Scanner(System.in);
        String nombreFactura;
        //precios
        double precio1 = 0, precio2 = 0;
        //Totales
        double totalBruto = 0, totalFactura = 0;
        //Impuestos
        double IVA = 0.19, impuestos = 0;
        // Solicitud de datos de entrada
        try{
            System.out.println("Informe el precio del articulo 1: ");
            precio1 = scanner.nextDouble();
            System.out.println("Informe el precio del articulo 2: ");
            precio2 = scanner.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("Valor informado incorrecto, reingrese datos");
            main(args);
            System.exit(0);
        }
        System.out.println("Calculando total, se agrega IVA al 19% ");
        //Calculos
        DecimalFormat formato = new DecimalFormat("#.##");
        totalBruto = precio1 + precio2;
        impuestos  = totalBruto * IVA;
        totalFactura = totalBruto + impuestos;
        System.out.println("..... ");
        System.out.println(".... ");
        System.out.println("... ");
        System.out.println(".. ");
        System.out.println(". ");
        System.out.println("La factura de los articulos tiene un total bruto de $"+ formato.format(totalBruto) + " \r\n" + 
                            "con un impuesto de $" + formato.format(impuestos) + 
                            " y el monto después de impuesto es de $" + formato.format(totalFactura));
    }
}
