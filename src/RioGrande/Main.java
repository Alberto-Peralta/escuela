
package RioGrande;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    float calif;
    Scanner entrada = new Scanner(System.in);
    
    Maestro m1 = new Maestro(1,"Karina","Sanches","kari_san@mail.com");
    Maestro m2 = new Maestro(2,"Beto","Peralta","bet_per@mail.com");
    Maestro m3 = new Maestro(3,"Javier","Santaolalla","javi_san@mail.com");
    Alumno a1 = new Alumno(1,"Karin","chesterton","kari_sh@mail.com",10);
    Alumno a2 = new Alumno(2,"federico","Nitzcshe","fede_ni@mail.com",10);
    Alumno a3 = new Alumno(3,"Yuval","Harari","yuv_har@mail.com",10);
    Tutor  t1 = new Tutor(1,"Jhon","trubi","J_tr@mail.com",a1);
    Tutor  t2 = new Tutor(2,"vic","fran","vic_fran@mail.com",a2);
    Tutor  t3 = new Tutor(3,"Noa","rubi","no_a@mail.com",a3);

    
    
        System.out.println("\ndatos de los Maestros: ");
        m1.mostrarDatos();
        m2.mostrarDatos();
        m3.mostrarDatos();

        System.out.println("\ndatos de los Alumnos: ");
        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();

        
        System.out.println("\ndatos de los Tutoress: ");
        t1.mostrarDatos();
        t2.mostrarDatos();
        t3.mostrarDatos();
    
        System.out.println("Calificacion del alumno "+a1.nombre+" "+a1.apellido+" ");
        calif = entrada.nextFloat();
        a1.guardarCalificacion(calif);
        System.out.println("Calificacion del alumno "+a2.nombre+" "+a2.apellido+" ");
        calif = entrada.nextFloat();
        a2.guardarCalificacion(calif);
        System.out.println("Calificacion del alumno "+a3.nombre+ " "+a3.apellido+" ");
        calif = entrada.nextFloat();
        a3.guardarCalificacion(calif);
        
        
        System.out.println("\n Tutor asignado");
        t1.mostrarDatos();
        t1.mostrarCalificaciones();
    
        System.out.println("\n--------------------");
        t2.mostrarDatos();
        t2.mostrarCalificaciones();
        
        System.out.println("\n--------------------");
        t3.mostrarDatos();
        t3.mostrarCalificaciones();
    
    }
}
