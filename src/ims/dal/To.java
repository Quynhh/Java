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
@Table(name = "To")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "To.findAll", query = "SELECT t FROM To t")
    , @NamedQuery(name = "To.findByIdTo", query = "SELECT t FROM To t WHERE t.idTo = :idTo")
    , @NamedQuery(name = "To.findByTenTo", query = "SELECT t FROM To t WHERE t.tenTo = :tenTo")})
public class To implements Serializable {

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
    private List<Doi> doiList;

    public To() {
    }

    public To(Integer idTo) {
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
    public List<Doi> getDoiList() {
        return doiList;
    }

    public void setDoiList(List<Doi> doiList) {
        this.doiList = doiList;
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
        if (!(object instanceof To)) {
            return false;
        }
        To other = (To) object;
        if ((this.idTo == null && other.idTo != null) || (this.idTo != null && !this.idTo.equals(other.idTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.To[ idTo=" + idTo + " ]";
    }
    
}
