
package Ejercicio_3;

import java.util.Objects;

/**
 *
 * @author matif
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //→ Asigna/cambia el profesor sincronizando ambos lados: o Si tenía profesor previo, quitarse de su lista
    public void setProfesor(Profesor p){
        
        // 1. SI YA TENÍA UN PROFESOR VIEJO, lo desvinculamos
        if (this.profesor != null) {
            // Le decimos al profesor viejo que elimine este curso de SU lista
            this.profesor.eliminarCurso(this);
        }

        // 2. ASIGNAMOS EL NUEVO PROFESOR (sea uno nuevo o sea 'null')
        this.profesor = p;

        // 3. SI EL NUEVO PROFESOR NO ES NULL, lo vinculamos
        if (p != null) {
            // Le decimos al profesor nuevo que agregue este curso a su lista
            p.agregarCurso(this);
        }
    }
    
    //→ Muestra código, nombre y nombre del profesor (si tiene).
    public void mostrarInfo(){
        
        System.out.print("Informacion del curso:\n"
                            + "Codigo: " + codigo + "\n"
                            + "Nombre: " + nombre + "\n");
        
        if (this.profesor != null) {
            // Si no es null, muestro su nombre
            System.out.println("Profesor: " + this.profesor.getNombre());
        } else {
            // Si es null, muestro un mensaje
            System.out.println("Profesor: (Sin asignar)");
        }
        
    }
    
    // --- METODOS REQUERIDOS POR contains() ---

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        // Dos cursos son "iguales" si tienen el mismo código.
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}
