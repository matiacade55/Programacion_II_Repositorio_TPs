
package Ejercicio_Parte_2;

import static Ejercicio_Parte_2.ValidarEdad.verificarEdad;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matif
 */
public class MainValidarEdad {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese una edad para verificar: ");
            int edadIngresada = scanner.nextInt();

            verificarEdad(edadIngresada);
            
            System.out.println("¡Validacion exitosa!");

        } catch (EdadInvalidaException e) {
            
            // Capturar excepcion personalizada
            System.out.println("******************************************");
            System.out.println("ERROR DE VALIDACION!");
            System.out.println("Detalle: " + e.getMessage()); // mostrar msj personalizado
            System.out.println("******************************************");
        
        } catch (InputMismatchException e) {
            
            // Manejo de error por si ingresan texto
            System.out.println("******************************************");
            System.out.println("¡ERROR! Debe ingresar un número entero.");
            System.out.println("******************************************");
        
        } finally {
            scanner.close();
            System.out.println("\n(Programa finalizado.)");
        }
    }
    
}
