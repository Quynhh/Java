/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.Tpgd;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class TpgdBLL {
         BaseUtil base;
    
   public TpgdBLL(){
        base = new BaseUtil(Tpgd.class);
   }
   
       public Tpgd findByName(Object idTPGD ) {
        Tpgd tpgd = new Tpgd();
        tpgd = (Tpgd) base.findByCol("tenTPGD", idTPGD );
        return tpgd;
    }

    public List<Tpgd> findAll() {
        List<Tpgd> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void  deleteById(Object idTPGD ) {
        Tpgd tpgd = new Tpgd();
        base.deleteByCol(tpgd.getIdTPGD().getClass().getName(), idTPGD );
    }
    
    
}
