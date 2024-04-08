
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import natalia.base.Sala;

/**
 *
 * @author LENOVO
 */
public class SalaCrud {
    
    private static HashMap<Integer, Sala> salas = new HashMap<>();
 
    // Método para agregar una nueva sala
    public static int agregar(Sala sala) throws Exception {
        if (sala == null) {
            throw new IllegalArgumentException("El objeto Sala no puede ser nulo");
        }
        
        if (salas.containsKey(sala.getId())) {
            throw new Exception("La sala ya existe");
        }
        
        salas.put((Integer) sala.getId(), sala);
        return salas.size();
    }
    
    // Método para buscar una sala por su id
    public static Sala buscar(int id) throws Exception {
        if (!salas.containsKey(id)) {
            throw new Exception("No se encontró la sala con el id proporcionado");
        }
        return salas.get(id);
    }
    
    // Método para editar una sala existente
    public static void editar(Sala sala) throws Exception {
        if (!salas.containsKey(sala.getId())) {
            throw new Exception("La sala a editar no está en la lista");
        }
        
        salas.put((Integer) sala.getId(), sala);
    }
    
    // Método para eliminar una sala existente
    public static void eliminar(int id) throws Exception {
        if (!salas.containsKey(id)) {
            throw new Exception("La sala a eliminar no está en la lista");
        }
        
        salas.remove(id);
    }
    
    // Método para listar todas las salas
    public static List<Sala> listarTodo() throws Exception {
        if (salas.isEmpty()) {
            throw new Exception("La lista de salas está vacía");
        }
        return new ArrayList<>(salas.values());
    }
    
    
    // Método para contar el número total de salas
    public static int contar() {
        return salas.size();
    }
}

    

