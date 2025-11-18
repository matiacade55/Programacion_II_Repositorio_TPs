
package Ejercicio_2;

/**
 *
 * @author matif
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio) {
        super("Circulo"); // hardcodeo el nombre por lo que no lo pido como parametro
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        // Formula del area del circulo: PI * radio^2
        return Math.PI * radio * radio;
    }
}    
