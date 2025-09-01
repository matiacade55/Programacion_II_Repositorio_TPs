
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota = 0;
        
        do {
            
            System.out.print("Por favor, ingresa la nota (0-10): ");
            nota = Double.parseDouble(input.nextLine());
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
            
        }while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente");
        
    }
    
}
