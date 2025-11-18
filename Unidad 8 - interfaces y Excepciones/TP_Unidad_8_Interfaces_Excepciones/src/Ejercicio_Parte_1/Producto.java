
package Ejercicio_Parte_1;

/**
 *
 * @author matif
 */
public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

  
    // Implementación del método de la interfaz Pagable.
    @Override
    public double calcularTotal() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio;
    }
    
}
