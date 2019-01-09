/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.util;

import java.util.List;

/**
 *
 * @author Quynh
 * @param <T>
 * @param <TypePrimaryKey>
 */
public interface AppUtil<T, TypePrimaryKey>  {
    
    /**
     * 
     * @param col
     * @param data
     * @return 
     */
    T findByCol(TypePrimaryKey col, Object data);
    
    /**
     * 
     * @param entity 
     */
    void save(T entity);
    
    /**
     * 
     * @param entity 
     */
    void update(T entity);
    
    /**
     * 
     * @param Col
     * @param data 
     */
    void deleteByCol(String Col, TypePrimaryKey data);
    
    /**
     * Find all entity.
     * @return List<T>
     */
    List<T> findAll();
    
    Boolean checkExist(String col, Object data);    
}
