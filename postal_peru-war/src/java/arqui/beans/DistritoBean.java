/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.beans;

import arqui.pojos.Distrito;
import arqui.services.DistritoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author CARLOS
 */
@Named(value = "distritoBean")
@RequestScoped
public class DistritoBean {

    @EJB
    private DistritoFacadeLocal distritoFacade;

    
    public DistritoBean() {
    }
    
    public List<Distrito> getDistritos(){
        return distritoFacade.findAll();
    }
    
}
