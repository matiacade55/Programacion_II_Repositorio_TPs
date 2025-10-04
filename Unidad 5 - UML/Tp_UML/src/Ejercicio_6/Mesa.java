
package Ejercicio_6;

/**
 *
 * @author magap
 */
public class Mesa {
    
    private String numero;
    private int capacidad;

    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
