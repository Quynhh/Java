/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.PhongBan;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class PhongBanBLL {
      BaseUtil base;
    
   public PhongBanBLL(){
        base = new BaseUtil(PhongBan.class);
   }
   
       public PhongBan findByName(Object id) {
        PhongBan phongban = new PhongBan();
        phongban = (PhongBan) base.findByCol("nganhang", id);
        return phongban;
    }

    public List<PhongBan> findAll() {
        List<PhongBan> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object id) {
        PhongBan phongban = new PhongBan();
        base.deleteByCol(phongban.getIdPB().getClass().getName(), id);
    }
    
}
