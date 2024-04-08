
package natalia.base;

/**
 * 
 */
public class Critico extends Persona {
    
    // PROPIEDADES
    
    private int id;
    private String nombre;
    private int numOpiniones;
    
    // CONSTRUCTORES
    
    public Critico(){
        super(); // Llama al constructor de Persona
    }
   
    // Constructor con parámetros
    public Critico(int id, String nombre, int numOpiniones, String edad, String rol, String identificacion) {
        super(nombre, edad, rol, identificacion);
    }

    // MÉTODOS SET
    
   
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumOpiniones(int numOpiniones) {
        this.numOpiniones = numOpiniones;
    }
    public int getId(int id) {
        return id;
    }

    // MÉTODO toString() 
    
    @Override
    public String toString(){
        return "Crítico [id = " + id + ", nombre = " + nombre + ", numOpiniones = " + numOpiniones + "]";
    }
}
