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
@Table(name = "PhongBan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhongBan.findAll", query = "SELECT p FROM PhongBan p")
    , @NamedQuery(name = "PhongBan.findByIdPB", query = "SELECT p FROM PhongBan p WHERE p.idPB = :idPB")
    , @NamedQuery(name = "PhongBan.findByTenPB", query = "SELECT p FROM PhongBan p WHERE p.tenPB = :tenPB")})
public class PhongBan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPB")
    private Integer idPB;
    @Column(name = "TenPB")
    private String tenPB;
    @OneToMany(mappedBy = "idPB")
    private Collection<To> toCollection;

    public PhongBan() {
    }

    public PhongBan(Integer idPB) {
        this.idPB = idPB;
    }

    public Integer getIdPB() {
        return idPB;
    }

    public void setIdPB(Integer idPB) {
        this.idPB = idPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    @XmlTransient
    public Collection<To> getToCollection() {
        return toCollection;
    }

    public void setToCollection(Collection<To> toCollection) {
        this.toCollection = toCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPB != null ? idPB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhongBan)) {
            return false;
        }
        PhongBan other = (PhongBan) object;
        if ((this.idPB == null && other.idPB != null) || (this.idPB != null && !this.idPB.equals(other.idPB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.PhongBan[ idPB=" + idPB + " ]";
    }
    
}
