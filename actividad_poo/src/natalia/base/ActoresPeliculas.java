
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class ActoresPeliculas {
    
    //PROPIEDADES
    
   private String nombre;
    
   //CONSTRUCTOR
   
   public ActoresPeliculas(){
       
   }
   
   //CONSTRUCTOR CON PARAMETRO
   
   public ActoresPeliculas(String nombre){
       this. nombre = nombre;
   
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
    // METODO toString()
    
    @Override
    public String toString() {
        return "ActoresPeliculas [nombre = " + nombre + "]";
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   

