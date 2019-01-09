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
@Table(name = "NhomMau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NhomMau.findAll", query = "SELECT n FROM NhomMau n")
    , @NamedQuery(name = "NhomMau.findByIdNM", query = "SELECT n FROM NhomMau n WHERE n.idNM = :idNM")
    , @NamedQuery(name = "NhomMau.findByTenNhomMau", query = "SELECT n FROM NhomMau n WHERE n.tenNhomMau = :tenNhomMau")})
public class NhomMau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idNM")
    private Integer idNM;
    @Column(name = "TenNhomMau")
    private String tenNhomMau;
    @OneToMany(mappedBy = "idNM")
    private Collection<NhanVien> nhanVienCollection;

    public NhomMau() {
    }

    public NhomMau(Integer idNM) {
        this.idNM = idNM;
    }

    public Integer getIdNM() {
        return idNM;
    }

    public void setIdNM(Integer idNM) {
        this.idNM = idNM;
    }

    public String getTenNhomMau() {
        return tenNhomMau;
    }

    public void setTenNhomMau(String tenNhomMau) {
        this.tenNhomMau = tenNhomMau;
    }

    @XmlTransient
    public Collection<NhanVien> getNhanVienCollection() {
        return nhanVienCollection;
    }

    public void setNhanVienCollection(Collection<NhanVien> nhanVienCollection) {
        this.nhanVienCollection = nhanVienCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNM != null ? idNM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhomMau)) {
            return false;
        }
        NhomMau other = (NhomMau) object;
        if ((this.idNM == null && other.idNM != null) || (this.idNM != null && !this.idNM.equals(other.idNM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.NhomMau[ idNM=" + idNM + " ]";
    }
    
}
