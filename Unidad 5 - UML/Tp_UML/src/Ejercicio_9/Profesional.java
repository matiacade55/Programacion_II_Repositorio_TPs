
package Ejercicio_9;

/**
 *
 * @author matif
 */
public class Profesional {
    
    private String nombre;
    private String especialidad;


    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
