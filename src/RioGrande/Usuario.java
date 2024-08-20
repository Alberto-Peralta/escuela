
package RioGrande;


public class Usuario {

    protected final int id;
    protected final String nombre;
    protected final String apellido;
    protected final String correo;

    
    //Contructor
    public Usuario(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
    }
}
