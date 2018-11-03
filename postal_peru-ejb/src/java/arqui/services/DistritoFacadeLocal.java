/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.services;

import arqui.pojos.Distrito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CARLOS
 */
@Local
public interface DistritoFacadeLocal {

    void create(Distrito distrito);

    void edit(Distrito distrito);

    void remove(Distrito distrito);

    Distrito find(Object id);

    List<Distrito> findAll();

    List<Distrito> findRange(int[] range);

    int count();
    
}
