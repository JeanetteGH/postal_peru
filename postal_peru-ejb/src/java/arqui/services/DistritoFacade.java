/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.services;

import arqui.pojos.Distrito;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CARLOS
 */
@Stateless
public class DistritoFacade extends AbstractFacade<Distrito> implements DistritoFacadeLocal {

    @PersistenceContext(unitName = "postal_peru-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DistritoFacade() {
        super(Distrito.class);
    }
    
}
