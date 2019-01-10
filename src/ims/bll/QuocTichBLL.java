/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.QuocTich;
import ims.util.BaseUtil;
import static ims.util.BaseUtil.openTransaction;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Quynh
 */
public class QuocTichBLL {
      BaseUtil base;
    
   public QuocTichBLL(){
        base = new BaseUtil(QuocTich.class);
   }
   
       public QuocTich findByName(Object idQT) {
        QuocTich quoctich = new QuocTich();
        quoctich = (QuocTich) base.findByCol("tenQuocTich", idQT);
        return quoctich;
  
    }
       


    public List<QuocTich> findAll() {
        List<QuocTich> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idQT) {
        QuocTich quoctich = new QuocTich();
        base.deleteByCol(quoctich.getIdQT().getClass().getName(), idQT);
    }
    
}
