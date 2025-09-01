
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

  
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public int ponerHuevos(int cantidad) {
        return huevosPuestos += cantidad;
    }
    
    public int envejecer(int anios) {
        return edad += anios;
    }
    
    public void mostrarEstado(){
        System.out.println("ID Gallina: " + idGallina + "\n"
                            + "Edad: " + edad + "\n"
                            + "Huevos Puestos: " + huevosPuestos); 
    }
    
}
