package sipad.sena.controladores;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@RequestScoped
public class supervisorController {

    

    //Metodos:
    //Metodo de iniciarsesion
    public String iniciarSession() {

        return "app/supervisor/indexSup";

    }

}
