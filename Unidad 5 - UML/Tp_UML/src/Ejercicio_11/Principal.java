
package Ejercicio_11;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista("Los Piojos", "Rock Nacional");
        Cancion cancion = new Cancion("Ruleta", artista);
        Reproductor reproductor = new Reproductor();
    
        reproductor.reproducir(cancion);
    }
    
}
