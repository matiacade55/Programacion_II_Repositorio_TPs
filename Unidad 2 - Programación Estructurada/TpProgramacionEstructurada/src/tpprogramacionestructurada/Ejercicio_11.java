
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_11 {
    
    static double descuento_especial = 0.10;
    
    public static void main(String[] args) {
        
        double precio = 200;
        calcularDescuentoEspecial(precio);
        
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuento_aplicado = precio * descuento_especial;
        double precio_final = precio - descuento_aplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuento_aplicado);
        System.out.println("El precio final con descuento es: " + precio_final);
        
    }
    
}
