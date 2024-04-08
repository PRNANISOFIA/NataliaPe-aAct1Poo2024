
package co.edu.udec.poo.actividad.crud;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.Director;


/**
 *
 * @author LENOVO
 */

public class DirectorCrud {
    
    private static HashMap<String, Director> directores = new HashMap<>();
 
    // Método para agregar un nuevo director
    public static void agregar(Director director) throws Exception {
        if (directores.containsKey(director.getIdentificacion())) {
            throw new Exception("El director ya existe");
        }
        
        directores.put((String) director.getIdentificacion(), director);
        
    }
    
    // Método para editar un director existente
    public static void editar(Director director) throws Exception {
        if (!directores.containsKey(director.getIdentificacion())) {
            throw new Exception("El director no existe");
        }
        
        directores.put((String) director.getIdentificacion(), director);
    }
    
    // Método para eliminar un director existente
    public static void eliminar(String identificacion) throws Exception {
        if (!directores.containsKey(identificacion)) {
            throw new Exception("El director no existe");
        }
        
        directores.remove(identificacion);
    }
    
    // Método para buscar un director por su código
    public static Director buscar(String codigo) {
        return directores.get(codigo);
    }
    
    // Método para listar todos los directores
    public  ArrayList<Director> listarTodo() throws Exception {
        if (directores.isEmpty()) {
            throw new Exception("La lista de criticos está vacía");
        }
        ArrayList<Director> resultado = new ArrayList <Director>();
        for (Map.Entry<String, Director> entry : directores.entrySet()) {            
            resultado.add(entry.getValue());
        }
        return resultado;
    }   
    
    
    // Método para contar el número total de directores
    public static int contar() {
        return directores.size();
    }
}


    
    
    


