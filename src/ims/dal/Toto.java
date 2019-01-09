/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Quynh
 */
@Entity
@Table(name = "Toto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toto.findAll", query = "SELECT t FROM Toto t")
    , @NamedQuery(name = "Toto.findByIdTo", query = "SELECT t FROM Toto t WHERE t.idTo = :idTo")
    , @NamedQuery(name = "Toto.findByTenTo", query = "SELECT t FROM Toto t WHERE t.tenTo = :tenTo")})
public class Toto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTo")
    private Integer idTo;
    @Column(name = "TenTo")
    private String tenTo;
    @JoinColumn(name = "idPB", referencedColumnName = "idPB")
    @ManyToOne
    private PhongBan idPB;
    @OneToMany(mappedBy = "idTo")
    private Collection<Doi> doiCollection;

    public Toto() {
    }

    public Toto(Integer idTo) {
        this.idTo = idTo;
    }

    public Integer getIdTo() {
        return idTo;
    }

    public void setIdTo(Integer idTo) {
        this.idTo = idTo;
    }

    public String getTenTo() {
        return tenTo;
    }

    public void setTenTo(String tenTo) {
        this.tenTo = tenTo;
    }

    public PhongBan getIdPB() {
        return idPB;
    }

    public void setIdPB(PhongBan idPB) {
        this.idPB = idPB;
    }

    @XmlTransient
    public Collection<Doi> getDoiCollection() {
        return doiCollection;
    }

    public void setDoiCollection(Collection<Doi> doiCollection) {
        this.doiCollection = doiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTo != null ? idTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Toto)) {
            return false;
        }
        Toto other = (Toto) object;
        if ((this.idTo == null && other.idTo != null) || (this.idTo != null && !this.idTo.equals(other.idTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.dal.Toto[ idTo=" + idTo + " ]";
    }
    
}
