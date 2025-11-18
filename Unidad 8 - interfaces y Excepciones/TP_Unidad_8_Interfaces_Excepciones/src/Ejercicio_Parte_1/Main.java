
package Ejercicio_Parte_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {

        // CREACION DEL CLIENTE ---
        // Se crea un Cliente. Esta clase implementa "Notificable".
        System.out.println("### 1. Creando Cliente ###");
        Cliente clienteAna = new Cliente("Ana Lopez", "ana.lopez@email.com");
        System.out.println("Cliente Creado: " + clienteAna.getNombre());
        System.out.println("------------------------------------");

        
        // CREACION DEL PEDIDO ---
        // Se crea un Pedido. 
        // - Implementa "Pagable"
        // - Su constructor espera un objeto "Notificable" (el cliente)
        System.out.println("### 2. Creando Pedido ###");
        Pedido pedidoDeAna = new Pedido(clienteAna);


        // AÑADIR PRODUCTOS (EJERCICIO 1 y 2) ---
        // Se crean Productos. 
        // - Implementan "Pagable"
        System.out.println("\n### 3. Añadiendo Productos ###");
        Producto laptop = new Producto("Laptop Pro", 1500.00);
        Producto mouse = new Producto("Mouse USB", 25.50);
        
        pedidoDeAna.agregarProducto(laptop);
        pedidoDeAna.agregarProducto(mouse);
        System.out.println("Productos añadidos al pedido.");


        // CALCULAR TOTAL (Usando Interfaz Pagable) ---
        // Llamamos al metodo de la interfaz Pagable implementado por Pedido.
        System.out.println("\n### 4. Calculando Total ###");
        double totalAPagar = pedidoDeAna.calcularTotal();
        System.out.println("El total del pedido (calculado con Pagable) es: $" + totalAPagar);
        System.out.println("------------------------------------");


        // PROCESAR EL PAGO (EJERCICIO 4) ---
        // Se crea un método de pago.
        // - TarjetaCredito implementa "PagoConDescuento", que hereda de "Pago".
        // Lo guardamos en una variable de tipo "Pago" (polimorfismo).
        System.out.println("### 5. Procesando Pago ###");
        Pago metodoDePago = new TarjetaCredito("1234-5678-9012-3456");

        // Usamos la interfaz "Pago" para procesar el monto.
        boolean pagoExitoso = metodoDePago.procesarPago(totalAPagar);
        System.out.println("------------------------------------");


        // 6. CAMBIAR ESTADO Y NOTIFICAR (Usando Interfaz Notificable) ---
        // El Pedido usa su objeto "Notificable" (el cliente) para avisar.
        System.out.println("### 6. Finalizando y Notificando ###");
        if (pagoExitoso) {
            // Este método internamente llama a cliente.notificar(...)
            pedidoDeAna.cambiarEstado("PAGADO Y EN PREPARACIÓN");
        } else {
            pedidoDeAna.cambiarEstado("PAGO RECHAZADO");
        }

        // Simulación de un segundo cambio de estado
        System.out.println("\n... (pasa un tiempo y el paquete se despacha) ...");
        pedidoDeAna.cambiarEstado("ENVIADO");
    }
    
}
