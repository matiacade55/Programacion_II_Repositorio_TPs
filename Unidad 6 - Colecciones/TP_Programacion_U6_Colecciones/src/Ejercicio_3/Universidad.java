
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matif
 */
public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();; // Si no la inicializo queda nula
    private List<Curso> cursos = new ArrayList<>(); // Si no la inicializo queda nula

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p) {
    
    // 1. Cláusula de guarda para 'null'
    if (p == null) {
        System.out.println("No se ha indicado un profesor a agregar.");
        return; // Salgo del metodo
    }
    
    // 2. Cláusula de guarda para 'duplicado'
    // (Como ya salimos si era 'null', no necesitamos 'else if')
    if (profesores.contains(p)) {
        System.out.println("El profesor " + p.getNombre() + " ya se encuentra en la lista.");
        return; // Salimos también
    }
    
    // 3. Lógica principal (solo llega aquí si pasó todo)
    profesores.add(p);
    System.out.println("El profesor " + p.getNombre() + " fue agregado con exito.");
}
    
    public void agregarCurso(Curso c){
        
        if(c == null){
            System.out.println("No se ha indicado un curso a agregar.");
        }else if(cursos.contains(c)){
            System.out.println("El curso " + c.getNombre() + " ya se encuentra en la lista.");
        }else{
            cursos.add(c);
            System.out.println("El curso " + c.getNombre() + " fue agregado con exito.");
        }
    }
    
    //→ Usa setProfesor del curso.
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){ 
        
        // Busco los objetos
        Curso cursoEncontrado = this.buscarCursoPorCodigo(codigoCurso);
        Profesor profesorEncontrado = this.buscarProfesorPorId(idProfesor);

        // Valido que ambos existan
        if (cursoEncontrado == null) {
            System.out.println("Error: No se encontró el curso con código " + codigoCurso);
            return;
        }
        if (profesorEncontrado == null) {
            System.out.println("Error: No se encontró el profesor con ID " + idProfesor);
            return;
        }

        // Delego toda la lógica a setProfesor
        System.out.println("Asignando profesor " + profesorEncontrado.getNombre() + " a curso " + cursoEncontrado.getNombre());
        cursoEncontrado.setProfesor(profesorEncontrado);
        
    }
    
    public void listarProfesores(){
        
        if(profesores.isEmpty()){
            System.out.println("No se encontraron profesores.");
        }else{
            for(Profesor profe : profesores){
                profe.mostrarInfo();
            }
        }
    }
    
    public void listarCursos(){
        
        if(cursos.isEmpty()){
            System.out.println("No se encontraron cursos.");
        }else{
            for(Curso curso : cursos){
                curso.mostrarInfo();
            }
        }
    }
    
    public Profesor buscarProfesorPorId(String id){
        
        for (Profesor p : this.profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p; // Encontrado
            }
        }
        return null; // No encontrado
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        
        for (Curso c : this.cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c; // Encontrado
            }
        }
        return null; // No encontrado
    }
    
    //→ Debe romper la relación con su profesor si la hubiera.
    public void eliminarCurso(String codigo){
        
        // Buscar el curso
        Curso cursoAEliminar = this.buscarCursoPorCodigo(codigo);

        // 2. Validar que exista
        if (cursoAEliminar == null) {
            System.out.println("No se puede eliminar: Curso con código " + codigo + " no encontrado.");
            return;
        }

        // Romper la relación (¡esta es la parte clave!)
        // Al poner el profesor en 'null', el método setProfesor
        // se encarga de quitar este curso de la lista del profesor.
        cursoAEliminar.setProfesor(null);

        // Eliminar el curso de la lista principal de la universidad
        this.cursos.remove(cursoAEliminar);

        System.out.println("Curso " + cursoAEliminar.getNombre() + " eliminado correctamente.");
        
    } 
    
    //→ Antes de remover, dejar null los cursos que dictaba.
    public void eliminarProfesor(String id){
        
        // Buscar al profesor
        Profesor profesorAEliminar = this.buscarProfesorPorId(id);

        // Validar
        if (profesorAEliminar == null) {
            System.out.println("No se puede eliminar: Profesor con ID " + id + " no encontrado.");
            return;
        }

        // Romper todas las relaciones (la forma más segura)
        // Mientras la lista de cursos del profesor no esté vacía...
        while (!profesorAEliminar.getCursos().isEmpty()) {

            // Obtengo el primer curso de su lista
            Curso curso = profesorAEliminar.getCursos().get(0);

            // Le digo al curso que su profesor es 'null'.
            // Esto dispara la lógica de setProfesor(null), que
            // llama a profesorAEliminar.eliminarCurso(curso),
            // quitándolo de la lista y achicándola.
            curso.setProfesor(null);
        }
        // El bucle termina cuando la lista de cursos del profesor está vacía.

        // Eliminar al profesor de la lista principal de la universidad
        this.profesores.remove(profesorAEliminar);

        System.out.println("Profesor " + profesorAEliminar.getNombre() + " eliminado correctamente.");

    }
    
}
