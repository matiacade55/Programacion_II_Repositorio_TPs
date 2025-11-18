
package Ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> misFiguras = new ArrayList<>();
        
        // Upcasting: porque la lista es del tipo Figura y le instanciamos subclases
        misFiguras.add(new Circulo(10.0));  
        misFiguras.add(new Rectangulo(8.0, 5.0));
        misFiguras.add(new Circulo(3.5));
        misFiguras.add(new Rectangulo(10.0, 2.0));
        
        for (Figura fig : misFiguras) {
            
            // Polimorfismo: "fig" es de tipo Figura, pero Java sabe si es un Circulo o
            // un Rectangulo y llama al método calcularArea() correcto.
            
            System.out.println("Area del " + fig.getNombre() + ": " + fig.calcularArea());
        }
        
    }
    
}
