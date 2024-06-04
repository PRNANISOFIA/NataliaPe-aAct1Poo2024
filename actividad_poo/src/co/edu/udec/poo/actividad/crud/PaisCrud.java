
package co.edu.udec.poo.actividad.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import natalia.base.Pais;
/**
 *
 * @author LENOVO
 */
public class PaisCrud {
    
    // HashMap para almacenar los países usando el nombre como clave
    private Map<String, Pais> paises;

    // Constructor
    public PaisCrud() {
        this.paises = new HashMap<>();
    }

    // Método para agregar un nuevo país
    
    public void agregar(Pais pais) throws Exception {
        if (pais == null) {
            throw new IllegalArgumentException("El país no puede ser nulo");
        }
        String nombre = pais.getNombre();
        if (paises.containsKey(nombre)) {
            throw new Exception("El país " + nombre + " ya existe");
        }
        paises.put(nombre, pais);
    }

    // Método para buscar un país por su nombre
    
    public Pais buscar(String nombre) throws Exception {
        if (!paises.containsKey(nombre)) {
            throw new Exception("No se encontró " + nombre + "el país");
        }
        return paises.get(nombre);
    }

    // Método para editar un país existente
    
    public void editar(Pais pais) throws Exception {
        String nombre = pais.getNombre();
        if (!paises.containsKey(nombre)) {
            throw new Exception("No se encontró el país " + nombre + " para editar");
        }
        paises.put(nombre, pais);
    }

    // Método para eliminar un país por su nombre
    
    public void eliminar(String nombre) throws Exception {
        if (!paises.containsKey(nombre)) {
            throw new Exception("No se encontró el país " + nombre + " para eliminar");
        }
        paises.remove(nombre);
    }

    // Método para listar todos los países
    
    public List<Pais> listarTodo() throws Exception {
        if (paises.isEmpty()) {
            throw new Exception("No hay países registrados");
        }
        return new ArrayList<>(paises.values());
    }

    // Método para contar el número total de países
    public int contar() {
        return paises.size();
    }
}

    

