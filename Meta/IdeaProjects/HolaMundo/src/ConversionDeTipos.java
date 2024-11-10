public class ConversionDeTipos {

    public static void main(String[] args) {
        // *****  Conversión de string a tipos primitivos  ***** //
        //Conversión de String a Integer
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt: " + numeroInt);
        
        //Conversión de String a double
        String realStr1 = "98765.43";
        String realStr2 = "9876543e-3";
        double realDouble1 = Double.parseDouble(realStr1);
        double realDouble2 = Double.parseDouble(realStr2);
        System.out.println("realDouble1: " + realDouble1);
        System.out.println("realDouble2: " + realDouble2);
        
        //Conversión de String a boolean
        String logicoStr1 = "true";
        String logicoStr2 = "false";
        boolean logicoBoolean1 = Boolean.parseBoolean(logicoStr1);
        boolean logicoBoolean2 = Boolean.parseBoolean(logicoStr2);
        System.out.println("logicoBoolean1: " + logicoBoolean1);
        System.out.println("logicoBoolean2: " + logicoBoolean2);
        //Todo valos que no sea true, false, TRUE, FALSE devuelve false
        logicoStr1 = "yes";
        logicoStr2 = "no";
        logicoBoolean1 = Boolean.parseBoolean(logicoStr1);
        logicoBoolean2 = Boolean.parseBoolean(logicoStr2);
        System.out.println("logicoBoolean1: " + logicoBoolean1);
        System.out.println("logicoBoolean2: " + logicoBoolean2);

        var varStr = "200";
        var varInt = Integer.parseInt(varStr);
        System.out.println("varInt: " + varInt);
        
        //Conversión de String a double
        var varRealStr1 = "98765.43";
        var varRealStr2 = "9876543e-3";
        var varRealDouble1 = Double.parseDouble(varRealStr1);
        var varRealDouble2 = Double.parseDouble(varRealStr2);
        System.out.println("varRealDouble1: " + varRealDouble1);
        System.out.println("varRealDouble2: " + varRealDouble2);
        
        //Conversión de String a boolean
        var varLogicoStr1 = "true";
        var varLogicoStr2 = "false";
        var varLogicoBoolean1 = Boolean.parseBoolean(varLogicoStr1);
        var varLogicoBoolean2 = Boolean.parseBoolean(varLogicoStr2);
        System.out.println("varLogicoBoolean1: " + varLogicoBoolean1);
        System.out.println("varLogicoBoolean2: " + varLogicoBoolean2);
        //Todo valos que no sea true, false, TRUE, FALSE devuelve false
        varLogicoStr1 = "yes";
        varLogicoStr2 = "no";
        varLogicoBoolean1 = Boolean.parseBoolean(varLogicoStr1);
        varLogicoBoolean2 = Boolean.parseBoolean(varLogicoStr2);
        System.out.println("varLogicoBoolean1: " + varLogicoBoolean1);
        System.out.println("varLogicoBoolean2: " + varLogicoBoolean2);

        // *****  Conversión de tipos primitivos a string  ***** //
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt["+otroNumeroInt+"]");
        String otroNumeroStr = Integer.toString(otroNumeroInt+10);
        System.out.println(otroNumeroStr);
        otroNumeroStr = String.valueOf(otroNumeroInt+20);
        System.out.println(otroNumeroStr);
        otroNumeroStr = String.valueOf(otroNumeroStr+20);
        System.out.println(otroNumeroStr);

        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println(otroRealStr);
        double otroRealDouble1 = 1.23456e2;
        String otroRealStr1 = Double.toString(otroRealDouble1);
        System.out.println(otroRealStr1);
        otroRealStr1 = String.valueOf(1.23456e2f);
        System.out.println(otroRealStr1);
        otroRealStr1 = String.valueOf(1.23456);
        System.out.println(otroRealStr1);

        //Conversion entre tipos primitivos
        int i = 33000;
        /*casting forza que un valor más grande entre a una variable con longitud menor
         * Solo se puede hacer a primitivos numericos
        */
        // Puede perderse información
        short s = (short)i;
        long l = i;
        System.out.println("i["+i+"], s["+s+"], l["+l+"]");
        System.out.println(Short.MAX_VALUE);
        //boolean no soporta enteros
        //boolean b = (boolean)i;
        char b = (char)i;
        System.out.println("b["+b+"]");
        float f = (float)i;
        System.out.println("f["+f+"]");
    }
}
