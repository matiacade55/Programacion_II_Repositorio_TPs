
package Ejercicio_1;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Inventario {
 
    ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println("Listado de productos:");
    if (this.productos.isEmpty()) {
        System.out.println("El inventario está vacío.");
        return;
    }
    for (Producto producto : productos) {
        producto.mostrarInfo();
        }
    }
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while(i < productos.size() && productoEncontrado == null){
            Producto producto = this.productos.get(i);
            if(producto.getId().equalsIgnoreCase(id)){
                productoEncontrado = producto;
            }
            i++;
        }
        return productoEncontrado;
    }
    
    public void eliminarProducto(String id) {
        
        System.out.println("--- Eliminando producto... ---");
        // Reutilizo el metodo para buscar
        Producto productoAEliminar = this.buscarProductoPorId(id);

        // Verifico que exista
        if (productoAEliminar != null) {
            // Si existe lo elimino
            this.productos.remove(productoAEliminar);
            System.out.println("Producto " + productoAEliminar.getNombre() + " eliminado.");
        } else {
            System.out.println("No se encontró un producto con el ID: " + id);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        
        System.out.println("--- Actualizando Stock... ---");
        Producto productoAActualizar = this.buscarProductoPorId(id);
       
        if(productoAActualizar != null){
            productoAActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto " + productoAActualizar.getNombre() + " actualizado. Cantidad Actual: " + nuevaCantidad);
        }else{
            System.out.println("No se pudo actualizar: Producto con ID " + id + " no encontrado.");
        }
        
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
     
        ArrayList<Producto> productosPorCategoria = new ArrayList();
        
        for (Producto producto : this.productos) {
            if(producto.getCategoria() == categoria) // uso == porque es un enum
                productosPorCategoria.add(producto);
        }
            
        return productosPorCategoria;   
    }
    public int obtenerTotalStock(){
        
        int stockTotal = 0;
        
        for(Producto producto : this.productos){
            stockTotal += producto.getCantidad();
        }
        return stockTotal;
    }
    
    public ArrayList<Producto> obtenerProductoConMayorStock(){
        
        ArrayList<Producto> listaMaxStock = new ArrayList();
        int maxStock = -1;
        
        for(Producto p : this.productos){
            //Si encuentro uno mayor, elimino el anterior y agrego el actual
            if(p.getCantidad() > maxStock){
                maxStock = p.getCantidad();
                listaMaxStock.clear();
                listaMaxStock.add(p);
            //Si encuentro uno igual solo lo agrego a la lista
            }else if(p.getCantidad() == maxStock){
                listaMaxStock.add(p);
            }
        }
        
        return listaMaxStock;
    }
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        
        ArrayList<Producto> productosPorPrecio = new ArrayList();
        
        for(Producto producto: this.productos){
            if(producto.getPrecio() >= min && producto.getPrecio() <= max){
                
                productosPorPrecio.add(producto);
            }
        }
        
        return productosPorPrecio;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorias de Productos Disponibles ---");

        // Obtengo un array con [ALIMENTOS, ELECTRONICA, ROPA, HOGAR]
        for (CategoriaProducto categoria : CategoriaProducto.values()) {

            // Imprimo nombre de la constante + descripción
            System.out.println("* " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}
