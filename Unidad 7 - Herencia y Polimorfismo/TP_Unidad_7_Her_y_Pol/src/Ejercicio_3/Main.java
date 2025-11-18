
package Ejercicio_3;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
        // Upcasting: porque la lista es del tipo Empleado y le instanciamos subclases
        listaEmpleados.add(new EmpleadoPlanta("Ana Lopez", 300000));
        listaEmpleados.add(new EmpleadoTemporal("Carlos Ruiz", 1500, 80));
        listaEmpleados.add(new EmpleadoPlanta("Maria Sol", 320000));
        listaEmpleados.add(new EmpleadoTemporal("Juan Perez", 1800, 40));
        
        System.out.println("--- 1. Calculo de Sueldos ---");
        for (Empleado emp : listaEmpleados) {
            
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("Sueldo a pagar: $" + emp.calcularSueldo());
            System.out.println("--------------------");
        }
        
        System.out.println("--- 2. Clasificacion de Empleados ---");
        
        int contPlanta = 0;
        int contTemporal = 0;

        for (Empleado emp : listaEmpleados) {
            
            // Pregunto clase de empleado con instanceof
            if (emp instanceof EmpleadoPlanta) {
                System.out.println(emp.getNombre() + " es un empleado de Planta.");
                contPlanta++;
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(emp.getNombre() + " es un empleado Temporal.");
                contTemporal++;
            }
        }
        
        System.out.println("\nResumen:");
        System.out.println("Total Empleados de Planta: " + contPlanta);
        System.out.println("Total Empleados Temporales: " + contTemporal);
    }
    
    
}
