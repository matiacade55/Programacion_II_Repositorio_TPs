
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double precio, precio_final, descuento;
        char categoria;
        
        descuento = 0;
        
        
        System.out.print("Ingresa el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa la categoria del producto: ");
        categoria = Character.toUpperCase(input.nextLine().charAt(0));
        
        switch (categoria) {
            
            case 'A':
                descuento = 10;
                break;
            case 'B':
                descuento = 15;
                break;
            case 'C':
                descuento = 20;
                break;
            default:
                System.out.println("La opcion seleccionada es incorrecta.");
        }
        
        precio_final = precio - (precio * descuento / 100);
        
        System.out.println("Precio original: " + precio + "\n"
                            + "Descuento aplicado: " + descuento + "\n"
                            + " Precio final: " + precio_final);
        
    }
    
}
