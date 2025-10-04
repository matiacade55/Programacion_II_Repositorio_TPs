
package Ejercicio_13;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creo el usuario para la asociacion
        Usuario usuario = new Usuario("Alvaro Gonzalez", "alvaro@gmail.com");
        GeneradorQR generador = new GeneradorQR();
                
        generador.generar("1234", usuario);
    }
    
}
