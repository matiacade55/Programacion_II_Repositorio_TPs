
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class PrincipalMascota {
    
    public static void main(String[] args) {
        
        Mascota masc = new Mascota();
        
        masc.setNombre("Pepe");
        masc.setEspecie("Perro");
        masc.setEdad(5);
        
        masc.mostrarInfo();
        
        masc.cumplirAnios(2);
        
        masc.mostrarInfo();
        
    }
    
}
