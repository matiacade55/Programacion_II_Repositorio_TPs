
package Ejercicio_3;

/**
 *
 * @author matif
 */
public class EmpleadoTemporal extends Empleado {
    
    private double precioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double precioPorHora, int horasTrabajadas) {
        super(nombre);
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return precioPorHora * horasTrabajadas;
    }
    
}
