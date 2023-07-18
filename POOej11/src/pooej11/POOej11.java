
package pooej11;

import java.util.Date;
import java.util.Scanner;


public class POOej11 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("dia: ");
        int dia=leer.nextInt();
        System.out.print("mes: ");
        int mes=leer.nextInt();
        System.out.print("año: ");
        int anio=leer.nextInt();
        System.out.println("-----------------------------");
        Date fecha=new Date(anio-1900,mes-1,dia);
        System.out.println("la fecha ingresada es: "+fecha);
        Date fechaActual=new Date();
        long diferencia=fecha.getTime()-fechaActual.getTime();//aqui calcula la diferencia en milisegundos
        
        long diferenciaEnDias = diferencia / (24 * 60 * 60 * 1000);//con esta operacion nos va a dar la diferencia en dias
        System.out.println("la diferencia entre fechas en dias es: "+diferenciaEnDias);
        long diferenciaEnAnios=diferenciaEnDias/(365);
        System.out.println("la diferencia entre fechas en anios es: "+diferenciaEnAnios);
    }
    
}
