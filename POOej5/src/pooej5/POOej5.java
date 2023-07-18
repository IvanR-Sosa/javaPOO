package pooej5;

import Entidad.Cuenta;



public class POOej5 {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.crearCuenta();
        cuenta1.ingresar();
        cuenta1.retirar();
        cuenta1.rapida();
        cuenta1.saldo();
        System.out.println(cuenta1.toString());
        
    }

}
