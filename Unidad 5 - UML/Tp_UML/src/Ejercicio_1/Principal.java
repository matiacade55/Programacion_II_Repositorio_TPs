
package Ejercicio_1;

/**
 *
 * @author matif
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pasaporte pasaporte = new Pasaporte("A05","05-10-24","http://utn.com",".png");
        
        pasaporte.mostrarDatos();
                
        // Al "eliminar" el pasaporte se "elimina" la foto (composicion)
        // pasaporte = null;
        // pasaporte.mostrarDatos();
        
        Titular titular = new Titular("Carlos Rodriguez", "36154487");
        
        // Asociacion
        pasaporte.setTitular(titular);
        
        System.out.println("Titular: " + titular.getNombre() + "\n"
                           + "Pasaporte: " + titular.getPasaporte().getNumero());
        
        
    }
    
}
