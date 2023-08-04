
package registro;

import Entidad.Pass;
import Servicio.ServicioPass;


public class Registro {

    public static void main(String[] args) {
        ServicioPass log=new ServicioPass();
        Pass login = new Pass("zarzamoras","juan",123456);
        login=log.menu(login);
    }
    
}
