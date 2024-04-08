
package natalia.base;

/**
 * 
 */
public class Director extends Persona {

    // PROPIEDADES
    protected int id;
    protected int numPeliculasDirigidas;

    // CONSTRUCTORES

    public Director() {
    }

    public Director(int id, int numPeliculasDirigidas) {
        this.id = id;
        this.numPeliculasDirigidas = numPeliculasDirigidas;
    }

    // MÉTODOS GET Y SET

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNumPeliculasDirigidas(int numPeliculasDirigidas) {
        this.numPeliculasDirigidas = numPeliculasDirigidas;
    }

    public int getId(int id) {
        return id;
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
