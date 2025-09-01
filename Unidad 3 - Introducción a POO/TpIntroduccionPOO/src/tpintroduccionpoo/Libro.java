
package tpintroduccionpoo;

import java.time.Year;

/**
 *
 * @author matif
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        
        int anioActual = Year.now().getValue(); // Obtengo el año actual
        
        if (anioPublicacion < 1450 || anioPublicacion > anioActual ){
            System.out.println("Error. El anio ingresado no es válido");
        }else {
            this.anioPublicacion = anioPublicacion;
        }
        
    }
    
    
    
}
