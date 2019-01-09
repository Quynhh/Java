/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.Tpxh;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class TpxhBLL {
      BaseUtil base;
    
   public TpxhBLL(){
        base = new BaseUtil(Tpxh.class);
   }
   
       public Tpxh findByName(Object idTPXH) {
        Tpxh tpxh = new Tpxh();
        tpxh = (Tpxh) base.findByCol("tenTPXH", idTPXH);
        return tpxh;
    }

    public List<Tpxh> findAll() {
        List<Tpxh> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idTPXH) {
        Tpxh tpxh = new Tpxh();
        base.deleteByCol(tpxh.getIdTPXH().getClass().getName(), idTPXH);
    }
    
}
