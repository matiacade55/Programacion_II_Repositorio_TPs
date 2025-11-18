
package Ejercicio_Parte_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matif
 */
public class Pedido implements Pagable {
    
    private List<Producto> productos;
    private String estado;
    
    // Pedido no sabe de "Cliente", solo de "Notificable".
    private Notificable clienteANotificar; 

    // para crear un pedido se debe pasar un objeto que cumpla con el contrato de Notificable.
    // cliente: El objeto (Cliente) que recibirá las notificaciones
    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.clienteANotificar = cliente;
        this.estado = "PENDIENTE DE PAGO"; // Estado inicial
        System.out.println("Nuevo pedido creado. Estado inicial: " + this.estado);
    }

    // cambia el estado del pedido y notifica al cliente
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Llama al método de la interfaz.
        this.clienteANotificar.notificar("Su pedido ha cambiado de estado a: " + this.estado);
    }
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double totalPedido = 0.0;
        for (Producto prod : this.productos) {
            totalPedido += prod.calcularTotal();
        }
        return totalPedido;
    }

    @Override
    public String toString() {
        return "Pedido con " + productos.size() + " productos.";
    }
    
}
