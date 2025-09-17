
package tp_poo;

/**
 *
 * @author matif
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados; // Atributo de clase (Contador de empleados creados, inicia en 0).

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        setNombre(nombre); // Uso los Setters que contienen las validaciones
        setPuesto(puesto);
        setSalario(salario);
        Empleado.totalEmpleados++; // Aumento cantidad de empleados
    }
    
    // Sobrecarga del constructor
    public Empleado(String nombre, String puesto) {
        
        // Paso totalEmpleados + 1 como id
        this(Empleado.totalEmpleados + 1, nombre, puesto, 10000);
    }
    
    public double actualizarSalario(int porcentaje) {
        this.salario = this.salario + this.salario * porcentaje / 100;
        System.out.println("El nuevo salario de " + this.nombre + " con el " + porcentaje + "% de aumento es: " + salario);
        return salario;
    }
    
    // Sobrecarga del metodo
    public double actualizarSalario(double montoFijo) {
        this.salario += montoFijo;
        System.out.println("El nuevo salario de " + this.nombre + " con el aumento de " + montoFijo + " es: " + salario);
        return salario;
    }
    
    // Metodo static para que sea propio de la clase
    public static void mostrarCantidadEmpleados() {
        System.out.println("La cantidad de empleados actual es: " + getTotalEmpleados());
    }
    
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El campo nombre no puede ser vacío.");
        }
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        
        if (puesto == null || puesto.trim().isEmpty()) {
            System.out.println("El puesto ingresado en inválido.");
        }
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        } else if(Double.isNaN(salario)) {
            System.out.println("El valor ingresado para el salario es inv{alido");
        }
        this.salario = salario;
    }
        
    // GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
     //TO STRING
    @Override
    public String toString() {
        return "Empleado -> " + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: " + salario;
    }

    
}
