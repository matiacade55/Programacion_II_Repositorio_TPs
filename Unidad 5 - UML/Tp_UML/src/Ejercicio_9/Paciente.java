
package Ejercicio_9;

/**
 *
 * @author matif
 */
public class Paciente {
    
    private String nombre;
    private String obraSocial;


    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }

    
}
