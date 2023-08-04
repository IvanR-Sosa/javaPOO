
package EntidadAh;


public class Ahorcados {
    
    private String[] palabra;
    private String[] oculta;
    private Integer jugadasMaximas;
    private Integer Encontradas;

    public Ahorcados() {
    }

    public Ahorcados(String[] palabra, String[] oculta, Integer jugadasMaximas, Integer Encontradas) {
        this.palabra = palabra;
        this.oculta = oculta;
        this.jugadasMaximas = jugadasMaximas;
        this.Encontradas = Encontradas;
    }
    

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getOculta() {
        return oculta;
    }

    public void setOculta(String[] oculta) {
        this.oculta = oculta;
    }

    public Integer getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(Integer jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public Integer getEncontradas() {
        return Encontradas;
    }

    public void setEncontradas(Integer Encontradas) {
        this.Encontradas = Encontradas;
    }

   
    
    
    
    
}
