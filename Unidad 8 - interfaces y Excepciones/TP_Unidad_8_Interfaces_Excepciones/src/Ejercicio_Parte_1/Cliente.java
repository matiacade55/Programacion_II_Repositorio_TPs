/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public class Cliente implements Notificable {
    
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

 
    // Simulo el envío de una notificacion por email al cliente
    @Override
    public void notificar(String mensaje) {
        System.out.println("---------------------------------");
        System.out.println("NOTIFICACIÓN para: " + this.nombre);
        System.out.println("Enviando email a: " + this.email);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("---------------------------------");
    }
    
    public String getNombre() {
        return nombre;
    }
    
}
