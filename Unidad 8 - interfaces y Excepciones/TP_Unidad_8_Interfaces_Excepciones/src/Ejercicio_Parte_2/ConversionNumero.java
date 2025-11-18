
package Ejercicio_Parte_2;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class ConversionNumero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero (ej: 50 o veinte): ");
        
        // Leo la entrada como texto (String)
        String textoIngresado = scanner.nextLine();

        try {
            // Intentamos convertir el texto a un número entero.
            // Esta linea lanza NumberFormatException si el texto no es un numero.
            int numeroConvertido = Integer.parseInt(textoIngresado);

            // Si todo esta bien
            System.out.println("-------------------------------------");
            System.out.println("¡Conversion exitosa!");
            System.out.println("El numero ingresado es: " + numeroConvertido);
            System.out.println("El doble del numero es: " + (numeroConvertido * 2));
            System.out.println("-------------------------------------");

        } catch (NumberFormatException e) {
            
            // Bloque de captura
            // Se ejecuta si Integer.parseInt() falla.
            System.out.println("******************************************");
            System.out.println("ERROR! El texto '" + textoIngresado + "' no es un numero valido.");
            System.out.println("Detalle tecnico: " + e.getMessage());
            System.out.println("******************************************");
        
        } finally {
            
            // Cerrar el scanner
            scanner.close();
            System.out.println("\n(Programa finalizado.)");
        }
    }
}
