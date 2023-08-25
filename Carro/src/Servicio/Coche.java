
package Servicio;

import Entidad.Auto;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Coche {

    Scanner leer=new Scanner(System.in);
    
    public void cargar_ficha(Auto auto){
        System.out.println("ingrese nombre del propietario actual");auto.setPropietario(leer.nextLine());
        System.out.println("ingrese dia en que vence el carnet");int dia=leer.nextInt();
        System.out.println("ingrese mes en que vence el carnet");int mes=leer.nextInt();
        System.out.println("ingrese año en que vence el carnet");int anio=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el color de su auto");auto.setColor(leer.nextLine());
        System.out.println("ingrese el modelo de us auto");auto.setModelo(leer.nextInt());
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR,anio);
        fecha.set(Calendar.MONTH,(mes-1));
        fecha.set(Calendar.DAY_OF_MONTH,dia);
        auto.setCarnet_venc(fecha.getTime());
        Date actual=new Date();
        
    }
    public void mostrar(Auto auto){
        System.out.println("FICHA DE PROPIEDAD DEL AUTO");
        System.out.println("PROPIETATIO: "+auto.getPropietario());
        System.out.println("VENCIMIENTO DE CARNET: "+auto.getCarnet_venc());
        System.out.println("COLOR: "+auto.getColor());
        System.out.println("MODELO: "+auto.getModelo());
        System.out.println("KILOMETRAJE: "+auto.getKm_recorrido());
        
    }
    public void cambio(Auto auto){
        String opcion="";
        
        do {      
            System.out.println("DESEA CAMBIAR DE PROPIETARIO?\nSI\nNO");
            opcion=leer.next();
            
        } while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no"));
        leer.nextLine();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("nombre del nuevo propietario");
            auto.setPropietario(leer.nextLine());
        }else{
            System.out.println("CONSERVAS TU AUTO");
        }
    }
    public void kms(Auto auto){
       
        System.out.println("que cantidad de kilometros ha recorrido hasta hoy?");
        int kmn=leer.nextInt();
        auto.setKm_recorrido(kmn+auto.getKm_recorrido());
        if (auto.getKm_recorrido()>=10000) {
            System.out.println("DEBERIAS REALIZAR UN MANTENIMIENTO PREVENTIVO PARA ASEGURARNOS QUE TODO ESTA EN ORDEN");
        }else{
            System.out.println("AUN NO ES NECESARIO UN MANTENMIENTO PERO RECUERDA ESTAR REVISANDO CONSTANTEMENTE");
        }
        leer.nextLine();
    }
    public void entrega(Auto auto){
        cargar_ficha(auto);
        System.out.println("#######################################################");
        mostrar(auto);
        System.out.println("#######################################################");
        kms(auto);
        System.out.println("#######################################################");
        cambio(auto);
        System.out.println("#######################################################");
        mostrar(auto);
        System.out.println("#######################################################");
    }
}
