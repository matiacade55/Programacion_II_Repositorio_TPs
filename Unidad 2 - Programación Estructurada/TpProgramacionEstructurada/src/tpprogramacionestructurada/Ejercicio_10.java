
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el stock actual: ");
        int stock_actual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa la cantidad vendida: "); 
        int cant_vendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa la cantidad recibida actual: ");   
        int cant_recibida = Integer.parseInt(input.nextLine());
        
        int stock_actualizado = actualizarStock(stock_actual, cant_vendida, cant_recibida);
        
        System.out.println("Stock Actual: " + stock_actual + "\n"
                            + "Cantidad Vendida: " + cant_vendida + "\n"
                            + "Cantidad Recibida: " + cant_recibida + "\n"
                            + "Stock Actualizado: " + stock_actualizado);
        
    }
    
    public static int actualizarStock(int stock_actual, int cant_vendida, int cant_recibida) {
        
        int nuevo_stock = stock_actual - cant_vendida + cant_recibida;
        return nuevo_stock;
        
    } 
    
}
