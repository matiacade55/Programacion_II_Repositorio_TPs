
package tpintroduccionpoo;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class PricipalNaveEspacial {
    
    public static void main(String[] args) {
        
        NaveEspacial nave = new NaveEspacial();
        
        Scanner input = new Scanner(System.in);
        
        nave.setNombre("Nave Nodriza");
        nave.setCombustible(50);
        
        System.out.println("---Primer intento de avance.");
        nave.avanzar(50);
        
        System.out.println("---Recarga de combustible.");
        nave.recargarCombustible(180);
        
        System.out.println("---Segundo intento de avance.");
        nave.avanzar(50);
        
        System.out.println("---Estado.");
        nave.mostrarEstado();
        
        
    }
    
}
