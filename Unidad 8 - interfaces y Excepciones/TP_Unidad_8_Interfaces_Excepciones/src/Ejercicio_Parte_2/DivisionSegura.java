
package Ejercicio_Parte_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matif
 */
public class DivisionSegura {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicito los numeros
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

             
            int resultado = dividendo / divisor;

            // Si todo sale bien, muestro el resultado
            System.out.println("-------------------------------------");
            System.out.println("El resultado de " + dividendo + " / " + divisor + " es: " + resultado);
            System.out.println("-------------------------------------");

        } catch (ArithmeticException e) {
            
            // Bloque de captura
            // Esto solo se ejecuta si el 'divisor' fue 0.
            System.out.println("******************************************");
            System.out.println("ERROR! No se puede dividir por cero.");
            System.out.println("Detalle tecnico: " + e.getMessage());
            System.out.println("******************************************");
        
        } catch (InputMismatchException e) {
            
            // Esto maneja el caso de que el usuario no ingrese un número.
            System.out.println("******************************************");
            System.out.println("ERROR! Debe ingresar numeros enteros válidos.");
            System.out.println("******************************************");
        
        } finally {
            
            // Para cerrar recursos.
            scanner.close();
            System.out.println("\n(Programa finalizado. El scanner se ha cerrado.)");
        }
    }
    
}
