
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author matif
 */
public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>(); // Si no la inicializo queda nula

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public List<Curso> getCursos() {
        return this.cursos;
    }
    
    //→ Agrega el curso a su lista si no está y sincroniza el lado del curso.
    public void agregarCurso(Curso c){
        
        // Valido para evitar duplicados
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
            // NO SINCRONIZO DE VUELTA
        }
    }
            
    //→ Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde).
    public void eliminarCurso(Curso c){
        
        if (c != null) {
            this.cursos.remove(c);
            // NO SINCRONIZO DE VUELTA
        }
    }
    
    //→ Muestra códigos y nombres.
    public void listarCursos(){
       
        for(Curso curso : cursos){
            System.out.println("Curso: " + curso.getCodigo() + "\n"
                                + "Nombre: " + curso.getNombre());
        }
        
    }
    
    //→ Imprime datos del profesor y cantidad de cursos.
    public void mostrarInfo(){
        
        System.out.println("Informacion del profesor:\n"
                            + "ID: " + id + "\n"
                            + "Nombre: " + nombre + "\n"
                            + "Especialidad: " + especialidad + "\n"
                            + "Cantidad de cursos: " + cursos.size());
        
    } 
    
    // --- METODOS REQUERIDOS POR contains() ---

    @Override
    public int hashCode() {
        // Genera un código único basado solo en el ID
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        // Dos profesores son "iguales" si tienen el mismo ID.
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.id, other.id);
    }
}
