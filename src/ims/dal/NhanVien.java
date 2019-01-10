/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Quynh
 */
@Entity
@Table(name = "NhanVien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NhanVien.findAll", query = "SELECT n FROM NhanVien n")
    , @NamedQuery(name = "NhanVien.findByIdNV", query = "SELECT n FROM NhanVien n WHERE n.idNV = :idNV")
    , @NamedQuery(name = "NhanVien.findByTenNV", query = "SELECT n FROM NhanVien n WHERE n.tenNV = :tenNV")
    , @NamedQuery(name = "NhanVien.findByNgaySinh", query = "SELECT n FROM NhanVien n WHERE n.ngaySinh = :ngaySinh")
    , @NamedQuery(name = "NhanVien.findByGioiTinh", query = "SELECT n FROM NhanVien n WHERE n.gioiTinh = :gioiTinh")
    , @NamedQuery(name = "NhanVien.findByNgayVaoDonVi", query = "SELECT n FROM NhanVien n WHERE n.ngayVaoDonVi = :ngayVaoDonVi")
    , @NamedQuery(name = "NhanVien.findByChieuCao", query = "SELECT n FROM NhanVien n WHERE n.chieuCao = :chieuCao")
    , @NamedQuery(name = "NhanVien.findByCanNang", query = "SELECT n FROM NhanVien n WHERE n.canNang = :canNang")
    , @NamedQuery(name = "NhanVien.findByLoaiSucKhoe", query = "SELECT n FROM NhanVien n WHERE n.loaiSucKhoe = :loaiSucKhoe")
    , @NamedQuery(name = "NhanVien.findByBenhLi", query = "SELECT n FROM NhanVien n WHERE n.benhLi = :benhLi")
    , @NamedQuery(name = "NhanVien.findByDt", query = "SELECT n FROM NhanVien n WHERE n.dt = :dt")
    , @NamedQuery(name = "NhanVien.findByDtdd", query = "SELECT n FROM NhanVien n WHERE n.dtdd = :dtdd")
    , @NamedQuery(name = "NhanVien.findByEmail", query = "SELECT n FROM NhanVien n WHERE n.email = :email")
    , @NamedQuery(name = "NhanVien.findByCmnd", query = "SELECT n FROM NhanVien n WHERE n.cmnd = :cmnd")
    , @NamedQuery(name = "NhanVien.findByNgayCapCMND", query = "SELECT n FROM NhanVien n WHERE n.ngayCapCMND = :ngayCapCMND")
    , @NamedQuery(name = "NhanVien.findByNoiCapCMND", query = "SELECT n FROM NhanVien n WHERE n.noiCapCMND = :noiCapCMND")
    , @NamedQuery(name = "NhanVien.findByNoiOHienTai", query = "SELECT n FROM NhanVien n WHERE n.noiOHienTai = :noiOHienTai")
    , @NamedQuery(name = "NhanVien.findByThuongTru", query = "SELECT n FROM NhanVien n WHERE n.thuongTru = :thuongTru")
    , @NamedQuery(name = "NhanVien.findByNoiSinh", query = "SELECT n FROM NhanVien n WHERE n.noiSinh = :noiSinh")
    , @NamedQuery(name = "NhanVien.findByNguyenQuan", query = "SELECT n FROM NhanVien n WHERE n.nguyenQuan = :nguyenQuan")
    , @NamedQuery(name = "NhanVien.findByNhanDang", query = "SELECT n FROM NhanVien n WHERE n.nhanDang = :nhanDang")
    , @NamedQuery(name = "NhanVien.findByTinhTrangHonNhan", query = "SELECT n FROM NhanVien n WHERE n.tinhTrangHonNhan = :tinhTrangHonNhan")
    , @NamedQuery(name = "NhanVien.findByGhiChu", query = "SELECT n FROM NhanVien n WHERE n.ghiChu = :ghiChu")})
public class NhanVien implements Serializable {

    @Column(name = "GioiTinh")
    private String gioiTinh;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idNV")
    private Integer idNV;
    @Column(name = "TenNV")
    private String tenNV;
    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Column(name = "NgayVaoDonVi")
    private String ngayVaoDonVi;
    @Column(name = "ChieuCao")
    private String chieuCao;
    @Column(name = "CanNang")
    private String canNang;
    @Column(name = "LoaiSucKhoe")
    private String loaiSucKhoe;
    @Column(name = "BenhLi")
    private String benhLi;
    @Column(name = "DT")
    private String dt;
    @Column(name = "DTDD")
    private String dtdd;
    @Column(name = "email")
    private String email;
    @Column(name = "CMND")
    private String cmnd;
    @Column(name = "NgayCapCMND")
    private String ngayCapCMND;
    @Column(name = "NoiCapCMND")
    private String noiCapCMND;
    @Column(name = "NoiOHienTai")
    private String noiOHienTai;
    @Column(name = "ThuongTru")
    private String thuongTru;
    @Column(name = "NoiSinh")
    private String noiSinh;
    @Column(name = "NguyenQuan")
    private String nguyenQuan;
    @Column(name = "NhanDang")
    private String nhanDang;
    @Column(name = "TinhTrangHonNhan")
    private String tinhTrangHonNhan;
    @Column(name = "GhiChu")
    private String ghiChu;
    @JoinColumn(name = "idDT", referencedColumnName = "idDT")
    @ManyToOne
    private DanToc idDT;
    @JoinColumn(name = "idDoi", referencedColumnName = "idDoi")
    @ManyToOne
    private Doi idDoi;
    @JoinColumn(name = "idNM", referencedColumnName = "idNM")
    @ManyToOne
    private NhomMau idNM;
    @JoinColumn(name = "idTG", referencedColumnName = "idTG")
    @ManyToOne
    private TonGiao idTG;
    @JoinColumn(name = "idTPGD", referencedColumnName = "idTPGD")
    @ManyToOne
    private Tpgd idTPGD;
    @JoinColumn(name = "idTPXH", referencedColumnName = "idTPXH")
    @ManyToOne
    private Tpxh idTPXH;

