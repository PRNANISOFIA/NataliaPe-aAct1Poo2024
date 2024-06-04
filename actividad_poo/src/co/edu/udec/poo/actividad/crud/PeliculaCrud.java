
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import natalia.base.Pelicula;
/**
 *
 * @author LENOVO
 */

public class PeliculaCrud {
    
    private static HashMap<Integer, Pelicula> peliculas = new HashMap<>();
 
    // Método para agregar una nueva película
    public static int agregar(Pelicula pelicula) throws Exception {
        if (pelicula == null) {
            throw new IllegalArgumentException("El objeto Pelicula no puede ser nulo");
        }
        
        if (peliculas.containsKey(pelicula.getId())) {
            throw new Exception("La película ya existe");
        }
        
        peliculas.put(pelicula.getId(), pelicula);
        return peliculas.size();
    }
    
    // Método para buscar una película por su id
    public static Pelicula buscar(int id) throws Exception {
        if (!peliculas.containsKey(id)) {
            throw new Exception("No se encontró la película con el id proporcionado");
        }
        return peliculas.get(id);
    }
    
    // Método para editar una película existente
    public static void editar(Pelicula pelicula) throws Exception {
        if (!peliculas.containsKey(pelicula.getId())) {
            throw new Exception("La película a editar no está en la lista");
        }
        
        peliculas.put(pelicula.getId(), pelicula);
    }
    
    // Método para eliminar una película existente
    public static void eliminar(int id) throws Exception {
        if (!peliculas.containsKey(id)) {
            throw new Exception("La película a eliminar no está en la lista");
        }
        
        peliculas.remove(id);
    }
    
    // Método para listar todas las películas
    public static List<Pelicula> listarTodo() throws Exception {
        if (peliculas.isEmpty()) {
            throw new Exception("La lista de películas está vacía");
        }
        return new ArrayList<>(peliculas.values());
    }
    
    // Método para contar el número total de películas
    public static int contar() {
        return peliculas.size();
    }
}
