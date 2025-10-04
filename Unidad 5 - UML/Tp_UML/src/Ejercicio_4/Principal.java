
package Ejercicio_4;

/**
 *
 * @author magap
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco("Provincia", "30-18236996-6");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4844 0233 1122 8966", "08-10-2027", banco);
        Cliente cliente = new Cliente("Juan Ramirez", "28964446");
        
        cliente.setTarjetaDeCredito(tarjeta); // Asoc Bidireccional
        
        System.out.println("Cliente: " + cliente.getNombre() + "\n"
                            + "Tarjeta: " + cliente.getTarjeta().getNumero() + "\n"
                            + "Banco: " + tarjeta.getBanco().getNombre());
        
    }
    
}
