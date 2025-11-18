
package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matif
 */
public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>(); // Instanciacion dentro del contruuctor (Composicion)
    }
    
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        
        //Se crea el libro dentro del metodo
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }
    
    public void listarLibros(){
        
        System.out.println("Listado de Libros: ");
        if(libros.isEmpty()){
            System.out.println("No se encuentran libros disponibles.");
        }else{
            for(Libro libro : libros){
                libro.mostrarInfo();
            }
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        
        Libro libroEncontrado = null;
        int i = 0;
        while(i < libros.size() && libroEncontrado == null){
            Libro libro = this.libros.get(i);
            if(libro.getIsbn().equalsIgnoreCase(isbn)){
                libroEncontrado = libro;
            }
            i++;
        }
        return libroEncontrado;
    }
    
    public void eliminarLibro(String isbn){
        
        System.out.println("--- Eliminando libro... ---");
        // Reutilizo el metodo para buscar
        Libro libroAEliminar = this.buscarLibroPorIsbn(isbn);

        // Verifico que exista
        if (libroAEliminar != null) {
            // Si existe lo elimino
            this.libros.remove(libroAEliminar);
            System.out.println("Libro " + libroAEliminar.getTitulo()+ " eliminado.");
        } else {
            System.out.println("No se encontró un libro con el ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros(){
        
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        
        ArrayList<Libro> librosPorAnio = new ArrayList<>();
        
        for(Libro libro : libros){
            if(libro.getAnioPublicacion() == anio)
                librosPorAnio.add(libro);
        }
        return librosPorAnio;
    }   
    
    
    public ArrayList<Autor> obtenerAutoresDisponibles(){
        
        ArrayList<Autor> autoresDisponibles = new ArrayList<>(); 
        for (Libro libro : this.libros) {
            Autor autorActual = libro.getAutor();
            if(!autoresDisponibles.contains(autorActual)){
                autoresDisponibles.add(autorActual);   
            }
            
        }
        return autoresDisponibles;
    }
}
