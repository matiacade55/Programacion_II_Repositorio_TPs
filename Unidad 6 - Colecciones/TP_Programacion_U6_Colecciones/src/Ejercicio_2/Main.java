
package Ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        
        //Creo los autores
        System.out.println("--- CREACION DE AUTORES ---");
        Autor autor1 = new Autor("A_1", "Pedro Rodriguez", "Argentino");
        Autor autor2 = new Autor("A_2", "Maria Fernandez", "Peruana");
        Autor autor3 = new Autor("A_3", "Carlos Meneces", "Brasilero");
        
        //Los libros se crean, se agregan a la biblioteca y se les asigna el autor
        System.out.println("--- CREACION DE LIBROS ---");
        biblioteca.agregarLibro("7986531456913", "Las aventuras de Carlitos", 2000, autor1);
        biblioteca.agregarLibro("5236964712503", "80 dias en Rumania", 2010, autor2);
        biblioteca.agregarLibro("9995234687521", "Como vivir mejor", 1998, autor3);
        biblioteca.agregarLibro("2316991013215", "Rodriguez y sus mejores amigos", 1960, autor2);
        biblioteca.agregarLibro("3514657961321", "Memorias de un colectivero", 2010, autor1);
        
        // LISTAR LIBROS CON SU INFO Y LA DE SU AUTOR
        System.out.println("--- LISTAR LIBROS CON SU INFO Y LA DE SU AUTOR ---");
        biblioteca.listarLibros();
        
        // BUSCAR UN LIBRO POR SU ISBN Y MOSTRAR SU INFO
        System.out.println("--- BUSCAR UN LIBRO POR SU ISBN Y MOSTRAR SU INFO ---");
        String isbn = "7986531456913";
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbn);

        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
        }
        
        // FILTRAR LIBROS DE UN AÑO EN ESPECIFICO
        System.out.println("FILTRAR LIBROS DE UN AÑO EN ESPECIFICO");
        int anioABuscar = 2010;
        ArrayList<Libro>librosPorAnio = biblioteca.filtrarLibrosPorAnio(anioABuscar);
        
        if(librosPorAnio.isEmpty()){
            System.out.println("No se encontraron libros para dicho año de publicacion.");
        }else{
            for(Libro libro : librosPorAnio) {
                libro.mostrarInfo();
            }
        }
        
        // ELIMINAR UN LIBRO POR SU ISBN Y MOSTRAR LISTADO
        System.out.println("--- ELIMINAR UN LIBRO POR SU ISBN Y MOSTRAR LISTADO ---");
        biblioteca.eliminarLibro("3514657961321");
        biblioteca.listarLibros();
        
        // MOSTRAR TOTAL DE LIBROS EN LA BIBLIOTECA
        System.out.println("--- MOSTRAR TOTAL DE LIBROS EN LA BIBLIOTECA ---");
        int totalLibros = biblioteca.obtenerCantidadLibros();
        System.out.println("El total de libros en la biblioteca es: " + totalLibros);
        
        // LISTAR AUTORES DE LOS LIBROS DISPONIBLES
        System.out.println("--- LISTAR AUTORES DE LOS LIBROS DISPONIBLES ---");
        ArrayList<Autor> autores = biblioteca.obtenerAutoresDisponibles();
        
        if(autores.isEmpty()){
            System.out.println("No se encuentran autores por mostrar.");
        }else{
            for(Autor autor : autores){
                autor.mostrarInfo();
            }
        }
        
    }
    
}
