
package pooej9;

import Entidad.Matematicas;
import Servicio.MatematicasServicio;


public class POOej9 {

    
    public static void main(String[] args) {
        MatematicasServicio op=new MatematicasServicio();
        Matematicas mate=new Matematicas();
        mate.setNum1(Math.random());
        mate.setNum2(Math.random());
        System.out.println(mate.getNum1());
        System.out.println(mate.getNum2());
        
        System.out.println("----------------------------------");
        op.devolverMayor(mate, mate);
        System.out.println("----------------------------------");
        op.calcularPotencia(mate, mate);
        System.out.println("----------------------------------");
        op.calcularRaiz(mate, mate);
        System.out.println("----------------------------------");
    }
    
}
