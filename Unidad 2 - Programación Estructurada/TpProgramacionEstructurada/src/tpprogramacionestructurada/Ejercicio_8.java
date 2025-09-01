
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_8 {
    
    public static double calcularPrecioFinal(double precio_base, double impuesto, double descuento) {
        
        //Paso porcentaje ingresado a decimal
        double impuesto_decimal = impuesto / 100;
        double descuento_decimal = descuento / 100;
        
        // calculo precio final
        double precio_final = precio_base + (precio_base * impuesto_decimal) - (precio_base * descuento_decimal);
        
        return precio_final;
    
    }
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        // Declaro las variables en el mismo input
        System.out.print("Ingresa el precio base del producto: ");
        double precio_base = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa el precio impuesto sobre el producto: ");
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa el descuento a aplicar: ");
        double descuento = Double.parseDouble(input.nextLine());
        
        double precio_final = calcularPrecioFinal(precio_base, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precio_final);
    }
    
}
