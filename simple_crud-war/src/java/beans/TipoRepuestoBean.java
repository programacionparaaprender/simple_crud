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
import java.util.Date;
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

    private TipoRepuesto objeto;
    
    @EJB
    private TipoRepuestoFacadeLocal tipoRepuestoFacade;
    private int tipoAccion = 1;
    
    public TipoRepuestoBean(){
        reinstanciar();
    }
    
    public List<TipoRepuesto> getLista(){
        return tipoRepuestoFacade.findAll();
    }

    public TipoRepuesto getObjeto() {
        return objeto;
    }

    public void setObjeto(TipoRepuesto objeto) {
        this.objeto = objeto;
    }

    public int getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(int tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    public void reinstanciar(){
        //Crear
        objeto = new TipoRepuesto();
    }
    
    public void procesar(){
        //Crear
        objeto.setFechaRegistro(new Date());
        this.tipoRepuestoFacade.create(objeto);
    }
    
}
