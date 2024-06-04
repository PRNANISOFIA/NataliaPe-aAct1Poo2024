
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Pais {
    
    //PROPIEDADES
    
  private String nombre;
  private Pelicula pelicula;
  
  //CONSTRUCTOR
  
  public Pais(){
  }
  
  //CONSTRUCTOR CON PARAMETROS
  
  public Pais(String nombre, Pelicula pelicula){
      this. nombre = nombre;
      this. pelicula = pelicula;
  
  }
  
  // METODOS 
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
     
    // METODO toString() 
    
    @Override
    public String toString() {
        return "Pais [nombre = " + nombre + ", pelicula = " + pelicula + "]";
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

