
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_3 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Ingresá tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Sos un NIÑO.");
        } else if (edad <= 17) {
            System.out.println("Sos un ADOLESCENTE.");
        } else if (edad <= 59) {
            System.out.println("Sos un ADULTO.");
        } else {
            System.out.println("Sos un ADULTO MAYOR.");
        }
                
    }
    
}
