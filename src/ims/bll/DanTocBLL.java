/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.DanToc;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class DanTocBLL {
    BaseUtil base;
    
   public DanTocBLL(){
        base = new BaseUtil(DanToc.class);
   }
   
       public DanToc findByName(Object id) {
        DanToc dantoc = new DanToc();
        dantoc = (DanToc) base.findByCol("nganhang", id);
        return dantoc;
    }

    public List<DanToc> findAll() {
        List<DanToc> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object id) {
        DanToc dantoc = new DanToc();
        base.deleteByCol(dantoc.getIdDT().getClass().getName(), id);
    }
}
