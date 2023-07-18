/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc;

import be.TipoRepuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lacorrea
 */
@Stateless
public class TipoRepuestoFacade extends AbstractFacade<TipoRepuesto> implements TipoRepuestoFacadeLocal {

    @PersistenceContext(unitName = "simple_crud-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoRepuestoFacade() {
        super(TipoRepuesto.class);
    }
    
}
