/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import java.io.Serializable;
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
@Table(name = "TPGD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tpgd.findAll", query = "SELECT t FROM Tpgd t")
    , @NamedQuery(name = "Tpgd.findByIdTPGD", query = "SELECT t FROM Tpgd t WHERE t.idTPGD = :idTPGD")
    , @NamedQuery(name = "Tpgd.findByTenTPGD", query = "SELECT t FROM Tpgd t WHERE t.tenTPGD = :tenTPGD")})
public class Tpgd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTPGD")
    private Integer idTPGD;
    @Column(name = "TenTPGD")
    private String tenTPGD;
    @OneToMany(mappedBy = "idTPGD")
    private List<NhanVien> nhanVienList;
    @JoinColumn(name = "idQT", referencedColumnName = "idQT")
    @ManyToOne
    private QuocTich idQT;

    public Tpgd() {
    }

    public Tpgd(Integer idTPGD) {
        this.idTPGD = idTPGD;
    }

    public Integer getIdTPGD() {
        return idTPGD;
    }

    public void setIdTPGD(Integer idTPGD) {
        this.idTPGD = idTPGD;
    }

    public String getTenTPGD() {
        return tenTPGD;
    }

    public void setTenTPGD(String tenTPGD) {
        this.tenTPGD = tenTPGD;
    }

    @XmlTransient
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
        hash += (idTPGD != null ? idTPGD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tpgd)) {
            return false;
        }
        Tpgd other = (Tpgd) object;
        if ((this.idTPGD == null && other.idTPGD != null) || (this.idTPGD != null && !this.idTPGD.equals(other.idTPGD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.Tpgd[ idTPGD=" + idTPGD + " ]";
    }
    
}
