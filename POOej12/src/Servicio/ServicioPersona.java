
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class ServicioPersona {

private Scanner leer=new Scanner(System.in);

public Persona CrearPersona(){
    Persona pt=new Persona();
    Scanner leer=new Scanner(System.in);
    System.out.print("ingrese nombre: ");
    pt.setNombre(leer.nextLine());
    int anio,mes,dia;
    System.out.println("ingrese fecha de nacimiento");
    System.out.print("año: ");anio=leer.nextInt();
    System.out.print("mes: ");mes=leer.nextInt();
    System.out.print("dia: ");dia=leer.nextInt();
    
    Date fechac=new Date (anio-1900,mes-1,dia);
    pt.setNacimiento(fechac);
    System.out.println(" "+pt.getNacimiento());
    
    return pt;
}
 public long calcularEdad(Persona pt){
     Date fechaActual=new Date();
     long diferenciams=fechaActual.getTime()-pt.getNacimiento().getTime();
     long difdias=diferenciams/(24*60*60*1000);
     long difanios=difdias/(365);
     System.out.println("la edad del usuario es: " +difanios +" años");
     return difanios;
 }   
 public boolean menorQue(Persona pt,int edad, int calcularEdad){
     if (edad<calcularEdad) {
         return true;
     }else{
         return false;
     }
 }
 
}
