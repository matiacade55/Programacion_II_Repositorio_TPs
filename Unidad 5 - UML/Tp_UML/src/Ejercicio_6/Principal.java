
package Ejercicio_6;

/**
 *
 * @author magap
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Mesa mesa = new Mesa("14", 6); // Creo primero la mesa para poder pasarla a Reserva
        Reserva reserva = new Reserva("18-09-2025", "12.30", mesa);
        Cliente cliente = new Cliente("Suarez Maria", "2214585599");
        
        reserva.setCliente(cliente);
        
        System.out.println(reserva);
    }
}
