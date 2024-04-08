
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import natalia.base.Promocion;

/**
 *
 * @author LENOVO
 */
public class PromocionCrud {
    
    private static HashMap<Integer, Promocion> promociones = new HashMap<>();
 
    // Método para agregar una nueva promoción
    
    public static int agregar(Promocion promocion) throws Exception {
        if (promocion == null) {
            throw new IllegalArgumentException("El objeto Promocion no puede ser nulo");
        }
        
        if (promociones.containsKey(promocion.getId())) {
            throw new Exception("La promoción ya existe");
        }
        
        promociones.put((Integer) promocion.getId(), promocion);
        return promociones.size();
    }
    
    // Método para buscar una promoción por su id
    
    public static Promocion buscar(int id) throws Exception {
        if (!promociones.containsKey(id)) {
            throw new Exception("No se encontró la promoción con el id proporcionado");
        }
        return promociones.get(id);
    }
    
    // Método para editar una promoción existente
    
    public static void editar(Promocion promocion) throws Exception {
        if (!promociones.containsKey(promocion.getId())) {
            throw new Exception("La promoción a editar no está en la lista");
        }
        
        promociones.put((Integer) promocion.getId(), promocion);
    }
    
   // Método para eliminar una promoción existente
    
    public static void eliminar(int id) throws Exception {
        if (!promociones.containsKey(id)) {
            throw new Exception("La promoción a eliminar no está en la lista");
        }
        
        promociones.remove(id);
    }
    
    // Método para listar todas las promociones
    
    public static List<Promocion> listarTodo() throws Exception {
        if (promociones.isEmpty()) {
            throw new Exception("La lista de promociones está vacía");
        }
        return new ArrayList<>(promociones.values());
    }
    
    
    // Método para contar el número total de promociones
    
    public static int contar() {
        return promociones.size();
    
    }
    
}
    

