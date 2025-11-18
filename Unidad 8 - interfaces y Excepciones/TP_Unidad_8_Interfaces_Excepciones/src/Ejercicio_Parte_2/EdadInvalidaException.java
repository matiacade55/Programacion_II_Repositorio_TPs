/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Parte_2;

/**
 *
 * @author matif
 */
public class EdadInvalidaException extends Exception {
    
    // Constructor que acepta un mensaje de error.
    // mensaje: El mensaje que describe el por que del error
    
    public EdadInvalidaException(String mensaje) {
        // Paso el mensaje a la clase "padre" (Exception)
        super(mensaje);
    }
    
}
