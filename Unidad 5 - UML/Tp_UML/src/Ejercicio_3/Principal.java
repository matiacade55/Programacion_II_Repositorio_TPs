
package Ejercicio_3;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Editorial editorial = new Editorial("Ediciones Colihue", "Alvarado 2147");
        Libro libro = new Libro("Martin Fierro", "978155233", editorial);
        Autor autor = new Autor("Jose Hernandez", "argentino");
        
        // Asociacion
        libro.setAutor(autor);
        
        libro.mostrarAutor();
        
        libro.mostrarAutorEditorial();
        
        
    }
    
}
