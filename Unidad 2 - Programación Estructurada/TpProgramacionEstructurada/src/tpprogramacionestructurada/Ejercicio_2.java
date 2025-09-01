
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num_1, num_2, num_3;
        int mayor = 0;
        
        System.out.print("Ingresá el primer n° entero: ");
        num_1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresá el segundo n° entero: ");
        num_2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresá el tercer n° entero: ");
        num_3 = Integer.parseInt(input.nextLine());
        
        if (num_1 > num_2){
            
            if (num_1 > num_3) {
            
                mayor = num_1;
                        
            }
        }  else if (num_2 > num_3) {
            
            mayor = num_2;
            
        }  else {
            
            mayor = num_3;
            
        } 
        
        System.out.println("El numero mas grande es: " + mayor);
    }
    
}
