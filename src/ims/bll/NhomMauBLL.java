/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.NhomMau;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class NhomMauBLL {
      BaseUtil base;
    
   public NhomMauBLL(){
        base = new BaseUtil(NhomMau.class);
   }
   
       public NhomMau findByName(Object idNM) {
        NhomMau nhommau = new NhomMau();
        nhommau = (NhomMau) base.findByCol("tenNhomMau", idNM);
        return nhommau;
    }
       
            public NhomMau findNM(Object tenNhomMau) {
        NhomMau nhommau = new NhomMau();
        nhommau = (NhomMau) base.findNhomMau("tenNhomMau", tenNhomMau);
        return nhommau;
    }

    public List<NhomMau> findAll() {
        List<NhomMau> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idNM) {
        NhomMau nhommau = new NhomMau();
        base.deleteByCol(nhommau.getIdNM().getClass().getName(), idNM);
    }
    
}
