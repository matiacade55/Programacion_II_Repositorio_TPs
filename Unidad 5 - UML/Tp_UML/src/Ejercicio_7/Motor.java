
package Ejercicio_7;

/**
 *
 * @author magap
 */
public class Motor {
    
    private String tipo;
    private String numeroSerie;


    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
    
    
}
