
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Sala {
    
    //PROPIEDADES
    
  private int id;
  private String nombre;
  private String numIdentificador;
  private int capacidadAsientos;
    
  //CONSTRUCTOR
  
  public Sala(){
  }
  
  //CONSTRUCTOR CON PARAMETROS
  
  public Sala(int id, String nombre){
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
    
    public void setNumIdentificador(String numIdentificador){
        this.numIdentificador = numIdentificador;
    }
    
    public void setCapacidadAsientos(int capacidadAsientos){
        this.capacidadAsientos = capacidadAsientos;
    }
     public int getId(int id) {
     return id; 
     }
    // METODO toString() 
    @Override
    public String toString(){
        return "Sala [id = " + id + ", nombre = " + nombre + ", numIdentificador = " + numIdentificador + ", capacidadAsientos = " + capacidadAsientos + "]";
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

