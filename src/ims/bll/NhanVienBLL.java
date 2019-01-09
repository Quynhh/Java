/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.NhanVien;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class NhanVienBLL {
      BaseUtil base;
    
   public NhanVienBLL(){
        base = new BaseUtil(NhanVien.class);
   }
   
       public NhanVien findByName(Object idNV) {
        NhanVien nhanvien = new NhanVien();
        nhanvien = (NhanVien) base.findByCol("TenNV", idNV);
        return nhanvien;
    }

    public List<NhanVien> findAll() {
        List<NhanVien> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idNV) {
        NhanVien nhanvien = new NhanVien();
        base.deleteByCol(nhanvien.getIdDT().getClass().getName(), idNV);
    }
    
}
