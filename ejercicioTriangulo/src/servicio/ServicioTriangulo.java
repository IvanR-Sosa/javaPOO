
package servicio;

import entidad.Triangulo;
import java.util.Scanner;


 
public class ServicioTriangulo {
    Scanner leer =new Scanner (System.in);
    
    
    public void crear(Triangulo triangulo){
        
        System.out.println("ingrese la base de el triangulo");
        triangulo.setBase(leer.nextDouble());
        System.out.println("ingrese la altura de el triangulo");
        triangulo.setAltura(leer.nextDouble());
        
        
    }
    public double area(Triangulo triangulo){
        double area=((0.5)*triangulo.getBase()*triangulo.getAltura());
        return area;
    }
public double perimetro(Triangulo triangulo){
    
    return triangulo.getBase()+(2*triangulo.getAltura());
}
public Triangulo mostrar(){
    Triangulo triangulo =new Triangulo();
    crear(triangulo);
    
    
    System.out.printf("el area de este triangulo es: %1.2f\n",area(triangulo));
    
    System.out.printf("el perimetro de este triangulo es: %1.2f\n",perimetro(triangulo));
    return triangulo;
}
}
