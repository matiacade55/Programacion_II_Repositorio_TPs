
package Ejercicio_3;

/**
 *
 * @author matif
 */
public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor; // Asociacion
    private Editorial editorial; // Agregacion

                                                 // Agregacion
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial; // Agregacion
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    public void mostrarAutor() {
        System.out.println("El Libro: " + titulo + " fue escrito por el autor: " + autor.getNombre());
    }
    
    public void mostrarAutorEditorial() {
        System.out.println("Libro: " + titulo + "\n"
                            + "Autor: " + autor.getNombre() + "\n"
                            + "Editorial: " + editorial.getNombre());
    }
    
}
