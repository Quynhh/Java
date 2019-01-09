/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dal.To;
import ims.dal.NhanVien;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "Doi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doi.findAll", query = "SELECT d FROM Doi d")
    , @NamedQuery(name = "Doi.findByIdDoi", query = "SELECT d FROM Doi d WHERE d.idDoi = :idDoi")
    , @NamedQuery(name = "Doi.findByTenDoi", query = "SELECT d FROM Doi d WHERE d.tenDoi = :tenDoi")})
public class Doi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDoi")
    private Integer idDoi;
    @Column(name = "TenDoi")
    private String tenDoi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDoi", fetch = FetchType.LAZY)
    private Collection<NhanVien> nhanVienCollection;
    @JoinColumn(name = "idTo", referencedColumnName = "idTo")
    @ManyToOne
    private To idTo;

    public Doi() {
    }

    public Doi(Integer idDoi) {
        this.idDoi = idDoi;
    }

    public Integer getIdDoi() {
        return idDoi;
    }

    public void setIdDoi(Integer idDoi) {
        this.idDoi = idDoi;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    public void setTenDoi(String tenDoi) {
        this.tenDoi = tenDoi;
    }

    @XmlTransient
    public Collection<NhanVien> getNhanVienCollection() {
        return nhanVienCollection;
    }

    public void setNhanVienCollection(Collection<NhanVien> nhanVienCollection) {
        this.nhanVienCollection = nhanVienCollection;
    }

    public To getIdTo() {
        return idTo;
    }

    public void setIdTo(To idTo) {
        this.idTo = idTo;
    }
    
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDoi != null ? idDoi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doi)) {
            return false;
        }
        Doi other = (Doi) object;
        if ((this.idDoi == null && other.idDoi != null) || (this.idDoi != null && !this.idDoi.equals(other.idDoi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.Doi[ idDoi=" + idDoi + " ]";
    }
    
}
