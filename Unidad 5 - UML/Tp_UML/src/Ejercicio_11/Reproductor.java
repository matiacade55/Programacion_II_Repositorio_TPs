
package Ejercicio_11;

/**
 *
 * @author matif
 */
public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        System.out.println("Se esta reproduciendo la cancion " + cancion.getTitulo() + ". Artista: " + 
                            cancion.getArtista().getNombre());
    } 
}
