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
@Table(name = "QuocTich")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuocTich.findAll", query = "SELECT q FROM QuocTich q")
    , @NamedQuery(name = "QuocTich.findByIdQT", query = "SELECT q FROM QuocTich q WHERE q.idQT = :idQT")
    , @NamedQuery(name = "QuocTich.findByTenQuocTich", query = "SELECT q FROM QuocTich q WHERE q.tenQuocTich = :tenQuocTich")})
public class QuocTich implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idQT")
    private Integer idQT;
    @Column(name = "TenQuocTich")
    private String tenQuocTich;
    @OneToMany(mappedBy = "idQT")
    private List<DanToc> danTocList;
    @OneToMany(mappedBy = "idQT")
    private List<Tpxh> tpxhList;
    @OneToMany(mappedBy = "idQT")
    private List<Tpgd> tpgdList;

    public QuocTich() {
    }

    public QuocTich(Integer idQT) {
        this.idQT = idQT;
    }

    public Integer getIdQT() {
        return idQT;
    }

    public void setIdQT(Integer idQT) {
        this.idQT = idQT;
    }

    public String getTenQuocTich() {
        return tenQuocTich;
    }

    public void setTenQuocTich(String tenQuocTich) {
        this.tenQuocTich = tenQuocTich;
    }

    @XmlTransient
    public List<DanToc> getDanTocList() {
        return danTocList;
    }

    public void setDanTocList(List<DanToc> danTocList) {
        this.danTocList = danTocList;
    }

    @XmlTransient
    public List<Tpxh> getTpxhList() {
        return tpxhList;
    }

    public void setTpxhList(List<Tpxh> tpxhList) {
        this.tpxhList = tpxhList;
    }

    @XmlTransient
    public List<Tpgd> getTpgdList() {
        return tpgdList;
    }

    public void setTpgdList(List<Tpgd> tpgdList) {
        this.tpgdList = tpgdList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQT != null ? idQT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuocTich)) {
            return false;
        }
        QuocTich other = (QuocTich) object;
        if ((this.idQT == null && other.idQT != null) || (this.idQT != null && !this.idQT.equals(other.idQT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.QuocTich[ idQT=" + idQT + " ]";
    }
    
}
