/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.services;

import arqui.pojos.Paquete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CARLOS
 */
@Stateless
public class PaqueteFacade extends AbstractFacade<Paquete> implements PaqueteFacadeLocal {

    @PersistenceContext(unitName = "postal_peru-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaqueteFacade() {
        super(Paquete.class);
    }
    
}
