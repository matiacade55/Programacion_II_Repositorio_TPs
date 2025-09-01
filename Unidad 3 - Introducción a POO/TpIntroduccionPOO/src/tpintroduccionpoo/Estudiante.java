
package tpintroduccionpoo;

/**
 *
 * @author matif
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nuevo_nombre) {
        nombre = nuevo_nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String nuevo_apellido) {
        apellido = nuevo_apellido;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String nuevo_curso) {
        curso = nuevo_curso;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double nueva_cali) {
        calificacion = nueva_cali;
    }
    
    public void mostarInfo() {
        System.out.println("Nombre: " + nombre + "\n"
                            + "Apellido: " + apellido + "\n"
                            + "Curso: " + curso + "\n"
                            + "Calificación: " + calificacion);
    }
    
    public double subirCalificacion(double puntos) {
        return calificacion += puntos;
    }
    
    public double bajarCalificacion(double puntos) {
        return calificacion -= puntos;
    }
    
}
