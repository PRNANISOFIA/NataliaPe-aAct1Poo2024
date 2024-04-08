
package natalia.base;

/**
 *
 * @author LENOVO
 */
public class Funcion {
    
    //PROPIEDADES
    
   private int id;
   private String diaSemana;
   private String horaInicio;
    
   //CONSTRUCTOR
   
   public Funcion(){
   }
   
   //CONSTRUCTOR CON PARAMETROS
   
   public Funcion(int id, String diaSemana){
       this. id = id;
       this. diaSemana = diaSemana;
   }
   
   // METODOS SET
   
    public void setId(int id){
        this.id = id;
    }
    
    public void setDiaSemana(String diaSemana){
        this.diaSemana = diaSemana;
    }
    
    public void setHoraInicio(String horaInicio){
        this.horaInicio = horaInicio;
    }
     public int getId() {
        return id;
    }
     
    // METODO toString() 
    @Override
    public String toString(){
        return "Funcion [id = " + id + ", diaSemana = " + diaSemana + ", horaInicio = " + horaInicio + "]";
    }

   
}

