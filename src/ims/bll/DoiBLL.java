/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.Doi;
import ims.util.BaseUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Quynh
 */
public class DoiBLL {
      BaseUtil base;
    
   public DoiBLL(){
        base = new BaseUtil(Doi.class);
   }
   
       public Doi findByName(Object idDoi) {
        Doi doi = new Doi();
        doi = (Doi) base.findByCol("tenDoi", idDoi);
        return doi;
    }

       public Doi findByDoi(Object tenDoi){
           Doi doi = new Doi();
        doi = (Doi) base.findDoi("tenDoi", tenDoi);
        return doi;
       }
    public List<Doi> findAll() {
        List<Doi> listData = new ArrayList<>();
        listData = base.findAll();
        return listData;
    }

    public void deleteById(Object idDoi) {
        Doi doi = new Doi();
        base.deleteByCol(doi.getIdDoi().getClass().getName(), idDoi);
    }
    
}
