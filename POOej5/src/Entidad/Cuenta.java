package Entidad;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private int DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    private Scanner leer = new Scanner(System.in);

    //metodo para pedir los datos al usuario
    public void crearCuenta() {
        System.out.print("ingrese numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.print("ingrese su DNI: ");
        DNI = leer.nextInt();
        System.out.print("ingrese su dinero: ");
        saldoActual = leer.nextInt();
    }

    //ingresar dinero
    public void ingresar() {
        double ingreso;
        System.out.println("cuanto va a ingressar");
        ingreso = leer.nextDouble();

        saldoActual += ingreso;
        System.out.println("saldo actual: $ "+saldoActual);
    }

    //retiros de dinero
    public double retirar() {
        double retiro;
        System.out.println("cuanto va a retirar");
        retiro = leer.nextDouble();
        if (retiro>saldoActual) {
            System.out.println("no posees esa cantidad solo se te dara lo que posees");
            return (saldoActual-saldoActual);
        }else {
            saldoActual-=retiro;
            System.out.println("saldo actual: $ "+saldoActual);
            return saldoActual;
        }
    }
    //Extraccion rapida solo permite retirar el 20% del saldo
    public void rapida(){
        int por;
        System.out.println("que porcentaje entre 10% y 20% desea retirar digitelo");
        por=leer.nextInt();
        if (por<=20 || por>=10) {
            
            saldoActual=saldoActual-((saldoActual*por)/100);
            System.out.println("saldo actual: $ "+saldoActual);
          
        }else{
            System.out.println("este porcentaje no es permitido");
            System.out.println("saldo actual: $ "+saldoActual);
            
        }
        
    }
    //consultar saldo
    public void saldo(){
        System.out.println("su saldo es: $ "+ saldoActual);
    }
   
    //consulta de datos
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
   
    
    
    
}
