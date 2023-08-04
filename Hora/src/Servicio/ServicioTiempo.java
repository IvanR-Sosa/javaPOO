package Servicio;

import Entidad.Tiempo;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioTiempo {

    Scanner leer = new Scanner(System.in);

    public Tiempo imprimirHora() {
        Tiempo hora = new Tiempo();
        System.out.print("ingrese los segundos: ");
        hora.setSegundos(leer.nextInt());
        System.out.print("ingrese los minutos: ");
        hora.setMinutos(leer.nextInt());
        System.out.print("ingrese la hora: ");
        hora.setHoras(leer.nextInt());
        System.out.println("");

        return hora;
    }

    public void corre(Tiempo hora) throws InterruptedException {
        boolean band = true;
        String parar = "";
        while (band) {

            hora.setSegundos(hora.getSegundos() + 1);
            if (hora.getSegundos() > 59) {
                hora.setSegundos(0);
                hora.setMinutos(hora.getMinutos() + 1);
                if (hora.getMinutos() > 59) {
                    hora.setHoras(hora.getHoras() + 1);
                    hora.setMinutos(0);
                }
                if (hora.getHoras() > 23) {
                    band = false;
                }
            }

            System.out.println(hora.getHoras() + ":" + hora.getMinutos() + ":" + hora.getSegundos());
            Thread.sleep(1000);

        }
    }

    public void real(Tiempo hora) {
        boolean bandera = false;
       while (true)
           
            try {

                Calendar c = Calendar.getInstance();

                hora.setHoras(c.get(Calendar.HOUR));
                hora.setMinutos(c.get(Calendar.MINUTE));
                hora.setSegundos(c.get(Calendar.SECOND));
                String horasReal = hora.getHoras() + ":" + hora.getMinutos() + ":" + hora.getSegundos();
                System.out.println(horasReal);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("error");
            }
           
            
        }
       

    }

