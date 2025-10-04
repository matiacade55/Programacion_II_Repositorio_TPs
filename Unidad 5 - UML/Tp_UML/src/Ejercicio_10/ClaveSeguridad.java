
package Ejercicio_10;

/**
 *
 * @author matif
 */
public class ClaveSeguridad {
    
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    
    
}
