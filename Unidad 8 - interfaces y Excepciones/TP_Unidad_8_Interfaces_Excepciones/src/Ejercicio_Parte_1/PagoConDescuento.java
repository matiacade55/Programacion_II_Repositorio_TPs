
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public interface PagoConDescuento extends Pago {
    
    // Aplica un descuento al monto total
    // porcentaje: El porcentaje de descuento a aplicar
    // retorna el nuevo monto con el descuento aplicado.
 
    double aplicarDescuento(double porcentaje);
    
}
