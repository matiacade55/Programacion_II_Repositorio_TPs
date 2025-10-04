
package Ejercicio_4;

/**
 *
 * @author magap
 */
public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;


    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
