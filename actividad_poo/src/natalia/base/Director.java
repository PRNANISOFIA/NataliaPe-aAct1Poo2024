
package natalia.base;

/**
 * 
 */
public class Director extends Persona {

    // PROPIEDADES
   
    private int numPeliculasDirigidas;

    // CONSTRUCTORES

    public Director(int numPeliculasDirigidas, String nombre, String edad, String rol, String identificacion, int id) {
        super(nombre, edad, rol, identificacion, id);
        this.numPeliculasDirigidas = numPeliculasDirigidas;
    }

   

    // MÉTODOS GET Y SET


    public void setNumPeliculasDirigidas(int numPeliculasDirigidas) {
        this.numPeliculasDirigidas = numPeliculasDirigidas;
    }

    public int getNumPeliculasDirigidas() {
        return numPeliculasDirigidas;
    }

    // Método para obtener la identificación del director
    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    // MÉTODO toString() 

    @Override
    public String toString() {
        return "Director [id = " + id + ", numPeliculasDirigidas = " + numPeliculasDirigidas + "]";
    }
}
