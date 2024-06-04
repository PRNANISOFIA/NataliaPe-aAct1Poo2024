
package natalia.base;

/**
 * 
 */
public class Actor extends Persona {
    
    
    private String nombrePersonaje;
    private int numPeliculasActuadas;
   

    // CONSTRUCTORES
    
    public Actor() {
        super(); // Llama al constructor de Persona
    }

    public Actor(String nombrePersonaje, int numPeliculasActuadas, String nombre, String edad, String rol, String identificacion, int id) {
        super(nombre, edad, rol, identificacion, id);
        this.nombrePersonaje = nombrePersonaje;
        this.numPeliculasActuadas = numPeliculasActuadas;
    }
   
    
    // MÉTODOS SET
    
    // Método set para nombrePersonaje
    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    // Método set para numPeliculasActuadas
    public void setNumPeliculasActuadas(int numPeliculasActuadas) {
        this.numPeliculasActuadas = numPeliculasActuadas;
    }

    // MÉTODOS GET
    
    // Método get para nombrePersonaje
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    // Método get para numPeliculasActuadas
    public int getNumPeliculasActuadas() {
        return numPeliculasActuadas;
    }
    
    // MÉTODO toString() 
    @Override
    public String toString() {
        return "Actor [ nombrePersonaje = " + nombrePersonaje + ", numPeliculasActuadas = " + numPeliculasActuadas + "]";
    }
}
