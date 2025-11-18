
package Ejercicio_4;

/**
 *
 * @author matif
 */
public class Animal {
    
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void describirAnimal() {
        System.out.println("Este animal es un " + this.nombre);
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
    
}
