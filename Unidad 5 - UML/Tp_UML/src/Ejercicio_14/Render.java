
package Ejercicio_14;

/**
 *
 * @author matif
 */
public class Render {
    
    private String formato;
    private Proyecto proyecto; // asoc unidireccional

    public Render(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    
    
}
