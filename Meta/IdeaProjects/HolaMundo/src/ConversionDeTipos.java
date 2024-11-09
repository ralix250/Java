public class ConversionDeTipos {

    public static void main(String[] args) {
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
    }
}
