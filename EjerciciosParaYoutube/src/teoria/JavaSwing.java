package teoria;

/*    NOTA
* Cuando se importan paquetes por ejemplo:
* import javax.swing.JFrame;
* agrega a la clase todos los metodos indicados,
* pero si se requiere traer todos los metodos se usa
* de la siguiente forma
*/
import javax.swing.*;
import java.awt.BorderLayout;

public class JavaSwing {

   public static void main(String[] args) {
      // Datos para el MARCO
         JFrame miMarco = new JFrame();
         // Tamaño de marco x, y
         miMarco.setSize( 600, 400 );
         // Para que al cerrar la ventana se finalize la ejecución
         miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //Para indicar el titulo del marco
         miMarco.setTitle("Mi primer ejemplo");
         // Indica que la pantalla sale a mitad de la pantalla
         miMarco.setLocationRelativeTo(null);
         /*    NOTA
          * Si se desea que la ventana aprezca en pixeles
          * especificos se debe usar setLocation(x, y)
          * Toma en consideración la resolución de la 
          * pantalla
          * miMarco.setLocation(500, 600);
          */
         /*   Nota
          * Para indicar posición x, y cuando se abre la ventana
          * e indicar longitudes.
          * setBounds es una combinacion de setSize(x,y) y
          * setLocation(x,y)
          * miMarco.setBounds( 150, 300, 400, 400 );
          */
      // Elementos de la ventana
         JPanel miPanel = new JPanel();
         /*   Nota
          * Los layout es la forma en como se disponen
          * los elementos en un panel, el layout por defecto
          * se llama flow layout
          */
         BorderLayout miLayout = new BorderLayout();
         miPanel.setLayout(miLayout);
         /* Al agregar BorderLayout se cambia la estructura
          * del layout y se debe indicar en que coordenadas
          * deben estar cada elemento
          */
         JButton miBoton = new JButton("Mi boton");
      // Se agrega el boton al panel
      //miPanel.add(miBoton);
      miPanel.add(miBoton, BorderLayout.SOUTH);
      // Se agrega el panel al marco
      miMarco.add(miPanel);
      // Para visualizar el marco, por default no se ve 
      // Siempre debe ser el ultimo elemento del marco
      miMarco.setVisible(true);
   }

}
