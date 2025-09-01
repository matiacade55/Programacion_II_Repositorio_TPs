
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingresá un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if (anio % 400 == 0){
            
            System.out.println("El año ingresado es BISIESTO."); 
            
        }else if(anio % 4 == 0 && anio % 100 != 0){
            
                System.out.println("El año ingresado es BISIESTO.");
                
        }else{
            
            System.out.println("El año ingresado NO ES BISIESTO");
            
        }
    }
    
}
