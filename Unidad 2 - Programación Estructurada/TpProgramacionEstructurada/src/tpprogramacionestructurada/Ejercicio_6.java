/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author matif
 */
public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, positivos, negativos, ceros;
        
        positivos = 0;
        negativos = 0;
        ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.print("ingresa el " + i + "°" + "numero entero: ");
            num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                ceros += 1;
            }else if (num < 0) {
                negativos += 1;
            }else {
                positivos += 1;
            }
            
        }
        
        System.out.println("Conteo final\n"
                            + "Positivos: " + positivos + "\n"
                            + "Negativos: " + negativos + "\n"
                            + "Ceros: " + ceros);
        
    }
    
}
