
package Ejercicio_1;

/**
 *
 * @author matif
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    public void mostrarInfo(){
        
        System.out.println("Datos del vehiculo: " + "\n"
                            + "Marca: " + marca + "\n"
                            + "Modelo: " + modelo);
        
    }
    
}
