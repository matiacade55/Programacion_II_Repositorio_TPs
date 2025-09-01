
package tpintroduccionjava;

import java.util.Scanner;

/**
 *
 * @author matif
 */

/*
5. Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
    a. Suma
    b. Resta
    c. Multiplicación
    d. División
    Muestra los resultados en la consola.
*/
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        // Variables
        int num1, num2, suma, resta, multiplicacion;
        double division;
        Scanner input = new Scanner(System.in);
        
        // Inputs
        System.out.print("Ingresa el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double )num1 / num2;
        
        // Prints
        System.out.println("Resultados:\n"
                            + "Suma: " + suma + "\n"
                            + "Resta: " + resta + "\n"
                            + "Multiplicacion: " + multiplicacion + "\n"
                            + "Division: " + division);
        
    }
}
