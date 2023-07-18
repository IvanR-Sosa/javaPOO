
package Servicio;

import Entidad.Curso;
import java.util.Scanner;


public class ServicioCurso {
    Scanner leer=new Scanner(System.in);
    public Curso cargarAlumnos(){
        
        Curso curso=new Curso();
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.print("Ingrese nombre de alumno: ");curso.getAlumnos()[i]=leer.nextLine();
        }
        return curso;
    }
    
    public void crearCurso(Curso curso){
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese nombre del curso: ");curso.setNombreCurso(sc.nextLine());
        System.out.print("ingrese la cantidad de horas por dia: ");curso.setHorasDia(sc.nextInt());
        System.out.print("ingresen cantidad de dias por semana: ");curso.setDiasSemana(sc.nextInt());
        sc.nextLine(); // Consumir nueva línea pendiente
        System.out.print("ingrese turno (mañana o tarde): ");curso.setTurno(sc.nextLine());
        System.out.print("ingrese el precio por hora: ");curso.setPrecioHora(sc.nextInt());
        
        curso=cargarAlumnos();//aqui estamos cargando el metodo anterior en este metodo
   }
    public double calcularGananciaSemanal(Curso curso){
       double gananciaSemanal=curso.getHorasDia()*curso.getPrecioHora()*curso.getAlumnos().length*curso.getDiasSemana();
       return gananciaSemanal;
   }
}
    

