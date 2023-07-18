
package pooej13;

import Entidad.Curso;
import Servicio.ServicioCurso;


public class POOej13 {

    
    public static void main(String[] args) {
       
        ServicioCurso servicio=new ServicioCurso();
        Curso curso=new Curso();
        
        servicio.crearCurso(curso);
        double gananciaSemanal=servicio.calcularGananciaSemanal(curso);
        System.out.println("La ganancia semanal del curso es: $"+gananciaSemanal);
    }
    
}
