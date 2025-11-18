
package Ejercicio_Parte_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matif
 */
public class ValidarEdad {
    
    // Definir el rango valido de edad
    static final int EDAD_MINIMA = 0;
    static final int EDAD_MAXIMA = 120;

    
    // Este método puede lanzar la excepcion.
    // EdadInvalidaException Si la edad está fuera de rango.
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        
        // Logica de validacion
        if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
            // Se lanza la excepcion
            // Creo un nuevo objeto de nuestra excepcion con un mensaje.
            throw new EdadInvalidaException("La edad debe estar entre " + 
                                            EDAD_MINIMA + " y " + EDAD_MAXIMA + 
                                            ". Valor recibido: " + edad);
        }
        
        // Si no se lanzo la excepcion
        System.out.println("La edad " + edad + " es valida.");
    }

    
}
