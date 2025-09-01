
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class PrincipalGallina {
    
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina(1);
        gallina1.setEdad(3);
        
        gallina2.setIdGallina(2);
        gallina2.setEdad(2);
        
        System.out.println("---Estado Inicial:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Cambios Gallina 1
        gallina1.envejecer(2);
        gallina1.ponerHuevos(6);
        
        // Cambios Gallina 2
        gallina2.envejecer(1);
        gallina2.ponerHuevos(5);
        
        System.out.println("---Estado final:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
    }
    
}
