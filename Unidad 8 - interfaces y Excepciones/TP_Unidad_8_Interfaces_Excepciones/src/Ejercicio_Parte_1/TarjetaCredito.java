
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public class TarjetaCredito implements PagoConDescuento {
    
    private String numeroTarjeta;
    private double montoActual; // El monto que se está procesando

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulacion de pago con tarjeta
        System.out.println("Procesando pago de $" + monto + " con Tarjeta " + numeroTarjeta);
        System.out.println("Pago con Tarjeta Aprobado");
        return true;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        
        System.out.println("Aplicando descuento del " + porcentaje + "% a la tarjeta.");
     
        return 100 - (100 * (porcentaje / 100.0)); // Ejemplo: devuelve el monto con descuento
    }
    
}
