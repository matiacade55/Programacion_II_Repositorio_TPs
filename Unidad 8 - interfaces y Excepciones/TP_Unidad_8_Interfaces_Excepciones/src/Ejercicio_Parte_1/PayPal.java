
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public class PayPal implements Pago{
    
    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulacion de pago con PayPal
        System.out.println("Iniciando sesion de PayPal para: " + emailUsuario);
        System.out.println("Procesando pago de $" + monto + " con PayPal.");
        System.out.println("¡Pago con PayPal Aprobado!");
        return true;
    }
    
}
