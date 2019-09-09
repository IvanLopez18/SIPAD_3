package sipad.sena.DTO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ViewScoped
public class NewClass {
    
    
    public NewClass() {
    }

    public String ver() {

        String msg = "Hola mundo";

        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, fm);
                
        return "index";        
    }

}
