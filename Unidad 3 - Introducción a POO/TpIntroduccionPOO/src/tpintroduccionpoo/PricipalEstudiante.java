
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class PricipalEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante();
        
        // Establezco los datos
        e.setNombre("Jorge");
        e.setApellido("Gonzalez");
        e.setCurso("A");
        e.setCalificacion(3); // Calificación inicial
        
        e.mostarInfo();
        e.subirCalificacion(6); // Aumento calificación
        System.out.println(e.getCalificacion());
        e.bajarCalificacion(2.5); // Bajo calificación
        
        System.out.println(e.getCalificacion());
    }
    
}
