
package Ejercicio_9;

/**
 *
 * @author matif
 */
public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    //public CitaMedica() {
    //}

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // Metodo para poder setear el paciente
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    // Metodo para poder setear el profesional
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", " + paciente + ", " + profesional + '}';
    }
    
    
    
}
