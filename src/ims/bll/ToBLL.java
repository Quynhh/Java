/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.To;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class ToBLL {
      BaseUtil base;
    
   public ToBLL(){
        base = new BaseUtil(To.class);
   }
   
       public To findByName(Object idTo) {
        To to = new To();
        to = (To) base.findByCol("tenTo", idTo);
        return to;
    }

    public List<To> findAll() {
        List<To> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idTo) {
        To to = new To();
        base.deleteByCol(to.getIdTo().getClass().getName(), idTo);
    }
    
}
