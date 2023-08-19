package Servicio;

import Entidad.Sopa;
import java.util.Scanner;

public class Letras {

    Scanner leer = new Scanner(System.in);

    public void crear(Sopa sopa) {
        String[] letras = {"perro", "gato", "vaca"};
        sopa.setMatriz(new String[10][10]);
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        String palabra = "";

        cargaSopa(sopa, abc);
        ingreso(sopa, letras);
        reemplazo(sopa);
        for (int i = 0; i < sopa.getPalabras().length; i++) {
            int f = (int) (Math.random() * 10);
            int c = (int) (Math.random() * 7);
            palabra = sopa.getPalabras()[i];
            paso(sopa, palabra, f, c);
        }
      

        mostrar(sopa);
        System.out.println("las palbras a buxar son:");
        for (int i = 0; i < sopa.getPalabras().length; i++) {
            System.out.println("[" + sopa.getPalabras()[i] + "]");
        }

    }

    public void paso(Sopa sopa, String palabra, int fila, int columna) {

        for (int i = 0; i < palabra.length(); i++) {
            sopa.getMatriz()[fila][columna + i] = "" + palabra.charAt(i);
        }
    }

    public void cargaSopa(Sopa sopa, String abc) {
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            for (int j = 0; j < sopa.getMatriz().length; j++) {

                int index = (int) (Math.random() * abc.length());
                sopa.getMatriz()[i][j] = abc.substring(index, index + 1);
            }

        }
    }

    public void mostrar(Sopa sopa) {
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            for (int j = 0; j < sopa.getMatriz().length; j++) {

                System.out.print("[" + sopa.getMatriz()[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void ingreso(Sopa sopa, String[] letras) {
        String opc = "";
        String nuevaPalabra = "";
        do {
            System.out.println("desea añadir una palabra?\n si\n no");
            opc = leer.next();

        } while (!opc.equalsIgnoreCase("si") && !opc.equalsIgnoreCase("no"));

        System.out.println("---------------------------------------------");
        String nuevoLetras[] = new String[letras.length + 1];
        if (opc.equalsIgnoreCase("si")) {
            System.out.println("ingrese la nueva palabra:");
            nuevaPalabra = leer.next();
            for (int i = 0; i < letras.length; i++) {
                nuevoLetras[i] = letras[i];
            }
            nuevoLetras[letras.length] = nuevaPalabra;
            sopa.setPalabras(nuevoLetras);

        } else {
            sopa.setPalabras(letras);
            System.out.println("continuemos");
        }
    }

    public void reemplazo(Sopa sopa) {
        String opc = "";
        do {
            System.out.println("desea reemplazar una palabra?\n si\n no");
            opc = leer.next();

        } while (!opc.equalsIgnoreCase("si") && !opc.equalsIgnoreCase("no"));

        if (opc.equalsIgnoreCase("si")) {
            int posicion = -1;
            System.out.println("ingrese la palabra de reemplazo");
            String reem = leer.next();
            do {
                System.out.println("ingrese la posicion de reemplazo entre 0 y " + (sopa.getPalabras().length - 1));
                posicion = leer.nextInt();
            } while (posicion < 0 || posicion > sopa.getPalabras().length);
            for (int i = 0; i < sopa.getPalabras().length; i++) {
                if (i == posicion) {
                    sopa.getPalabras()[i] = reem;
                }
            }
        } else if (opc.equalsIgnoreCase("no")) {
            System.out.println("continuemos");
        }
    }
}
