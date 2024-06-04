
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Promocion {
    
    //PROPIEDADES
    
   private int id;
   private String descripcion;
   private String detalleDescuento;
    
   //CONSTRUCTOR
   
   public Promocion(){
   }
   
   //CONSTRUCTOR CON PARAMETROS
   
   public Promocion(int id, String desc){
       this. id = id;
       this. descripcion = desc;
   
   }
   
   // METODOS 
   
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setDetalleDescuento(String detalleDescuento) {
        this.detalleDescuento = detalleDescuento;
    }
     public int getId(int id) {
     return id;
     }
    // METODO toString() 
    
    @Override
    public String toString() {
        return "Promocion [id = " + id + ", descripcion = " + descripcion + ", detalleDescuento = " + detalleDescuento + "]";
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

