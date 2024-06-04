
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.Actor;

/**
 *
 * @author LENOVO
 */
public class ActorCrud {
    
    private static HashMap<Integer, Actor> actores = new HashMap<>();
 
    // Método para agregar un nuevo actor
    public  int agregar(Actor actor) throws Exception {
        if (actor == null) {
            throw new IllegalArgumentException("El objeto Actor no puede ser nulo");
        }
        
        if (actores.containsKey(actor.getId())) {
            throw new Exception("El actor ya existe");
        }
        
        actores.put(actor.getId(), actor);
        return actores.size();
    }
    
    // Método para buscar un actor por su id
    public  Actor buscar(int id) throws Exception {
        if (!actores.containsKey(id)) {
            throw new Exception("No se encontró el actor con el id proporcionado");
        }
        return actores.get(id);
    }
    
    // Método para editar un actor existente
    public  void editar(Actor actor) throws Exception {
        if (!actores.containsKey(actor.getId())) {
            throw new Exception("El actor a editar no está en la lista");
        }
        
        actores.put(actor.getId(), actor);
    }
    
    // Método para eliminar un actor existente
    public  void eliminar(int id) throws Exception {
        if (!actores.containsKey(id)) {
            throw new Exception("El actor a eliminar no está en la lista");
        }
        
        actores.remove(id);
    }
    
    // Método para listar todos los actores
    public  ArrayList<Actor> listarTodo() throws Exception {
        if (actores.isEmpty()) {
            throw new Exception("La lista de actores está vacía");
        }
        ArrayList<Actor> resultado = new ArrayList <Actor> ();
        for (Map.Entry<Integer, Actor> entry : actores.entrySet()) {            
            resultado.add(entry.getValue());
        }
        
        return resultado;
    }
    
    // Método para contar el número total de actores
    public  int contar() {
        return actores.size();
    }
}

