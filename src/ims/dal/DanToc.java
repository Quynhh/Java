/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dal.QuocTich;
import ims.dal.NhanVien;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
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
@Table(name = "DanToc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DanToc.findAll", query = "SELECT d FROM DanToc d")
    , @NamedQuery(name = "DanToc.findByIdDT", query = "SELECT d FROM DanToc d WHERE d.idDT = :idDT")
    , @NamedQuery(name = "DanToc.findByTenDT", query = "SELECT d FROM DanToc d WHERE d.tenDT = :tenDT")})
public class DanToc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDT")
    private Integer idDT;
    @Column(name = "TenDT")
    private String tenDT;
    @OneToMany(mappedBy = "idDT")
    //private Collection<NhanVien> nhanVienCollection;
    private List<NhanVien> nhanVienList;
    @JoinColumn(name = "idQT", referencedColumnName = "idQT")
    @ManyToOne
    private QuocTich idQT;

    public DanToc() {
    }

    public DanToc(Integer idDT) {
        this.idDT = idDT;
    }

    public Integer getIdDT() {
        return idDT;
    }

    public void setIdDT(Integer idDT) {
        this.idDT = idDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    @XmlTransient
    /*public Collection<NhanVien> getNhanVienCollection() {
        return nhanVienCollection;
    }

    public void setNhanVienCollection(Collection<NhanVien> nhanVienCollection) {
        this.nhanVienCollection = nhanVienCollection;
    }*/
    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }

    public QuocTich getIdQT() {
        return idQT;
    }

    public void setIdQT(QuocTich idQT) {
        this.idQT = idQT;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDT != null ? idDT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DanToc)) {
            return false;
        }
        DanToc other = (DanToc) object;
        if ((this.idDT == null && other.idDT != null) || (this.idDT != null && !this.idDT.equals(other.idDT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.DanToc[ idDT=" + idDT + " ]";
    }
    
}
