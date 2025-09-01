
package tpprogramacionestructurada;

/**
 *
 * @author matif
 */
public class Ejercicio_12 {
    
    public static void main(String[] args) {
        
        // Array con precios originales
        double precios[] = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        //for each precios originales
        for(double p : precios) {
            
            System.out.println("Precio: " + p);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        
        //for each precio0s modificados
        for(double p : precios) {
            
            System.out.println("Precio: " + p);
        }
        
    }
    
}
