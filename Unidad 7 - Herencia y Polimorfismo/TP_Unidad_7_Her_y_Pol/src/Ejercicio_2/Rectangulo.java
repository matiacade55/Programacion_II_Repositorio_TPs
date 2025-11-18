
package Ejercicio_2;

/**
 *
 * @author matif
 */
public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo"); // hardcodeo el nombre por lo que no lo pido como parametro
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        // Formula del area del rectangulo: base * altura
        return base * altura;
    }
    
}
