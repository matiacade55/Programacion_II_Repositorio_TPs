
package Ejercicio_2;

/**
 *
 * @author matif
 */
public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
        
}
