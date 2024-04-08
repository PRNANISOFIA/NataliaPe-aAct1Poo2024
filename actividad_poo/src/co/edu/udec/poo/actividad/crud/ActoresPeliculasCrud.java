
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import natalia.base.ActoresPeliculas;

/**
 *
 * @author LENOVO
 */
public class ActoresPeliculasCrud {
    
    // HashMap para almacenar los actores de películas usando el nombre como clave
    private Map<String, ActoresPeliculas> actoresPeliculas;

    // Constructor
    public ActoresPeliculasCrud() {
        this.actoresPeliculas = new HashMap<>();
    }

    // Método para agregar un nuevo actor de película
    
    public void agregar(ActoresPeliculas actorPelicula) throws Exception {
        if (actorPelicula == null) {
            throw new IllegalArgumentException("El objeto ActoresPeliculas no puede ser nulo");
        }
        String nombre = actorPelicula.getNombre();
        if (actoresPeliculas.containsKey(nombre)) {
            throw new Exception("El actor o actriz " + nombre + " ya existe");
        }
        actoresPeliculas.put(nombre, actorPelicula);
    }

    // Método para buscar un actor de película por su nombre
    
    public ActoresPeliculas buscar(String nombre) throws Exception {
        if (!actoresPeliculas.containsKey(nombre)) {
            throw new Exception("No se encontró " + nombre + "el actor o actriz");
        }
        return actoresPeliculas.get(nombre);
    }

    // Método para editar un actor de película existente
    
    public void editar(ActoresPeliculas actorPelicula) throws Exception {
        String nombre = actorPelicula.getNombre();
        if (!actoresPeliculas.containsKey(nombre)) {
            throw new Exception("No se encontró el actor o actriz " + nombre + " para editar");
        }
        actoresPeliculas.put(nombre, actorPelicula);
    }

    // Método para eliminar un actor de película por su nombre
    
    public void eliminar(String nombre) throws Exception {
        if (!actoresPeliculas.containsKey(nombre)) {
            throw new Exception("No se encontró el actor o actriz " + nombre + " para eliminar");
        }
        actoresPeliculas.remove(nombre);
    }

    // Método para listar todos los actores de películas
    
    // Método para listar todos los actores
    public  ArrayList<ActoresPeliculas> listarTodo() throws Exception {
        if (actoresPeliculas.isEmpty()) {
            throw new Exception("La lista de ActoresPeliculas está vacía");
        }
        ArrayList<ActoresPeliculas> resultado = new ArrayList <ActoresPeliculas>();
        for (Map.Entry<String, ActoresPeliculas> entry : actoresPeliculas.entrySet()) {            
            resultado.add(entry.getValue());
        }
        return resultado;
    }
    // Método para contar el número total de actores de películas
    
    public int contar() {
        return actoresPeliculas.size();
    }
}

    

