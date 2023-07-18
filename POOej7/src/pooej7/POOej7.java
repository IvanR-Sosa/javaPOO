package pooej7;

import Servicio.PersonaServicio;
import java.util.Scanner;

public class POOej7 {

    public static void main(String[] args) {
        PersonaServicio p1 = new PersonaServicio();
        int cantidad;
        double imc = 0;
        int imc1 = 0, imc2 = 0, imc3 = 0;
        boolean edad;
        int mayor = 0, menor = 0;
        System.out.print("cuantas personas vas a crear: ");
        Scanner leer = new Scanner(System.in);
        cantidad = leer.nextInt();
        System.out.println("----------------------------------------------");
        for (int i = 0; i < cantidad; i++) {
            p1.crearPersona();
            imc = p1.calcularIMC();
            edad = p1.mayorEdad();
            System.out.println("----------------------------------------------");
            if (imc == -1) {

                imc1++;
            }
            if (imc == 0) {

                imc2++;

            }
            if (imc == 1) {

                imc3++;
            }
            //---------------------------------------------------------------
            //aqui sacamos cuantos son mayores y menores de edad
            if (edad ) {
                mayor++;

            }else{
                menor++;
            }
           
        }
        System.out.println("---------------------------------------");
        System.out.println("la cantidad de personas por debajo de su peso ideal es: " + imc1);
        System.out.println("la cantidad de personas en su peso ideal es: " + imc2);
        System.out.println("la cantidad de personas con sobrepeso es: " + imc3);
        System.out.println("---------------------------------------");
        System.out.println("la cantidad de mayores de edad es: " + mayor);
        System.out.println("la cantidad de menores de edad es: " + menor);
         System.out.println("---------------------------------------");

    }

}
