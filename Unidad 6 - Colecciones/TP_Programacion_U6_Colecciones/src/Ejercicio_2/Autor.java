
package Ejercicio_2;

/**
 *
 * @author matif
 */
public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarInfo() {
        
        System.out.println("Informacion del autor:\n"
                            + "ID: " + id + "\n"
                            + "Nombre: " + nombre + "\n"
                            + "Nacionalidad: " + nacionalidad);
    }
    
    

    // EQUALS Y HASHCODE (para que .contains() funcione bien)
    @Override
    public int hashCode() {
        // Genera un "código" basado en el ID
        return java.util.Objects.hash(id); 
    }

    @Override
    public boolean equals(Object obj) {
        // Dos autores son "iguales" si tienen el mismo ID.
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        return java.util.Objects.equals(this.id, other.id);
    }
}
