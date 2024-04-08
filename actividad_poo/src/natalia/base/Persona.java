
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Persona {
    
    //PROPIEDADES
   private String nombre;
   private String edad;
   private String rol; 
   String identificacion; 
    
   //CONSTRUCTOR
   
   public Persona() {
   }
   
   //CONSTRUCTOR CON PARAMETROS

    public Persona(String nombre, String edad, String rol, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
        this.identificacion = identificacion;
    }
   
   

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
   
   // METODOS SET
    
    public void setId(String id){
        this.identificacion =  id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    
     public int getId(int id) {
     return id ;
    // METODO toString() 
     }
    @Override
    public String toString(){
        return "Persona [identificacion = " + identificacion + ", nombre = " + nombre + ", edad = " + edad + ", rol = " + rol + "]";
    }

    
}

