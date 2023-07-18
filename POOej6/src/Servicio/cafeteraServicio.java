package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class cafeteraServicio {

    private Scanner leer = new Scanner(System.in);

    Cafetera tz = new Cafetera();

    public void llenarCafetera() {

        tz.setCantidadActual(tz.getCapacidadMaxima());
        tz.getCantidadActual();
        System.out.println("capacidad: " + tz.getCantidadActual());

    }

//metodo para llenar la cafetera
    public Cafetera servirTaza() {
       
        System.out.println("que capacidad tiene tu taza en ml: ");
        int capacidad = leer.nextInt();//variable para pedir el tamaño de la taza 
        System.out.println("cuantos ml te deseas servir: ");
        int servir = leer.nextInt();//se pide cuanto servir

        if (servir < capacidad) {//aqui se indica si le hizo falta para llenar
            System.out.println("tu taza no quedo llena le faltaron: " + (capacidad - servir) + " ml");
            /**
             * se reajusta el valor de cantidad actual para poder 
             * usarlo en los distintos procesos bajo el valor resultante 
             */
             tz.setCantidadActual((tz.getCantidadActual()-servir));
            System.out.println("quedan " + (tz.getCantidadActual()) + " ml de cafe ");

        } else if (servir > capacidad) {//en este evitamos que exceda la capacidad de la taza
            System.out.println("ups no puedo hacer eso se desperdiciara solo te puedo servir: " + capacidad + " ml");

            System.out.println("quedan " + (tz.getCantidadActual() - capacidad) + " ml de cafe ");

        } else if (servir <= capacidad && servir > tz.getCapacidadMaxima()) {
            //aqui se evalua que la cantidad de cafe actual si alcance para servir
            System.out.println("lo siento no tengo esa cantidad solo te servire: " + tz + " ml");
            tz.setCantidadActual(0);
            System.out.println("ya no hay cafe en esta cafetera");
        }

        return tz;

    }

    //vaciar cafetera
    public Cafetera vaciarCafetera() {

        System.out.println("crees que este cafe aun es apto o deseas vaciar la cafetera:");
        System.out.println("--si:vaciar la cafetera--");
        System.out.println("--no:aun es apto--");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("si")) {
            tz.setCantidadActual(0);
            System.out.println("OK cafetera vaciada quedo: " + tz.getCantidadActual() + " ml");
        } else if (opcion.equalsIgnoreCase("no")) {
            System.out.println("ok seguiremos vendiendo este cafe recuerda revisarlo constantemente");

            System.out.println("te quedan: " + tz.getCantidadActual() + " ml");
        } else {
            System.out.println("no reconozco la instruccion continuemos");
        }
        return tz;

    }

    //añadir cafe a al cafetera
    public void agregar() {
         tz.getCantidadActual();
        System.out.print("deseas añadir cafe?: ");
        String añadir = leer.next();
        if (añadir.equalsIgnoreCase("si")) {
            System.out.print("cuanto?: ");
            int cuanto = leer.nextInt();
            //en este momento lo que hacemos es darle cambio al valor de cantidad actual
             tz.setCantidadActual((tz.getCantidadActual()+cuanto));
            if (tz.getCantidadActual() > tz.getCapacidadMaxima()) {
                //con este if evaluamos que la cantidad de cafe agregado no sobrepase la capacidad maxima
                //de acuerdo a eso se ejecutan lo comandos descritos en el sout
                System.out.println("no podemos hacer eso se desperdiciara");
            } else if (tz.getCantidadActual() <= tz.getCapacidadMaxima()) {
                System.out.println("ahora tenemos: " + tz.getCantidadActual() + " ml de cafe");
            }
        } else if (añadir.equalsIgnoreCase("no")) {
            System.out.println("ok continuemos revisa el nivel");
        } else {
            System.out.println("no reconozco la intruccion continuaremos");
        }

    }
}
