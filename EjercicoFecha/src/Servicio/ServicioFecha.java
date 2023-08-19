package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

public class ServicioFecha {

    Scanner leer = new Scanner(System.in);

    public boolean anios(Fecha fecha) {
        boolean bandera = false;
        if (fecha.getAnio() >= 1900 && fecha.getAnio() <= 2021) {
            bandera = true;
        } else {
            Fecha fechaPorDefecto = new Fecha();
            System.out.println("El año ingresado no es válido. Se utilizará la fecha por defecto: " + fechaPorDefecto.getDia() + "/" + fechaPorDefecto.getMes() + "/" + fechaPorDefecto.getAnio());
            fecha = fechaPorDefecto;
        }
        return bandera;
    }

    public boolean diasYMeses(Fecha fecha) {
        
        boolean diaValido = false;
        switch (fecha.getMes()) {
            //validacion febrero cuyo mes es el unico diferente
            case 2:

                if (fecha.getDia() >= 1 && fecha.getDia() <= 28) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                if (fecha.getAnio() % 4 == 0 && fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 == 0) {
                    if (fecha.getDia() >= 1 && fecha.getDia() <= 29) {
                        fecha.setDia(fecha.getDia());
                        diaValido = true;
                    }else{
                       
                    }
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            //validacion meses de 31 dias
            case 1:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;

                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 3:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 5:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 7:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 8:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 10:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 12:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            //validacion meses de 30 dias
            case 4:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 30) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 6:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 30) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 9:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 30) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            case 11:
                if (fecha.getDia() >= 1 && fecha.getDia() <= 30) {
                    fecha.setDia(fecha.getDia());
                    diaValido = true;
                } else {
                    System.out.println("dia no valido");
                    diaValido = false;
                }
                break;
            default:
                System.out.println("ese mes aun no existe");
        }
       
        return diaValido;
    }

    public void diaAnterior(Fecha fecha) {
        int dia = fecha.getDia();
        int mes=fecha.getMes();
        int anio=fecha.getAnio();
        switch (fecha.getMes()) {
            //validacion meses de enero en cuyo caso se debe devolver el año 
            case 1:
                if (dia == 1) {
                    dia = 31;
                    mes=12;
                    anio=fecha.getAnio()-1;
                } else {
                    dia--;
                }
                break;
            case 2:
                if (dia == 1) {
                    dia = 31;
                    mes--;
                } else {
                    dia--;
                }
                break;
            // para este caso se convalida que el año se bisiesto en marzo 
            case 3:
                if (dia == 1) {
                    if (fecha.getAnio() % 4 == 0 && fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 == 0) {
                        dia = 29;
                        mes--;
                    } else {
                        dia = 28;
                        mes--;;
                    }

                } else {
                    dia--;
                }
                break;
            case 5:
                if (dia == 1) {
                    dia = 30;
                    mes--;
                } else {
                    dia--;

                }
                break;
            case 7:
                if (dia == 1) {
                    dia = 30;
                    mes--;
                } else {
                    dia--;

                }
                break;
            case 8:
                if (dia == 1) {
                    dia = 31;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            case 10:
                if (dia == 1) {
                    dia = 30;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            case 12:
                if (dia == 1) {
                    dia = 30;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            //validacion meses de 30 dias
            case 4:
                if (dia == 1) {
                    dia = 31;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            case 6:
                if (dia == 1) {
                    dia = 31;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            case 9:
                if (dia == 1) {
                    dia = 31;
                    mes--;;
                } else {
                    dia--;

                }
                break;
            case 11:
                if (dia == 1) {
                    dia = 31;
                    mes--;;
                } else {
                    dia--;

                }
                break;
        }

        System.out.println("la fecha anterior a la ingresada es: " + dia + " /" + mes + " /" + anio);

    }

    public void diaPosterior(Fecha fecha) {
        int dias = fecha.getDia();
        int mess= fecha.getMes();
        int anios=fecha.getAnio();
        switch (fecha.getMes()) {
            //primero la excepcion mas notable que es el cambi de el año
            case 12:
                if (dias == 31) {
                    dias = 1;
                    mess=1;
                    anios=fecha.getAnio()+1;
                } else {
                    dias++;

                }
                break;
            //aqui se verifica el biciesto en febrero y con esto cambiamos de mes
            case 2:
                if (dias == 28 && fecha.getAnio() % 4 != 0 && fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 != 0) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                    if (dias == 29 && fecha.getAnio() % 4 == 0 && fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 == 0) {
                        dias = 1;
                        mess=fecha.getMes()+1;
                    }
                } else {
                    dias++;
                }
                break;
            case 1:
               
                if (dias == 31) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 3:
                if (dias == 31) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 5:
                if (dias == 31) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 7:
                if (dias == 31) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 8:
                if (dias == 31) {
                    dias = 1;
                   mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 10:
                if (dias == 31) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 4:
                if (dias == 30) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 6:
                if (dias == 30) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 9:
                if (dias == 30) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
            case 11:
                if (dias == 30) {
                    dias = 1;
                    mess=fecha.getMes()+1;
                } else {
                    dias++;
                }
                break;
        }
        System.out.println("la fecha posterior a la ingresada es: " + dias + " /" + mess + " /" + anios);

    }
    public boolean bisiesto(Fecha fecha){
        if (fecha.getAnio()%4==0 && fecha.getAnio()%100!=0 || fecha.getAnio()%400==0) {
            System.out.println("AÑO BISIESTO");
            return true;
        }else {
            System.out.println("AÑO NO BISIESTO");
            return false;
        }
    }
    

    public void cargarFecha(Fecha fecha) {

        System.out.println("ingrese una fecha\ndia: ");
        fecha.setDia(leer.nextInt());
        System.out.println("mes: ");
        fecha.setMes(leer.nextInt());
        System.out.println("año: ");
        fecha.setAnio(leer.nextInt());

        //------------------------------------------------------------------------------------------------------------------
        
        if (diasYMeses(fecha)) {
           System.out.printf("la fecha acutal es: %d / %d / %d \n", fecha.getDia(), fecha.getMes(), fecha.getAnio());
            bisiesto(fecha);
        if (anios(fecha) == true) {
            
                diaAnterior(fecha);
                diaPosterior(fecha);

        } else {
            System.out.println("ALGO NO COINCIDE");
        } 
        }
        

    }

}
