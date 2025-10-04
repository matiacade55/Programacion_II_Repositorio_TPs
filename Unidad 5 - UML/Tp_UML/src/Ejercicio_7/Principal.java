
package Ejercicio_7;

/**
 *
 * @author magap
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Motor motor = new Motor("Nafta", "A816633Z");
        Vehiculo vehiculo = new Vehiculo("AE808ZZ", "2017", motor);
        Conductor conductor = new Conductor("Leonardo", "A");
        
        vehiculo.setConductor(conductor);
        
        System.out.println(vehiculo);
    }
}
