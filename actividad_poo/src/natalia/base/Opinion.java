
 
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Opinion {
    
    //PROPIEDADES
    
   protected int id;
   protected int calificacion;
   protected String comentario;
   protected String fechaRegistro;
   protected Pelicula pelicula;
    
   
   //CONSTRUCTOR
   
   public Opinion(){
   }
   
   //CONSTRUCTOR CON PARAMETROS
   
   public Opinion (int id, int calificacion){
       this. id = id;
       this. calificacion = calificacion;
   
   }
   
   // METODOS  
   
    public void setId(int id) {
        this.id = id;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
     public int getId() {
        return id;
    }
    // METODO toString() 
    
    @Override
    public String toString() {
        return "Opinion [id = " + id + ", calificacion = " + calificacion + ", comentario = " + comentario + ", fechaRegistro = " + fechaRegistro + ", pelicula = " + pelicula + "]";
    }

   
}

