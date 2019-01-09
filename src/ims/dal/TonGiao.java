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
@Table(name = "TonGiao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TonGiao.findAll", query = "SELECT t FROM TonGiao t")
    , @NamedQuery(name = "TonGiao.findByIdTG", query = "SELECT t FROM TonGiao t WHERE t.idTG = :idTG")
    , @NamedQuery(name = "TonGiao.findByTenTonGiao", query = "SELECT t FROM TonGiao t WHERE t.tenTonGiao = :tenTonGiao")})
public class TonGiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTG")
    private Integer idTG;
    @Column(name = "TenTonGiao")
    private String tenTonGiao;
    @OneToMany(mappedBy = "idTG")
    private Collection<NhanVien> nhanVienCollection;

    public TonGiao() {
    }

    public TonGiao(Integer idTG) {
        this.idTG = idTG;
    }

    public Integer getIdTG() {
        return idTG;
    }

    public void setIdTG(Integer idTG) {
        this.idTG = idTG;
    }

    public String getTenTonGiao() {
        return tenTonGiao;
    }

    public void setTenTonGiao(String tenTonGiao) {
        this.tenTonGiao = tenTonGiao;
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
        hash += (idTG != null ? idTG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TonGiao)) {
            return false;
        }
        TonGiao other = (TonGiao) object;
        if ((this.idTG == null && other.idTG != null) || (this.idTG != null && !this.idTG.equals(other.idTG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.TonGiao[ idTG=" + idTG + " ]";
    }
    
}
