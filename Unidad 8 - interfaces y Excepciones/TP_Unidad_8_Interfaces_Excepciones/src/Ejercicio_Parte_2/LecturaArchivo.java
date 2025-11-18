
package Ejercicio_Parte_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matif
 */
public class LecturaArchivo {
    
    public static void main(String[] args) {
        
        // Nombre del archivo a leer ubicado en la raiz del proyecto 
        //.../TP_Unidad_8_Interfaces_Excepciones/archivo.txt
        String nombreArchivo = "archivo.txt";
        
        // Declaro el "reader" fuera del "try" para poder cerrarlo en "finally"
        BufferedReader reader = null; 

        try {
            // Intento de abrir el archivo.
            // Esta línea puede lanzar FileNotFoundException (checked)
            reader = new BufferedReader(new FileReader(nombreArchivo));

            System.out.println("--- Contenido del archivo '" + nombreArchivo + "' ---");

            String linea;
            
            // Leer el archivo linea por linea
            // Esta linea puede lanzar IOException (checked)
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            System.out.println("--- Fin del archivo ---");

        } catch (FileNotFoundException e) {
            
            // Si el archivo no se encontro
            // Esto se ejecuta si new FileReader(nombreArchivo) falla.
            System.out.println("******************************************");
            System.out.println("¡ERROR! No se pudo encontrar el archivo: " + nombreArchivo);
            System.out.println("Detalle tecnico: " + e.getMessage());
            System.out.println("******************************************");
        
        } catch (IOException e) {
            
            // Plan C: Otro error de "Entrada/Salida"
            // Esto se ejecuta si reader.readLine() falla (ej: se desconecta el disco)
            System.out.println("******************************************");
            System.out.println("¡ERROR! Ocurrió un error al leer el archivo.");
            System.out.println("Detalle técnico: " + e.getMessage());
            System.out.println("******************************************");
            
        } finally {
            
            // Bloque "finally"
            System.out.println("\n(Programa finalizado. Intentando cerrar el archivo...)");
            try {
                // Debemos comprobar si "reader" no es "null"
                // (podria null si FileNotFoundException ocurrio en la primera linea del 'try')
                if (reader != null) {
                    reader.close(); // Tambien puede lanzar IOException
                    System.out.println("(Archivo cerrado exitosamente.)");
                }
            } catch (IOException e) {
                System.out.println("ERROR al cerrar el archivo! " + e.getMessage());
            }
        }
    }
    
}
