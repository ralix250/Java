//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero =" + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3= "15";
    }
}