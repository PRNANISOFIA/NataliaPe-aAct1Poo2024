
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Persona {
    
    //PROPIEDADES
   protected String nombre;
   protected String edad;
   protected String rol; 
   protected String identificacion;
   protected int id;
    
   //CONSTRUCTOR
   
   public Persona() {
   }

    public Persona(String nombre, String edad, String rol, String identificacion, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
        this.identificacion = identificacion;
        this.id = id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", rol=" + rol + ", identificacion=" + identificacion + '}';
    }
   
   
    
}

