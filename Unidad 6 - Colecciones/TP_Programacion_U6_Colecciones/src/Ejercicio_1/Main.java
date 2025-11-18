/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Main {
 
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("P_1", "Notebook HP", 500000, 2, CategoriaProducto.ELECTRONICA);
        Producto producto2 = new Producto("P_2", "Camiseta Futbol", 65000, 6, CategoriaProducto.ROPA);
        Producto producto3 = new Producto("P_3", "Alfombra Bienvenida", 7000, 10, CategoriaProducto.HOGAR);
        Producto producto4 = new Producto("P_4", "Pava Electrica", 35000, 3, CategoriaProducto.HOGAR);
        Producto producto5 = new Producto("P_5", "Alfajores caja x 10", 6000, 15, CategoriaProducto.ALIMENTOS);
        
        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);
        
        double precioMin = 5000;
        double precioMax = 40000;
        
        // LISTAR TODOS LOS PRODUCTOS CREADOS
        inventario.listarProductos();
        
        // BUSQUEDA POR ID
        System.out.println("--- Buscando por Id... ---");
        Producto productoEncontrado = inventario.buscarProductoPorId("P_1");
        
        // Verificar si es nulo
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado!");
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("El producto con ese ID no existe.");
        }
        
        // ELIMINACION DE UN PRODUCTO
        inventario.eliminarProducto("P_1");
        //Corroboro que se haya eliminado
        inventario.listarProductos();
        
        //ACTUALIZAR STOCK DE UN PRODUCTO
        inventario.actualizarStock("P_2", 15);
        
        // FILTRAR POR CATEGORIA
        CategoriaProducto categoria = CategoriaProducto.HOGAR;
        
        System.out.println("--- Filtrando por Categoria... ---");
        ArrayList<Producto>listaPorCategoria = inventario.filtrarPorCategoria(categoria);
         if(listaPorCategoria.isEmpty()){
            System.out.println("No se encontraron productos para la categoria seleccionada.");
        }else{
            System.out.println("----Productos encontrados para la categoria " + categoria);
            for (Producto productoListado : listaPorCategoria) {
                productoListado.mostrarInfo();
            }
        
        }
        
        // OBTENER STOCK TOTAL teniendo en cuenta eliminados y actualizados
        System.out.println("--- Stock Total: ---");
        System.out.println(inventario.obtenerTotalStock());
        
        //OBTENER LISTADO DE PRODUCTOS CON MAS STOCK
        System.out.println("--- Productos con mayor stock ---");
        
        ArrayList<Producto> listaMaxStock = inventario.obtenerProductoConMayorStock();

        if (listaMaxStock.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            
            for (Producto p : listaMaxStock) {
                p.mostrarInfo();
                System.out.println("--------------------");
            }
        }
        
        //OBTENER PRODUCTOS DENTRO DE UN RANGO DE PRECIOS
        System.out.println("--- Productos por rango de precios ---");
        System.out.println("Los productos cuyo precio se encuentra entre $" + precioMin + " y $" + precioMax + " son: ");
        ArrayList<Producto> listaPorPrecios = inventario.filtrarProductosPorPrecio(precioMin, precioMax);
        
        if(listaPorPrecios.isEmpty()){
            System.out.println("no se encontraron productos en el rango de precios indicado.");
        }else{
            for (Producto p : listaPorPrecios) {
                p.mostrarInfo();
            }
        }
        
        //MOSTRAR CATEGORIAS DISPONIBLES
        inventario.mostrarCategoriasDisponibles();
    }
    
}
