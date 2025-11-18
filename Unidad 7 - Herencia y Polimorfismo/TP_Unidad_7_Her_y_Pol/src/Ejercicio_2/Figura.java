
package Ejercicio_2;

/**
 *
 * @author matif
 */
public abstract class Figura {
    
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    // El metodo lo va a implementar despues cada clase a su forma
    public abstract double calcularArea();
    
}
