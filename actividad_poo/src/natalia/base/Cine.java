
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Cine {
    
    //PROPIEDADES
    
   private int id;
   private String nombre;
   private String direccion;
   private String telefono;
    
   //CONSTRUCTOR 
   
   public Cine(){
   }
   
   //CONSTRUCTOR CON PARAMETROS
   
   public Cine (int id, String nombre){
       this. id = id;
       this. nombre = nombre;
   
   }
   
   // METODOS SET 
   
    public void setId(int id){
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
     public int getId() {
        return id;
    }

   
    // METODO toString() 
    
    @Override
    public String toString(){
        return "Cine [id = " + id + ", nombre = " + nombre + ", direccion = " + direccion + ", telefono = " + telefono + "]";
    }

    
}
   

