public class PrimitivosFloat {

    //Al definir una variable de clase esta no necesita inicializarse
    static float varFloatClass;
    public static void main(String[] args) {
        // Todas las variables locales de los metodos deben ser inicizaliadas
        float realFloat1 = 1.0f;
        float realFloat2 = 2120.0f;
        //Mantiza, exponente y valor
        float realFloat3 = 2.12e3f;  // esto es lo mismo que 2120.0;
        float realFloat4 = 1.5e4f;  // esto es lo mismo que 15000;
        //Notación Cientifica
        float realFloat5 = 1.5e-10f;  // esto es lo mismo que 0.00000000015
        //valor real
        float realFloat6 = 0.00000000015f;  // esto es lo mismo que 1.5e-10f
        System.out.println(realFloat1);
        System.out.println(realFloat2);
        System.out.println(realFloat3);
        System.out.println(realFloat4);
        System.out.println(realFloat5);
        System.out.println(realFloat6);
        //Validaciones con la clase float
        System.out.println("Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Float corresponde en bites a: " + Float.SIZE);
        System.out.println("Máximo valor para Float: " + Float.MAX_VALUE);
        System.out.println("Minimo valor para Float: " + Float.MIN_VALUE);

        //revisión de valores dobles
        //El valor por defecto cuando encuentra punto se considera doble
        double realDouble =  3.4028235E38;
        System.out.println(realDouble);
        //Validaciones con la clase float
        System.out.println("Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Double corresponde en bites a: " + Double.SIZE);
        System.out.println("Máximo valor para Double: " + Double.MAX_VALUE);
        System.out.println("Minimo valor para Double: " + Float.MIN_VALUE);


        //revisión con la variable var, la cual se adapta al valor que se agregue
        var varDouble = 3.1416;  //Double
        System.out.println("varDouble " + varDouble);
        var varFlotante = 3.1416f;  //float
        System.out.println("varDouble " + varFlotante);
        var varInteger = 3;  //integer
        System.out.println("varDouble " + varInteger);
        var varLong = 31416l;  //long
        System.out.println("varDouble " + varLong);
        System.out.println("Variable de clase  varFloatClass: " + varFloatClass);
    }
}
