
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public interface Pago {
    

    // Procesa el pago por un monto específico.
    // monto El total a pagar.
    // retorna true si el pago fue exitoso, false en caso contrario.

    boolean procesarPago(double monto);
    
}
