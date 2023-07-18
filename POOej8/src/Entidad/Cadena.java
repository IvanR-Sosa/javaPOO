
package Entidad;


public class Cadena {
    private String frase;
    private int longitud;

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

  
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
   
}
