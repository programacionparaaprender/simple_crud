/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lacorrea
 */
@Entity
@Table(name = "tipo_repuesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRepuesto.findAll", query = "SELECT t FROM TipoRepuesto t")
    , @NamedQuery(name = "TipoRepuesto.findByPkId", query = "SELECT t FROM TipoRepuesto t WHERE t.pkId = :pkId")
    , @NamedQuery(name = "TipoRepuesto.findByNombre", query = "SELECT t FROM TipoRepuesto t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoRepuesto.findByDescripcion", query = "SELECT t FROM TipoRepuesto t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoRepuesto.findByFechaRegistro", query = "SELECT t FROM TipoRepuesto t WHERE t.fechaRegistro = :fechaRegistro")})
public class TipoRepuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id")
    private Integer pkId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoRepuesto", fetch = FetchType.LAZY)
    private Collection<Repuesto> repuestoCollection;

    public TipoRepuesto() {
    }

    public TipoRepuesto(Integer pkId) {
        this.pkId = pkId;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public Collection<Repuesto> getRepuestoCollection() {
        return repuestoCollection;
    }

    public void setRepuestoCollection(Collection<Repuesto> repuestoCollection) {
        this.repuestoCollection = repuestoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkId != null ? pkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRepuesto)) {
            return false;
        }
        TipoRepuesto other = (TipoRepuesto) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "be.TipoRepuesto[ pkId=" + pkId + " ]";
    }
    
}
