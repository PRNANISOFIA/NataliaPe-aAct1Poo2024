
package co.edu.udec.poo.actividad;
import natalia.base.vistas.gui.VentanaPrincipal;

/**
 *
 * @author LENOVO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //System.out.println("HOLA");
    VentanaPrincipal ventana = new VentanaPrincipal();
    //ventana.setLocationRelativeTo(null);
    ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
    ventana.setVisible(true);
    }
   
}
