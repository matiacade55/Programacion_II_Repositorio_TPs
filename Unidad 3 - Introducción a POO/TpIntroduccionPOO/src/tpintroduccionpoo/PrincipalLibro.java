
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class PrincipalLibro {
    
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        
        libro.setTitulo("Harry Potter");
        libro.setAutor("J. K. Rowling");
        
        // Año erróneo
        libro.setAnioPublicacion(2028);
        
        // Año válido
        libro.setAnioPublicacion(2010);
        System.out.println(libro.getAnioPublicacion());
               
    }
    
}
