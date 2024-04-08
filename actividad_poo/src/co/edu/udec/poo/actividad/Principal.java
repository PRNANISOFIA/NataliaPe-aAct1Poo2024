
package co.edu.udec.poo.actividad;

import co.edu.udec.poo.actividad.crud.ActorCrud;
import java.util.ArrayList;
import natalia.base.Actor;

/**
 *
 * @author LENOVO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRUD Actor
        ActorCrud lista = new ActorCrud();
        Actor ryan =  new Actor();
        Actor antonia =  new Actor();
        
        ryan.setId(1);
        ryan.setNombrePersonaje("deadpool");
        ryan.setNumPeliculasActuadas(10);
        
        antonia.setId(2);
        antonia.setNombrePersonaje("openheimer");
        antonia.setNumPeliculasActuadas(15);
        
        try{
            lista.agregar(antonia);
            lista.agregar(ryan); 
            
            int contar = lista.contar();
            Actor busqueda = lista.buscar(1);
           
            antonia.setNombrePersonaje("persona");
            ryan.setNumPeliculasActuadas(20);
            
            lista.editar(antonia);
            lista.editar(ryan);
            
            lista.eliminar(2);

            ArrayList<Actor> listado = lista.listarTodo();
            
            for(Actor item: listado){
                System.out.println(item.toString());
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    
        
    }
   
}
