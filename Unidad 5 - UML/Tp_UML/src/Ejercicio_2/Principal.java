
package Ejercicio_2;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Bateria bateria = new Bateria("M2025", 5000);
        Celular celular = new Celular("AE1234", "Motorola", "Edge30", bateria);
        Usuario usuario = new Usuario("Roberto Gomez", "18978231");
        
        celular.verInfo();
        
        // Bidireccional
        usuario.setCelular(celular);
        
        System.out.println("Usuario: " + usuario.getNombre() + "\n"
                            + "Celular: " + usuario.getCelular().getModelo() + "\n"
                            + "Marca: " + usuario.getCelular().getMarca());
        
    }
}
