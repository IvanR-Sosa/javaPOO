
package juegoahorcado;

import ServicioAh.PlayGame;
import EntidadAh.Ahorcados;

public class JuegoAhorcado {

    public static void main(String[] args) {
        PlayGame game1=new PlayGame();
        Ahorcados play =new Ahorcados(); 
        play=game1.juego();
        
    }
    
}
