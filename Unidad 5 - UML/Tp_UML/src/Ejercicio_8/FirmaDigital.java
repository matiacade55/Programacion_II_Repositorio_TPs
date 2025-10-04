
package Ejercicio_8;

/**
 *
 * @author matif
 */
public class FirmaDigital {
    
    private String codigo;
    private String fecha;
    private Usuario usuario; // Agregacion

    public FirmaDigital(String codigo, String fecha, Usuario usuario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigo=" + codigo + ", fecha=" + fecha + ", " + usuario + '}';
    }

    
    
    
}
