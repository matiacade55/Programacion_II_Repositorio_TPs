
package Ejercicio_3;

/**
 *
 * @author matif
 */
public class Main {
    
    public static void main(String[] args) {
        
        // CREAR AL MENOS 3 PROFESORES
        Profesor profesor1 = new Profesor("PRF_01", "Santiago Moreno", "Matematicas");
        Profesor profesor2 = new Profesor("PRF_02", "Martin Garcia", "Ciencias Naturales");
        Profesor profesor3 = new Profesor("PRF_03", "Mabel Caceres", "Ingles");
        
        // CREAR AL MENOS 5 CURSO
        Curso curso1 = new Curso("CUR_01", "1_A");
        Curso curso2 = new Curso("CUR_02", "2_C");
        Curso curso3 = new Curso("CUR_03", "3_B");
        Curso curso4 = new Curso("CUR_04", "4_A");
        Curso curso5 = new Curso("CUR_05", "5_B");
        
        // CREAR LA UNIVERSIDAD
        Universidad universidad = new Universidad("UTN");
        
        // ASIGNAR PROFESORES Y CURSOS A LA UNIVERSIDAD
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // ASIGNAR PROFESORES A CURSOS
        universidad.asignarProfesorACurso("CUR_01", "PRF_03");
        universidad.asignarProfesorACurso("CUR_02", "PRF_02");
        universidad.asignarProfesorACurso("CUR_03", "PRF_03");
        universidad.asignarProfesorACurso("CUR_04", "PRF_01");
        universidad.asignarProfesorACurso("CUR_05", "PRF_01");
        
        // LISTAR CURSOS CON SU PROFESOR
        System.out.println("Listado de Cursos con sus respectivos Profesores: ");
        universidad.listarCursos();
        
        // LISTAR PROFESORES CON SU CURSO
        System.out.println("Listado de Profesores con sus respectivos Cursos: ");
        universidad.listarProfesores();
        
        // CAMBIAR EL PROFESOR DE UN CURSO
        System.out.println("Cambiando el profe de un curso...");
        universidad.asignarProfesorACurso("CUR_01", "PRF_02");
        System.out.println("Listado de profes con sus cursos despues de la modificacion");
        universidad.listarProfesores();
        
        // REMOVER UN CURSO Y CONFIRMAR...
        System.out.println("ELIMINANDO CURSO Y CORROBORANDO CON PROFE...");
        universidad.eliminarCurso("CUR_01");
        universidad.listarCursos();
        
        // REMOVER UN PROFESOR Y DEJAR PROFESOR = NULL
        // AL ELIMINAR A MARTIN GARCIA PRF_02, NO DEBE APARECER EN EL 
        //LISTADO Y CUR_02 DEBE QUEDAR CON PROFE SIN ASIGNAR
        System.out.println("ELIMINANDO PROFESOR...");
        universidad.eliminarProfesor("PRF_02");
        System.out.println("Cursos despues de eliminado Martin Garcia");
        universidad.listarCursos();
        System.out.println("Lista de Profes despues de eliminado Martin Garcia");
        universidad.listarProfesores();
        
        // MOSTRAR CANTIDAD DE CURSOS POR PROFESOR
        System.out.println("Cantidad de Cursos por Profesor: ");
        universidad.listarProfesores();
        
        
        
        
        
    }
    
}
