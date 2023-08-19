
package Entidad;



 // @author ramis
 
public class AhorcadoG {
    
     //Atributos    
    private String [] palabra;
    private String [] oculta;    
    private Integer jugadasMax; //cantidad maxima de intentos    
    private Integer encontradas; //cuantas voy encontrando a medida que avanzo
    
    //Constructor
    public AhorcadoG() {
    }
    
    public AhorcadoG(String[] palabra, String[] oculta, Integer jugadasMax, Integer encontradas) {
        this.palabra = palabra;
        this.oculta = oculta;
        this.jugadasMax = jugadasMax;
        this.encontradas = encontradas;
    }
    
    //Getters & Setters

    public String[] getPalabra() {
        return palabra;
    }

    public String[] getOculta() {
        return oculta;
    }

    public Integer getJugadasMax() {
        return jugadasMax;
    }

    public Integer getEncontradas() {
        return encontradas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setOculta(String[] oculta) {
        this.oculta = oculta;
    }

    public void setJugadasMax(Integer jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public void setEncontradas(Integer encontradas) {
        this.encontradas = encontradas;
    }

    

}
