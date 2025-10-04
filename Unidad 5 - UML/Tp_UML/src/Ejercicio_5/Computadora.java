
package Ejercicio_5;

/**
 *
 * @author magap
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composicion
    private Propietario propietario; // Asoc Bidireccional

    //public Computadora() {
    //}

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); // Composicion
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", " + placaMadre + '}';
    }
    
    
}
