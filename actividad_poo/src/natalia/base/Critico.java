
package natalia.base;

/**
 * 
 */
public class Critico extends Persona {
    
    // PROPIEDADES
    
  
    private int numOpiniones;
    
    // CONSTRUCTORES
    
    public Critico(){
        super(); // Llama al constructor de Persona
    }
   
    // Constructor con parámetros

    public Critico(int numOpiniones) {
        this.numOpiniones = numOpiniones;
    }

    public Critico(int numOpiniones, String nombre, String edad, String rol, String identificacion, int id) {
        super(nombre, edad, rol, identificacion, id);
        this.numOpiniones = numOpiniones;
    }

    
    public int getNumOpiniones() {
        return numOpiniones;
    }

    public void setNumOpiniones(int numOpiniones) {
        this.numOpiniones = numOpiniones;
    }
    

    // MÉTODO toString() 

    @Override
    public String toString() {
        return "Critico{" + "id=" + id + ", numOpiniones=" + numOpiniones + '}';
    }
    
   
}
