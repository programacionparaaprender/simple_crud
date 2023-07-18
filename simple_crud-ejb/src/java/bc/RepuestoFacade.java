/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc;

import be.Repuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lacorrea
 */
@Stateless
public class RepuestoFacade extends AbstractFacade<Repuesto> implements RepuestoFacadeLocal {

    @PersistenceContext(unitName = "simple_crud-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepuestoFacade() {
        super(Repuesto.class);
    }
    
}
