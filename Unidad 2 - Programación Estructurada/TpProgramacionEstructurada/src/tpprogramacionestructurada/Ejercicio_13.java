
package tpprogramacionestructurada;

/**
 *
 * @author matif
 */
public class Ejercicio_13 {
    
    public static void main(String[] args) {
        
        // Array con precios originales
        double precios[] = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        
        // Imprimo precios originales
        imprimirRecur(precios, 0);
        
        precios[2] = 129.99;
        System.out.println("Precios modificados: ");
        imprimirRecur(precios, 0);
        
    }
    
    public static void imprimirRecur(double[] array, int indice) {
            
        // Caso base
            if (indice == array.length) {
                
                return; // Uso return como corte
            }
            
            // Caso recursivo
            System.out.println("Precio: " + array[indice]);
            imprimirRecur(array, indice + 1);
            
            
    }
}
