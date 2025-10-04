
package Ejercicio_2;


/**
 *
 * @author matif
 */
public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregacion
    private Usuario usuario; // Asoc Bidireccional

    //public Celular() {
    //}

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
   public void verInfo() {
       System.out.println("Informacion del dispositivo." + "\n" 
                            + "Modelo: " + modelo + "\n" 
                            + "Marca: " + marca + "\n"
                            + "Bateria: " + bateria.getModelo());
   }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
   
    
   
}
