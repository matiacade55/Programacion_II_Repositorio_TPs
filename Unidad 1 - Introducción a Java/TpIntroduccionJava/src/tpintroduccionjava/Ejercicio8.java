
package tpintroduccionjava;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        // Variables
        Scanner input = new Scanner(System.in);
        int num1, num2, resultadoInt;
        double resultadoDouble;
        
        // Inputs
        System.out.print("Ingresa el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Operación con enteros
        resultadoInt = num1 / num2;
        
        System.out.println("División entre enteros. Resultado " + resultadoInt);
        
        // Operación con decimales (Casting)
        resultadoDouble = (double) num1 / (double) num2;
        
        System.out.println("División entre decimales. Resultado " + resultadoDouble);
        
    }
    
}
