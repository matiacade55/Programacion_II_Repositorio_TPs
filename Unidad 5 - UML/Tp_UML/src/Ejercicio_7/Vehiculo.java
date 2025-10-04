
package Ejercicio_7;

/**
 *
 * @author magap
 */
public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor; // Agregacion
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() {
        return patente;
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", " + motor + ", " + "conductor=" + conductor.getNombre() + '}';
    }
    
}
