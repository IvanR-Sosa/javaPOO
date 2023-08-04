
package Servicio;

import Entidad.Raices;
import java.util.Scanner;


public class RaicesServicio {
    Scanner leer=new Scanner(System.in);
    
    public Raices crear(){
        Raices ecuacion=new Raices();
        System.out.print("asignar un valor para a: ");ecuacion.setA(leer.nextDouble());
        System.out.print("asignar un valor para b: ");ecuacion.setB(leer.nextDouble());
        System.out.print("asignar un valor para c: ");ecuacion.setC(leer.nextDouble());
        return ecuacion;
    }
    public Double getDiscriminante(Raices ecuacion){
        double discriminante=(Math.pow(ecuacion.getB(), 2))-4*ecuacion.getA()*ecuacion.getC();
        return discriminante;
    }

    public Boolean tieneRaices(Raices ecuacion){
        
        Boolean tiene=true;
        if (getDiscriminante(ecuacion)>=0) {
            tiene=true;
        }else   {
            tiene=false;
        }
        return tiene;
    }
    public Boolean tieneRaiz(Raices ecuacion){
        Boolean tener;
        if (getDiscriminante(ecuacion)==0) {
            tener=true;
        }else{tener=false;}
        return tener;
    }
    public void obtenerRaices(Raices ecuacion){
        if (tieneRaices(ecuacion)==true) {
            Double r1;
            r1=(-ecuacion.getB()+Math.sqrt(getDiscriminante(ecuacion))/(2*ecuacion.getA()));
            Double r2;
            r2=(-ecuacion.getB()-Math.sqrt(getDiscriminante(ecuacion))/(2*ecuacion.getA()));
            System.out.println("las raices son r1: "+r1+" r2: "+r2);
            
        }else{
            System.out.println("no hay raices reales");
        }
    }
    public void obtenerRaiz(Raices ecuacion){
        if (tieneRaiz(ecuacion)) {
            Double raiz=(-ecuacion.getB())/(2*ecuacion.getA());
            System.out.println("la raiz es: "+raiz);
        }else{
            System.out.println("no hay raices reales");
        }
    }
    public void calcular(Raices ecuacion){
        if (tieneRaices(ecuacion)==true) {
            obtenerRaices(ecuacion);
        }else if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        }else{System.out.println("no hay raices reales");}
    }
}
