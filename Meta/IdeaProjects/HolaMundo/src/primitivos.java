public class primitivos {
    public static void main(String[] args) {
        //Primitivos son solo valores
        byte numeroByte = 7;
        System.out.println("numeroByte: "+ numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte:" + Byte.MIN_VALUE);
        System.out.println("");
        
        short numeroShort = 32767;
        System.out.println("numeroShort: "+ numeroShort);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un Short:" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short:" + Short.MIN_VALUE);
        System.out.println("");

        int numeroInt = 2147483647;
        System.out.println("numeroInt: "+ numeroInt);
        System.out.println("tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un Int:" + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un Int:" + Integer.MIN_VALUE);
        System.out.println("");

        // Los numeros long, deben tener una L al final por convención se usa la mayuscula
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong: "+ numeroLong);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un Long:" + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long:" + Long.MIN_VALUE);

        // Solo para Java 10 en adelante
        var numeroVar = 9223372036854775807L;
    }

}
