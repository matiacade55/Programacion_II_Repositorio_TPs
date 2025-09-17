/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_poo;

/**
 *
 * @author matif
 */
public class TP_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(1, "Raul Gomez", "Encargado", 30000);
        Empleado empleado2 = new Empleado("Jose Giemenez", "Repositor"); // id automatico, Salario por defecto
        Empleado empleado3 = new Empleado("Carolina Suarez", "Administrativo"); // id automatico, Salario por defecto
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        // Cantidad de empleados
        Empleado.mostrarCantidadEmpleados();
        
        // Aumento porporcentaje
        empleado1.actualizarSalario(10);
        
        // Aumento por monto fijo
        empleado2.actualizarSalario(2500.0);
        empleado3.actualizarSalario(3000.0);
        
        System.out.println("Información actualizada");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
    }
    
}
