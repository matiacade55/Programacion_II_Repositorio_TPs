
package Ejercicio_1;

/**
 *
 * @author matif
 */
public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    
    public void mostrarDatos() {
        System.out.println("Pasaporte: " + numero + ", Foto: " + foto.getImagen());
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        
        // Validacion para asociacion bidireccional
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }
      
    
}
