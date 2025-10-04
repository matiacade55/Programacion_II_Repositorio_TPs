
package Ejercicio_13;

/**
 *
 * @author matif
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        
        // Dependencia de creacion
        CodigoQR codQR = new CodigoQR(valor); 
            
        codQR.setUsuario(usuario);// Asoc unidireccional, se setea desde aca
        
        System.out.println("ValorQR: " + codQR.getValor());
        
    }
    
}
