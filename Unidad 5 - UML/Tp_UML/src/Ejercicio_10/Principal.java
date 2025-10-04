
package Ejercicio_10;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("011231322225468", 800, "CV088", "26-9-2024");
        Titular titular = new Titular("Alfaro Marcelo", "26333122");
        
        // Asociacion Bidireccional
        cuenta.setTitular(titular);
        
        cuenta.mostrar();
        
        
        
    }
    
}
