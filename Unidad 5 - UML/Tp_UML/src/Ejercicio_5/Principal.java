
package Ejercicio_5;

/**
 *
 * @author magap
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Computadora compu = new Computadora("Dell", "78859", "Inspiron15", "A520");
        Propietario propietario = new Propietario("Figueroa Oscar", "14895230");
        
        compu.setPropietario(propietario);
        
        System.out.println(compu + "Propietario: " + compu.getPropietario().getNombre());
        
    }
}
