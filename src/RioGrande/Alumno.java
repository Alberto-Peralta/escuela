
package RioGrande;


public class Alumno extends Usuario{
    private float calificacion;

    public Alumno(int id, String nombre, String apellido, String correo,float  calificacion) {
        super(id, nombre, apellido, correo);
        this.calificacion = calificacion;
    }


    public float guardarCalificacion(float calificacion) {
        this.calificacion = calificacion;
        return calificacion;
    }
    
     public void mostrarCalificaciones() {
        System.out.println("Calificación: " + calificacion);
    }
}

