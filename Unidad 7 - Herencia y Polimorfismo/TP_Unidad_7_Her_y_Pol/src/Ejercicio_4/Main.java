
package Ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Animal> granja = new ArrayList<>();

        // Upcasting: porque la lista es del tipo Animal y le instanciamos Perro, Gato, etc que son subclases
        granja.add(new Perro("Perro"));
        granja.add(new Gato("Gato"));
        granja.add(new Vaca("Vaca"));
        
        System.out.println("--- Sonidos ---");

        for (Animal animal : granja) {
            
            // metodo definido en Animal
            animal.describirAnimal(); 
            
          
            // Aunque "animal" es de tipo Animal, Java ejecuta el
            // método sobrescrito (@Override) de la subclase real.
            animal.hacerSonido();
            
            System.out.println("--------------------");
        }
    }
    
}
