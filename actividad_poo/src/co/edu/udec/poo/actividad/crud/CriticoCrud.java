
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.Critico;

/**
 *
 * @author LENOVO
 */
public class CriticoCrud {
    
    private  HashMap<Integer, Critico> criticos = new HashMap<>();
 
    // Método para agregar un nuevo crítico
    public  int agregar(Critico critico) throws Exception {
        if (critico == null) {
            throw new IllegalArgumentException("El objeto Crítico no puede ser nulo");
        }
        
        if (criticos.containsKey(critico.getId())) {
            throw new Exception("El crítico ya existe");
        }
        
        criticos.put((Integer) critico.getId(), critico);
        return criticos.size();
    }
    
    // Método para buscar un crítico por su id
    public  Critico buscar(int id) throws Exception {
        if (!criticos.containsKey(id)) {
            throw new Exception("No se encontró el crítico con el id proporcionado");
        }
        return criticos.get(id);
    }
    
    // Método para editar un crítico existente
    public void editar(Critico critico) throws Exception {
        if (!criticos.containsKey(critico.getId())) {
            throw new Exception("El crítico a editar no está en la lista");
        }
        
        criticos.put((Integer) critico.getId(), critico);
    }
    
    // Método para eliminar un crítico existente
    public  void eliminar(int id) throws Exception {
        if (!criticos.containsKey(id)) {
            throw new Exception("El crítico a eliminar no está en la lista");
        }
        
        criticos.remove(id);
    }
    
    // Método para listar todos los críticos
    public  ArrayList<Critico> listarTodo() throws Exception {
        if (criticos.isEmpty()) {
            throw new Exception("La lista de criticos está vacía");
        }
        ArrayList<Critico> resultado = new ArrayList <Critico> ();
        for (Map.Entry<Integer, Critico> entry : criticos.entrySet()) {            
            resultado.add(entry.getValue());
        }
        
        return resultado;
    }
    
    // Método para contar el número total de críticos
    public  int contar() {
        return criticos.size();
    }
}


