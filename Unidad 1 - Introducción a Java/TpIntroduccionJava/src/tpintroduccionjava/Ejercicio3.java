
package tpintroduccionjava;

/**
 *
 * @author matif
 */

/*
3. Crea un programa que declare las siguientes variables con valores asignados:
    a. String nombre
    b. int edad
    c. double altura
    d. boolean estudiante
    Imprime los valores en pantalla usando System.out.println().
*/

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Variables
        String nombre;
        int edad;
        double altura;
        boolean estudiante;
        
        // Asignación de valores
        nombre = "Matias";
        edad = 34;
        altura = 1.65;
        estudiante = true;
        
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Altura: " + altura + "\n" + "Estudiante: " + estudiante);
        
    }
}
