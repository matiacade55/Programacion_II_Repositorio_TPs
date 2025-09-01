
package tpintroduccionjava;

import java.util.Scanner;

/**
 *
 * @author matif
 */

/*
4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.

*/

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es " + nombre + " y tu edad " + edad + " años.");
        
    }
}
