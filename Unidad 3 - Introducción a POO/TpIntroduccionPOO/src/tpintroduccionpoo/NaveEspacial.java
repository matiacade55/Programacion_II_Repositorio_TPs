
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    private double limiteMaxCombustible = 150;
    private double limiteMinCombustible = 55;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void despegar() {
        System.out.println("Iniciando despegue! ∧∧∧∧");
    }
    
    public void avanzar(int distancia){
        if (combustible < limiteMinCombustible) {
            System.out.println("Combustible agotado. Recargar antes de avanzar");
        } else {
            combustible -= distancia; // Considero gasto de combusteble x distancia 1:1
            System.out.println("La nave avanzo: " + distancia + " km."); 
        }
    }
    
    public void recargarCombustible(double litros) {
       
        if((combustible + litros) > limiteMaxCombustible ){
            System.out.println("El tanque no tiene capacidad para cargar esos litros.");
            System.out.println("Capacidad disponible: " + (limiteMaxCombustible - combustible) + " litros.");
        }else {
            combustible += litros;
        }
       
    }
    
    public void mostrarEstado() {
        System.out.println("Estado actual: " + "\n"
                            + "Nombre: " + nombre + "\n"
                            + "Combustible: " + combustible + " litros.");
    }
    
}
