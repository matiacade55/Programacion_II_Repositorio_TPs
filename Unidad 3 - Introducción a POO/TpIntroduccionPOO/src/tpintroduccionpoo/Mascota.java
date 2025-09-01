
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nuevo_nombre) {
        nombre = nuevo_nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String nueva_especie) {
        especie = nueva_especie;
    } 
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int nueva_edad) {
        edad = nueva_edad;
    }  
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n"
                            + "Especie: " + especie + "\n"
                            + "Edad: " + edad);
    }
    
    public int cumplirAnios(int anios) {
        return edad += anios;
    }
    
}
