/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import bc.TipoRepuestoFacadeLocal;
import be.TipoRepuesto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author lacorrea
 */
@ManagedBean
@SessionScoped
public class TipoRepuestoBean implements Serializable{

    @EJB
    private TipoRepuestoFacadeLocal tipoRepuestoFacade;
    
    public TipoRepuestoBean(){
        
    }
    
    public List<TipoRepuesto> getLista(){
        return tipoRepuestoFacade.findAll();
    }
    
}
