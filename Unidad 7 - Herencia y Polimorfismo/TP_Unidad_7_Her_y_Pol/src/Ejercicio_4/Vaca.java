
package Ejercicio_4;

/**
 *
 * @author matif
 */
public class Vaca extends Animal{
    
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuuu!");
    }
    
}
