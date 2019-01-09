/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.TonGiao;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class TonGiaoBLL {
         BaseUtil base;
    
   public TonGiaoBLL(){
        base = new BaseUtil(TonGiao.class);
   }
   
       public TonGiao findByName(Object id) {
        TonGiao tongiao = new TonGiao();
        tongiao = (TonGiao) base.findByCol("nganhang", id);
        return tongiao;
    }

    public List<TonGiao> findAll() {
        List<TonGiao> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object id) {
        TonGiao tongiao = new TonGiao();
        base.deleteByCol(tongiao.getIdTG().getClass().getName(), id);
    }
    
    
}
