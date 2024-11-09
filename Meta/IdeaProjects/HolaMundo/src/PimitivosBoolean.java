public class PimitivosBoolean {

    public static void main(String[] args) {
        /*
         * boolean: 
         *  Es un tipo de dato primitivo. 
         *  Se usa para almacenar true o false en su forma más básica y no puede ser null. 
         *  --> Para operaciones básicas de control y lógica.
         * Boolean:
         *  Es una clase envolvente (wrapper) para el tipo primitivo boolean. 
         *  Permite manejar valores booleanos como objetos y puede contener el valor null. 
         *  Al utilizar Boolean datoLogico1 = Boolean.FALSE;, estás asignando a 
         *      un objeto Boolean la constante Boolean.FALSE, que equivale a false, 
         *      pero como un objeto. 
         *      Esto resulta útil en casos donde se necesita compatibilidad con 
         *      estructuras que requieren objetos, como las colecciones List y Map, 
         *      o cuando se quiere expresar una ausencia de valor con null.
         *  --> Cuando el valor booleano necesita almacenarse en una estructura de datos 
         *      o cuando se requiere la posibilidad de valores nulos.
         */
        boolean datoLogico = true;
        Boolean datoLogico1 = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;   // 98.876543
        float  f = 12345e2f;      // 125.45
        datoLogico = ( d > f );
        System.out.println("datoLogico["+datoLogico+"] = ( d["+d+"] > f["+f+"] )");

        boolean esIgual = 3-1 == 1;
        System.out.println("esIgual["+esIgual+"]: (3-1) = 1");
    }
}
