/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natalia.base;
import java.util.Date;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class Pelicula {
    
    //PROPIEDADES
    private int id;
  private String tituloDistribucion;
  private String tituloOriginal;
  private String genero;
  private String idiomaOriginal;
  private String subtitulosEspanol;
  private String paisesOrigen;
  private Date anoProduccion;
  private String urlSitioWeb;
  private int duracion;
  private String clasificacionEdades;
  private Date fechaEstrenoSantiago;
  private String resumen;
  private String identificador;
  private List<Opinion>opiniones;
  private List<Pais>paises;
  
  //Constructor
  public Pelicula() {
  }
  
  //Constructor con parametros
  
  public Pelicula(int id, String tituloDistribucion) {
      this. id = id;
      this. tituloDistribucion = tituloDistribucion;
  }
 // METODOS SET
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setTituloDistribucion(String tituloDistribucion) {
        this.tituloDistribucion = tituloDistribucion;
    }
    
    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }
    
    public void setSubtitulosEspanol(String subtitulosEspanol) {
        this.subtitulosEspanol = subtitulosEspanol;
    }
    
    public void setPaisesOrigen(String paisesOrigen) {
        this.paisesOrigen = paisesOrigen;
    }
    
    public void setAnoProduccion(Date anoProduccion) {
        this.anoProduccion = anoProduccion;
    }
    
    public void setUrlSitioWeb(String urlSitioWeb) {
        this.urlSitioWeb = urlSitioWeb;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void setClasificacionEdades(String clasificacionEdades) {
        this.clasificacionEdades = clasificacionEdades;
    }
    
    public void setFechaEstrenoSantiago(Date fechaEstrenoSantiago) {
        this.fechaEstrenoSantiago = fechaEstrenoSantiago;
    }
    
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public void setOpiniones(List<Opinion> opiniones) {
        this.opiniones = opiniones;
    }
    
    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
     public int getId() {
        return id;
    }

    // METODO toString() 
    
    @Override
    public String toString() {
        return "Pelicula [id = " + id + ", tituloDistribucion = " + tituloDistribucion + ", tituloOriginal = " + tituloOriginal
                + ", genero = " + genero + ", idiomaOriginal = " + idiomaOriginal + ", subtitulosEspanol = "
                + subtitulosEspanol + ", paisesOrigen = " + paisesOrigen + ", anoProduccion = " + anoProduccion
                + ", urlSitioWeb = " + urlSitioWeb + ", duracion = " + duracion + ", clasificacionEdades = "
                + clasificacionEdades + ", fechaEstrenoSantiago = " + fechaEstrenoSantiago + ", resumen = " + resumen
                + ", identificador = " + identificador + ", opiniones = " + opiniones + ", paises = " + paises + "]";
    }

   
}

