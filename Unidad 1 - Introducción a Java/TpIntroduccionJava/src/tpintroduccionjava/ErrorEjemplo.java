
package tpintroduccionjava;

/**
 *
 * @author matif
 */

/*
9. Corrige el siguiente código para que funcione correctamente. Explica qué error
tenía y cómo lo solucionaste.
    import java.util.Scanner;
    public class ErrorEjemplo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextInt(); // ERROR
    System.out.println("Hola, " + nombre);
    }
    }

*/

import java.util.Scanner;

public class ErrorEjemplo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR
        System.out.println("Hola, " + nombre);
    }
}
