
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.Funcion;

/**
 *
 * @author LENOVO
 */
public class FuncionCrud {
    
    private static HashMap<Integer, Funcion> funciones = new HashMap<>();
 
    // Método para agregar una nueva función
    public static int agregar(Funcion funcion) throws Exception {
        if (funcion == null) {
            throw new IllegalArgumentException("El objeto Funcion no puede ser nulo");
        }
        
        if (funciones.containsKey(funcion.getId())) {
            throw new Exception("La función ya existe");
        }
        
        funciones.put((Integer) funcion.getId(), funcion);
        return funciones.size();
    }
    
    // Método para buscar una función por su id
    public static Funcion buscar(int id) throws Exception {
        if (!funciones.containsKey(id)) {
            throw new Exception("No se encontró la función con el id proporcionado");
        }
        return funciones.get(id);
    }
    
    // Método para editar una función existente
    public static void editar(Funcion funcion) throws Exception {
        if (!funciones.containsKey(funcion.getId())) {
            throw new Exception("La función a editar no está en la lista");
        }
        
        funciones.put((Integer) funcion.getId(), funcion);
    }
    
    // Método para eliminar una función existente
    public static void eliminar(int id) throws Exception {
        if (!funciones.containsKey(id)) {
            throw new Exception("La función a eliminar no está en la lista");
        }
        
        funciones.remove(id);
    }
    
    // Método para listar todas las funciones
    public  ArrayList<Funcion> listarTodo() throws Exception {
        if (funciones.isEmpty()) {
            throw new Exception("La lista de funciones está vacía");
        }
        ArrayList<Funcion> resultado = new ArrayList <Funcion> ();
        for (Map.Entry<Integer, Funcion> entry : funciones.entrySet()) {            
            resultado.add(entry.getValue());
        }
        return resultado;
    }
    // Método para contar el número total de críticos
    
    public static int contar() {
        return funciones.size();
    
}
    
}
        


    
    

