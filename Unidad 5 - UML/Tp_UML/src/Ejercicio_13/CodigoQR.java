
package Ejercicio_13;

/**
 *
 * @author matif
 */
public class CodigoQR {
    
    private String valor;
    private Usuario usuario; // Asoc unidireccional

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    
}
