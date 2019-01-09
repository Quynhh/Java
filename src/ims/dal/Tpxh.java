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
@Table(name = "TPXH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tpxh.findAll", query = "SELECT t FROM Tpxh t")
    , @NamedQuery(name = "Tpxh.findByIdTPXH", query = "SELECT t FROM Tpxh t WHERE t.idTPXH = :idTPXH")
    , @NamedQuery(name = "Tpxh.findByTenTPXH", query = "SELECT t FROM Tpxh t WHERE t.tenTPXH = :tenTPXH")})
public class Tpxh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTPXH")
    private Integer idTPXH;
    @Column(name = "TenTPXH")
    private String tenTPXH;
    @OneToMany(mappedBy = "idTPXH")
    private Collection<NhanVien> nhanVienCollection;
    @JoinColumn(name = "idQT", referencedColumnName = "idQT")
    @ManyToOne
    private QuocTich idQT;

    public Tpxh() {
    }

    public Tpxh(Integer idTPXH) {
        this.idTPXH = idTPXH;
    }

    public Integer getIdTPXH() {
        return idTPXH;
    }

    public void setIdTPXH(Integer idTPXH) {
        this.idTPXH = idTPXH;
    }

    public String getTenTPXH() {
        return tenTPXH;
    }

    public void setTenTPXH(String tenTPXH) {
        this.tenTPXH = tenTPXH;
    }

    @XmlTransient
    public Collection<NhanVien> getNhanVienCollection() {
        return nhanVienCollection;
    }

    public void setNhanVienCollection(Collection<NhanVien> nhanVienCollection) {
        this.nhanVienCollection = nhanVienCollection;
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
        hash += (idTPXH != null ? idTPXH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tpxh)) {
            return false;
        }
        Tpxh other = (Tpxh) object;
        if ((this.idTPXH == null && other.idTPXH != null) || (this.idTPXH != null && !this.idTPXH.equals(other.idTPXH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.Tpxh[ idTPXH=" + idTPXH + " ]";
    }
    
}
