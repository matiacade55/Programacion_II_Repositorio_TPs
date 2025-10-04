
package Ejercicio_12;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Rosales Julian", "20369322136");
        Impuesto impuesto = new Impuesto(1500, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        calculadora.calcular(impuesto);
        
    }
    
}
