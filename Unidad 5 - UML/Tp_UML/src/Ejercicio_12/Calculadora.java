
package Ejercicio_12;

/**
 *
 * @author matif
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        System.out.println("El impuesto aplicado al contribuyente " + impuesto.getContribuyente().getNombre() + " es de: $" + impuesto.getMonto());
    }
    
}
