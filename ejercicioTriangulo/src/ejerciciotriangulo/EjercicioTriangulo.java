
package ejerciciotriangulo;

import entidad.Triangulo;
import servicio.ServicioTriangulo;


public class EjercicioTriangulo {

    
    public static void main(String[] args) {
        ServicioTriangulo tr=new ServicioTriangulo();
        Triangulo triangulos[]=new Triangulo[4];
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("############################################################################");
            triangulos[i]=tr.mostrar();
        }
        System.out.println("*********************************************************************************");
        double maximo=Double.MIN_VALUE;//inicializa la variable en el valor minimo
        double minimo=Double.MAX_VALUE;//inicializa la variable en el valor maximo 
        int index=-1,index2=-1;
        for (int i = 0; i < triangulos.length; i++) {
            tr.area(triangulos[i]);
            if (tr.area(triangulos[i])>maximo) {
               maximo=tr.area(triangulos[i]);
               index=i;
            }
            if (tr.area(triangulos[i])<minimo) {
                minimo=tr.area(triangulos[i]);
                index2=i;
            }
        }
        System.out.println("el triangulo "+(index+1)+" es el mas grande con un area de "+maximo);
        System.out.println("*********************************************************************************");
        System.out.printf("el triangulo %d es el mas pequeño cou un area de : %1.2f \n",(index2+1),minimo);
    }
    
}
