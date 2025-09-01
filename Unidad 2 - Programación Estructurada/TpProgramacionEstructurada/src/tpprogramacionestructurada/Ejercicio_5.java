
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        int num, suma;
        
        num = 1;
        suma = 0;

        while (num != 0) {

            System.out.print("Ingresa un número entero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            
            if (num % 2 == 0) {
                suma += num;
            }
            
        }
        
        System.out.println("La suma de los numeros pares ingresados es: " + suma);
    }
    
}
