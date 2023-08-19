package Servicio;

import Entidad.Tiempo;

import java.util.*;


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

    public void real(Tiempo hora)throws InterruptedException {
         
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("para terminar presione enter");
            Thread inputThread = new Thread(() ->{
               /*
                aqui lo que vamos a hacer es permitir el ingreso de la tecla enter en cualquier momento
                sin necesidad de pedir el llamado por teclado
                */
                leer.nextLine();//espera hasta que el usuario presione enter.
            });
            //el start es para que se inicie una condicion dentro del hilo 
            inputThread.start();
       while (true){
           Calendar c = Calendar.getInstance();
                hora.setHoras(c.get(Calendar.HOUR));
                
                hora.setMinutos(c.get(Calendar.MINUTE));
       
                hora.setSegundos(c.get(Calendar.SECOND));
                String horasReal = hora.getHoras() + ":" + hora.getMinutos() + ":" + hora.getSegundos();
                System.out.println(horasReal);
                Thread.sleep(1000);
                //isAlive va de la mano con start en este caso el es el que espera el ingreso de la tecla para que el break rompa el ciclo
           if (!inputThread.isAlive()) {
               break;
           }
     
       }       
           
        }
    }
         
            
    }