    public NhanVien() {
    }

    public NhanVien(Integer idNV, String tenNV, String ngaySinh, String gioiTinh, String ngayVaoDonVi, String chieuCao, String canNang, String loaiSucKhoe, String benhLi, String dt, String dtdd, String email, String cmnd, String ngayCapCMND, String noiCapCMND, String noiOHienTai, String thuongTru, String noiSinh, String nguyenQuan, String nhanDang, String tinhTrangHonNhan, String ghiChu, DanToc idDT, Doi idDoi, NhomMau idNM, TonGiao idTG, Tpgd idTPGD, Tpxh idTPXH) {
        this.idNV = idNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.ngayVaoDonVi = ngayVaoDonVi;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.loaiSucKhoe = loaiSucKhoe;
        this.benhLi = benhLi;
        this.dt = dt;
        this.dtdd = dtdd;
        this.email = email;
        this.cmnd = cmnd;
        this.ngayCapCMND = ngayCapCMND;
        this.noiCapCMND = noiCapCMND;
        this.noiOHienTai = noiOHienTai;
        this.thuongTru = thuongTru;
        this.noiSinh = noiSinh;
        this.nguyenQuan = nguyenQuan;
        this.nhanDang = nhanDang;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.ghiChu = ghiChu;
        this.idDT = idDT;
        this.idDoi = idDoi;
        this.idNM = idNM;
        this.idTG = idTG;
        this.idTPGD = idTPGD;
        this.idTPXH = idTPXH;
    }

    public NhanVien(Integer idNV) {
        this.idNV = idNV;
    }

    public Integer getIdNV() {
        return idNV;
    }

    public void setIdNV(Integer idNV) {
        this.idNV = idNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


    public String getNgayVaoDonVi() {
        return ngayVaoDonVi;
    }

    public void setNgayVaoDonVi(String ngayVaoDonVi) {
        this.ngayVaoDonVi = ngayVaoDonVi;
    }

    public String getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getCanNang() {
        return canNang;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }

    public String getLoaiSucKhoe() {
        return loaiSucKhoe;
    }

    public void setLoaiSucKhoe(String loaiSucKhoe) {
        this.loaiSucKhoe = loaiSucKhoe;
    }

    public String getBenhLi() {
        return benhLi;
    }

    public void setBenhLi(String benhLi) {
        this.benhLi = benhLi;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getDtdd() {
        return dtdd;
    }

    public void setDtdd(String dtdd) {
        this.dtdd = dtdd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgayCapCMND() {
        return ngayCapCMND;
    }

    public void setNgayCapCMND(String ngayCapCMND) {
        this.ngayCapCMND = ngayCapCMND;
    }

    public String getNoiCapCMND() {
        return noiCapCMND;
    }

    public void setNoiCapCMND(String noiCapCMND) {
        this.noiCapCMND = noiCapCMND;
    }

    public String getNoiOHienTai() {
        return noiOHienTai;
    }

    public void setNoiOHienTai(String noiOHienTai) {
        this.noiOHienTai = noiOHienTai;
    }

    public String getThuongTru() {
        return thuongTru;
    }

    public void setThuongTru(String thuongTru) {
        this.thuongTru = thuongTru;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public void setNguyenQuan(String nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
    }

    public String getNhanDang() {
        return nhanDang;
    }

    public void setNhanDang(String nhanDang) {
        this.nhanDang = nhanDang;
    }

    public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public DanToc getIdDT() {
        return idDT;
    }

    public void setIdDT(DanToc idDT) {
        this.idDT = idDT;
    }

    public Doi getIdDoi() {
        return idDoi;
    }

    public void setIdDoi(Doi idDoi) {
        this.idDoi = idDoi;
    }

    public NhomMau getIdNM() {
        return idNM;
    }

    public void setIdNM(NhomMau idNM) {
        this.idNM = idNM;
    }

    public TonGiao getIdTG() {
        return idTG;
    }

    public void setIdTG(TonGiao idTG) {
        this.idTG = idTG;
    }

    public Tpgd getIdTPGD() {
        return idTPGD;
    }

    public void setIdTPGD(Tpgd idTPGD) {
        this.idTPGD = idTPGD;
    }

    public Tpxh getIdTPXH() {
        return idTPXH;
    }

    public void setIdTPXH(Tpxh idTPXH) {
        this.idTPXH = idTPXH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNV != null ? idNV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhanVien)) {
            return false;
        }
        NhanVien other = (NhanVien) object;
        if ((this.idNV == null && other.idNV != null) || (this.idNV != null && !this.idNV.equals(other.idNV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ims.dal.NhanVien[ idNV=" + idNV + " ]";
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
