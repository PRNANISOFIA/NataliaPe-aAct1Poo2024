
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
 import java.util.HashMap;
import java.util.List;
import natalia.base.Persona;

/**
 *
 * @author LENOVO
 */

public class PersonaCrud {
   
    private static final HashMap<Integer, Persona> personas = new HashMap<>();
 
    // Método para agregar una nueva persona
    public static int agregar(Persona persona) throws Exception {
        if (persona == null) {
            throw new IllegalArgumentException("El objeto Persona no puede ser nulo");
        }
        
        if (personas.containsKey(persona.getId())) {
            throw new Exception("La persona ya existe");
        }
        
        personas.put((Integer) persona.getId(), persona);
        return personas.size(); // Retornar el tamaño del mapa después de agregar la persona
    }
    
    // Método para buscar una persona por su id
    public static Persona buscar(int id) throws Exception {
        if (!personas.containsKey(id)) {
            throw new Exception("No se encontró la persona con el id proporcionado");
        }
        return personas.get(id);
    }
    
    // Método para editar una persona existente
    public static void editar(Persona persona) throws Exception {
        if (personas.containsKey(persona.getId())) {
            throw new Exception("La persona a editar no está en la lista");
        }
        
        personas.put((Integer) persona.getId(), persona);
    }
    
    // Método para eliminar una persona existente
    public static void eliminar(int id) throws Exception {
        if (!personas.containsKey(id)) {
            throw new Exception("La persona a eliminar no está en la lista");
        }
        
        personas.remove(id);
    }
    
    // Método para listar todas las personas
    
      public static List<Persona> listarTodo() throws Exception {
        if (personas.isEmpty()) {
            throw new Exception("La lista de personas está vacía");
        }
        return new ArrayList<>(personas.values());
    }
    
    
    // Método para contar el número total de personas
    public static int contar() {
        return personas.size();
    }
}

