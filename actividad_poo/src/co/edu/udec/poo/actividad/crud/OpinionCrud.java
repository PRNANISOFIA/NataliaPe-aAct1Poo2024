
package co.edu.udec.poo.actividad.crud;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import natalia.base.Opinion;
/**
 *
 * @author LENOVO
 */
public class OpinionCrud {
    
    private Map<Integer, Opinion> opiniones;

    // Constructor
    public OpinionCrud() {
        this.opiniones = new HashMap<>();
    }

    // Método para agregar una nueva opinión
    
    public void agregar(Opinion opinion) throws Exception {
        if (opinion == null) {
            throw new IllegalArgumentException("La opinión no puede ser nula");
        }
        int id = opinion.getId();
        if (opiniones.containsKey(id)) {
            throw new Exception("La opinión con id " + id + " ya existe");
        }
        opiniones.put(id, opinion);
    }

    // Método para buscar una opinión por su id
    
    public Opinion buscar(int id) throws Exception {
        if (!opiniones.containsKey(id)) {
            throw new Exception("No se encontró la opinión con id " + id + "");
        }
        return opiniones.get(id);
    }

    // Método para editar una opinión existente
    
    public void editar(Opinion opinion) throws Exception {
        int id = opinion.getId();
        if (!opiniones.containsKey(id)) {
            throw new Exception("No se encontró la opinión con id " + id + " para editar.");
        }
        opiniones.put(id, opinion);
    }

    // Método para eliminar una opinión por su id
    
    public void eliminar(int id) throws Exception {
        if (!opiniones.containsKey(id)) {
            throw new Exception("No se encontró la opinión con id " + id + " para eliminar");
        }
        opiniones.remove(id);
    }

    // Método para listar todas las opiniones
    
    public List<Opinion> listarTodo() throws Exception {
        if (opiniones.isEmpty()) {
            throw new Exception("No hay opiniones registradas");
        }
        return new ArrayList<>(opiniones.values());
    }

    // Método para contar el número total de opiniones
    
    public int contar() {
        return opiniones.size();
    }
}

