
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.Cine;

/**
 *
 * @author LENOVO
 */
public class CineCrud {
    
    private  HashMap<Integer, Cine> cines = new HashMap<>();
 
    // Método para agregar un nuevo cine
    public  int agregar(Cine cine) throws Exception {
        if (cine == null) {
            throw new IllegalArgumentException("El objeto Cine no puede ser nulo");
        }
        
        if (cines.containsKey(cine.getId())) {
            throw new Exception("El cine ya existe");
        }
        
        cines.put((Integer) cine.getId(), cine);
        return cines.size();
    }
    
    // Método para buscar un cine por su id
    public  Cine buscar(int id) throws Exception {
        if (!cines.containsKey(id)) {
            throw new Exception("No se encontró el cine con el id proporcionado");
        }
        return cines.get(id);
    }
    
    // Método para editar un cine existente
    public  void editar(Cine cine) throws Exception {
        if (!cines.containsKey(cine.getId())) {
            throw new Exception("El cine a editar no está en la lista");
        }
        
        cines.put((Integer) cine.getId(), cine);
    }
    
    // Método para eliminar un cine existente
    public void eliminar(int id) throws Exception {
        if (!cines.containsKey(id)) {
            throw new Exception("El cine a eliminar no está en la lista");
        }
        
        cines.remove(id);
    }
    
    // Método para listar todos los cines
     public  ArrayList<Cine> listarTodo() throws Exception {
        if (cines.isEmpty()) {
            throw new Exception("La lista de cines está vacía");
        }
        ArrayList<Cine> resultado = new ArrayList <Cine>();
        for (Map.Entry<Integer, Cine> entry : cines.entrySet()) {            
            resultado.add(entry.getValue());
        }
        
        return resultado;
    }
    // Método para contar el número total de cines
    public  int contar() {
        return cines.size();
    }
}

    

