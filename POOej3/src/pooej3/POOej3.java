package pooej3;

import Entidad.Operacion;
import Servicio.ServicioOperacion;


public class POOej3 {

    public static void main(String[] args) {
        Operacion llamar = new Operacion();
        ServicioOperacion op=new ServicioOperacion();
        llamar=op.cargarOperacion();
        System.out.println("la suma es: "+op.sumar(llamar));
        System.out.println("la resta es: "+op.restar(llamar));
        System.out.println("la multiplicacion es: "+op.multiplicar(llamar));
        System.out.println("la division es: "+op.dividir(llamar));

       
    }

}
