
package Ejercicio_8;

/**
 *
 * @author matif
 */
public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigo, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigo, fecha, usuario);
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", " + firmaDigital + '}';
    }

    
    
    
}
