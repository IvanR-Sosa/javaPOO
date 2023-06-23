
package Entidad;

import java.util.Date;






public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo,Date nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacimiento=nacimiento;
        
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
