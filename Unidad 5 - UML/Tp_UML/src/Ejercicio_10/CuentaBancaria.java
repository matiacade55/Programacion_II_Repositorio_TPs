
package Ejercicio_10;

/**
 *
 * @author matif
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composicion
    private Titular titular; // asociacion bidireccional


    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    // El metodo se crea desde la clase contenedora para no tener acceso directo desde el main
    public void mostrar() {
        System.out.println("Detalles de la cuenta. " + "\n"
                            + "CBU: " + cbu + "\n"
                            + "Saldo: " + saldo + "\n"
                            + "Ultima modificacion de clave: " + clave.getUltimaModificacion() + "\n"
                            + "Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    
}
