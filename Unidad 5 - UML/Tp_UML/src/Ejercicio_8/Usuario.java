
package Ejercicio_8;

/**
 *
 * @author matif
 */
public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
    
}
