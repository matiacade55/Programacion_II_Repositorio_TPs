
package Ejercicio_14;

/**
 *
 * @author matif
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        
        // Dependencia de creacion
        Render render = new Render(formato);
        
        render.setProyecto(proyecto); // seteo un proyecto al render
        
        System.out.println("Video exportado en formato: " + render.getFormato() + "\n"
                            + "Proyecto: " + proyecto.getNombre() + "\n"
                            + "Duracion: " + proyecto.getDuracionMin() + " min.");
        
    }
    
}
