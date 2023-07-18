package pooej3;

import Entidad.Operacion;


public class POOej3 {

    public static void main(String[] args) {
        Operacion llamar = new Operacion();
        llamar.crearOperacion(0, 0);

        System.out.println("la suma es: " + llamar.sumar());
        System.out.println("la resta es: " + llamar.restar());
        System.out.println("la multiplicacion es: " + llamar.multiplicar());
        System.out.println("la division es: " + llamar.dividir());
    }

}
