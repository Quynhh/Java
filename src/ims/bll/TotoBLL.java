/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.Toto;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quynh
 */
public class TotoBLL {
      BaseUtil base;
    
   public TotoBLL(){
        base = new BaseUtil(Toto.class);
   }
   
       public Toto findByName(Object idTo) {
        Toto toto = new Toto();
        toto = (Toto) base.findByCol("tenTo", idTo);
        return toto;
    }

    public List<Toto> findAll() {
        List<Toto> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idTo) {
        Toto toto = new Toto();
        base.deleteByCol(toto.getIdTo().getClass().getName(), idTo);
    }
    
}
