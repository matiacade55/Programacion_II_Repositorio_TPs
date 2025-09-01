
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        
        double costo_envio, total_compra;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el peso del paquete en Kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa \"I\" para Internacional o \"N\" para Nacional ");
        char zona_envio = Character.toUpperCase(input.nextLine().charAt(0));
        
        while (zona_envio != 'N' && zona_envio != 'I') {
            System.out.print("Zona inválida. Ingresa \"I\" para Internacional o \"N\" para Nacional: ");
            zona_envio = Character.toUpperCase(input.nextLine().charAt(0));
        }
        
        System.out.print("Ingresa el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        // variable para mostrar el costo del envio
        costo_envio = calcularCostoEnvio(peso, zona_envio);
        
        // Composición
        total_compra = calcularTotalCompra(precio, calcularCostoEnvio(peso, zona_envio));
        
        System.out.println("El costo del envio es: " + costo_envio);
        System.out.println("El total de la compra es: " + total_compra);
        
    }
    
    public static double calcularCostoEnvio(double peso, char zona) {
        
        double precio_kilo, costo_envio;
        
        if (zona == 'I') {
            precio_kilo = 10;
        }else {
            precio_kilo = 5;
        }
        
        costo_envio = precio_kilo * peso;
        
        return costo_envio;
        
    }
    
    public static double calcularTotalCompra(double precio_producto, double precio_envio) {
        
        double total_compra = precio_producto + precio_envio;
        
        return total_compra;
        
    }
    
}
