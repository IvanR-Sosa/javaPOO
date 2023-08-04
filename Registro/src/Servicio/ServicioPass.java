package Servicio;

// @author ramis
import Entidad.Pass;
import java.util.Scanner;

public class ServicioPass {

    Scanner leer = new Scanner(System.in);

    public boolean crearPass(Pass pass) {

        boolean ver = false;
        if (pass.getPass().length() == 10) {
            ver = true;
        } else {
            ver = false;
        }
        return ver;
    }

    public String analizarPass(Pass pass) {
        String nivel = null;
        int medio = 0, alto = 0;
        String[] validar = new String[pass.getPass().length()];
        //aqui lo que hacemos es convertir a un vector el pass para despues validarlo
        for (int i = 0; i < pass.getPass().length(); i++) {
            validar[i] = pass.getPass().substring(i, i + 1);
        }
        for (int i = 0; i < validar.length; i++) {
            if (validar[i].equalsIgnoreCase("z")) {
                medio++;
            }
            if (validar[i].equalsIgnoreCase("a")) {
                alto++;
            }
        }

        if (medio >= 1) {
            nivel = "contraseña nivel medio";
            if (medio >= 1 && alto >= 2) {
                nivel = "contraseña nivel alto";
            }
        } else {
            nivel = "contaseña nivel bajo";
        }

        return nivel;
    }

    public void cambiarDni(Pass pass, String validacion) {
        if (validacion.equalsIgnoreCase(pass.getPass())) {
            System.out.println("OK ahora cambia tu DNI");
            pass.setDni(leer.nextInt());
        }else{
            System.out.println("lo siento no puedo permitir el cambio");
        }
    }

    public void cambiarNombre(Pass pass, String validacion) {
        leer.nextLine();
        if (validacion.equalsIgnoreCase(pass.getPass())) {
            System.out.println("OK cambia tu nombre ahora:");
            pass.setNombre(leer.nextLine());
        }else{
            System.out.println("lo siento no puedo permitir el cambio");
        }
    }

    public void cambiarPass(Pass pass, String validacion) {
        if (validacion.equalsIgnoreCase(pass.getPass())) {
            System.out.println("OK ahora ingresa la nueva contraseña\n"
                    + "recuerda que debe ser de 10 digitos de longitud");
            pass.setPass(leer.next());
            System.out.println("contraseña de 10 digitos de longitud?: "+crearPass(pass));
            System.out.println(analizarPass(pass));
        } else {
            System.out.println("lo siento no puedo permitir el cambio");
        }
    }

    public Pass menu(Pass pass) {
        int opcion = 0;
        int dniNuevo;
        String validacion;
        String nuevoPass, Nnombre;
        System.out.println("la contraseña es de longitud 10: " + crearPass(pass));
        System.out.println(analizarPass(pass));
        System.out.println("-----------------------------------------");
        System.out.print("para ingresar al menu debemos validar la contraseña: ");
        validacion = leer.next();
        if (validacion.equalsIgnoreCase(pass.getPass())) {
            System.out.printf("bienvenido %s ahora vamos al menu\n", pass.getNombre());
            do {
                System.out.println("MENU DE OPCIONES");
                System.out.println("1. cambiar contraseña");
                System.out.println("2. cambiar DNI");
                System.out.println("3. cambiar Nombre");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("ingrese la contraseña antigua:");
                        validacion = leer.nextLine();
                        cambiarPass(pass, validacion);
                        break;
                    case 2:
                        System.out.println("recuerde que si ya cambio su contraseña debe ingresar la actual");
                        System.out.println("ingrese la contraseña:");
                        validacion=leer.next();
                        cambiarDni(pass, validacion);
                        break;
                    case 3:
                       System.out.println("recuerde que si ya cambio su contraseña debe ingresar la actual");
                       System.out.println("ingrese la contraseña:");
                       validacion=leer.next();
                        cambiarNombre(pass, validacion);
                        break;
                }
            } while (opcion != 4);
            if (opcion==4) {
                System.out.printf("gracias por usar este regitro %s\n",pass.getNombre());
            }

        } else {
            System.out.println("no te puedo permitir el ingreso al menu por seguridad");
        }
        return pass;
    }

}
