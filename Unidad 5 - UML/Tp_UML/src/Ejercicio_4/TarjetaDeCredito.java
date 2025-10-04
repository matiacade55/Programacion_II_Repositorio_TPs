
package Ejercicio_4;

/**
 *
 * @author magap
 */
public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente !=null && cliente.getTarjeta() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }
    
    
    
}
