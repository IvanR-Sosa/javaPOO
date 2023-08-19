
package Entidad;


public class Sopa {
    private String matriz [][];
    private String palabras[];

    public Sopa() {
    }

    public Sopa(String[][] matriz, String[] palabras) {
        this.matriz = matriz;
        this.palabras = palabras;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

  
}
