
package Ejercicio_Parte_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matif
 */
public class LecturaArchivoMejorada {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "archivo.txt"; // En la raiz del proyecto

        // Sintaxis de "try-with-resources"
        // Declaramos el 'reader' DENTRO de los parentesis del "try".
        // Cualquier clase que implemente "AutoCloseable" (como BufferedReader) se cerrara automaticamente al salir de este bloque.
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("--- Contenido del archivo '" + nombreArchivo + "' (con try-with-resources) ---");

            String linea;
            
            // Leer el archivo linea por linea
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            System.out.println("--- Fin del archivo ---");

        } catch (FileNotFoundException e) {
            
            // Si el archivo no se encontro
            System.out.println("******************************************");
            System.out.println("ERROR! No se pudo encontrar el archivo: " + nombreArchivo);
            System.out.println("Detalle tecnico: " + e.getMessage());
            System.out.println("******************************************");
        
        } catch (IOException e) {
            
            // 4Otro error de "Entrada/Salida" (por ej: al leer)
            System.out.println("******************************************");
            System.out.println("ERROR! Ocurrio un error al leer el archivo.");
            System.out.println("Detalle tecnico: " + e.getMessage());
            System.out.println("******************************************");
            
        } 
        
        // no hace falta "finally", Java lo hace
        
        System.out.println("\n(Programa finalizado. El 'reader' se cerró automáticamente.)");
    }
        
  
}
