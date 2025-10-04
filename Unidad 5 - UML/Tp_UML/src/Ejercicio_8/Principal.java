
package Ejercicio_8;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Carlos Gonzales", "carlosg@gmail.com");
        Documento documento = new Documento("Titulo de Propiedad", "Declaracion Jurada", "AR123", "19-08-2025", usuario);
        
        System.out.println(documento);
    }
}
