
package Ejercicio_14;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creo el proyecto que va a utilizar el editor de video
        Proyecto proyecto = new Proyecto("Pelicula", 15);
        
        EditorVideo editor = new EditorVideo();
        
        editor.exportar(".mp4", proyecto);
    }
    
}
