
package Ejercicio_9;

/**
 *
 * @author matif
 */
public class Principal {
    
    public static void main(String[] args) {
        
        CitaMedica cita = new CitaMedica("01/10/2025", "10:35");
        Paciente paciente = new Paciente("Martinez Juan", "Ospe");
        Profesional profesional = new Profesional("Ferrari Carlos", "Oftalmologo");
        
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println(cita);
    }
    
}
