
package Ejercicio_4;

/**
 *
 * @author matif
 */
public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
    
}
