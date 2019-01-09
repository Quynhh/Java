/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.util;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Quynh
 */
public class BaseUtil<T> implements AppUtil<Object, Object> {

    final Class<T> typeParameterClass;
    static final String NAMEPERSISTENCE = "InventoryManagementPU";
    
     /**
     * Open connect entity manager.
     *
     * @param namePersistence
     * @return
     */
    
        public static EntityManager openTransaction() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NAMEPERSISTENCE);
        EntityManager entityManager = factory.createEntityManager();

        return entityManager;
    }

    public BaseUtil(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }
    
        public String getNameClass(Object o) {
        String nameEntity = o.toString().substring(o.toString().lastIndexOf(".") + 1, o.toString().length());
        return nameEntity;
    }

    public Object getClassMethod() {
        Class<T> c = typeParameterClass;
        return c;
    }
            
    @Override
    public Object findByCol(Object col, Object data) {
               EntityManager entityManager = openTransaction();
        entityManager.getTransaction().begin();
        String nameEntity = getNameClass(getClassMethod());
        System.out.println("NAME ENTITY SELECT: " + nameEntity);
        String sql = "";
        if (data instanceof String) {
            sql = "SELECT o FROM " + nameEntity + " o WHERE o." + col.toString() + " = '" + data.toString() + "'";
        }

        if (data instanceof Integer) {
            System.out.println("Integer");
            sql = "SELECT o FROM " + nameEntity + " o WHERE o." + col.toString() + " = " + data.toString() + "";
        }

        Query query = entityManager.createQuery(sql);

        return (Object) query.getSingleResult();  
    }

    @Override
    public void save(Object entity) {
       Class<?> c = (Class<Object>) typeParameterClass;

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NAMEPERSISTENCE);
        EntityManager entityManager = openTransaction();
        entityManager.getTransaction().begin();
        String nameEntity = getNameClass(getClassMethod());
        entityManager.persist(entity);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void update(Object entity) {
           Class<?> c = (Class<Object>) typeParameterClass;

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NAMEPERSISTEsNCE);
        EntityManager entityManager = openTransaction();
        entityManager.getTransaction().begin();
        String nameEntity = getNameClass(getClassMethod());
        entityManager.merge(entity);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteByCol(String col, Object data) {
       Class<?> c = (Class<Object>) typeParameterClass;

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NAMEPERSISTENCE);
        EntityManager entityManager = openTransaction();

        entityManager.getTransaction().begin();
        String nameEntity = getNameClass(getClassMethod());
        String sql = "";
        if (data instanceof String) {
            sql = "DELETE FROM " + nameEntity + " o WHERE o." + col.toString() + " = '" + data.toString() + "'";
        }

        if (data instanceof Integer) {
            System.out.println("Integer");
            sql = "DELETE FROM " + nameEntity + " o WHERE o." + col.toString() + " = " + data.toString() + "";
        }

        Query query = entityManager.createQuery(sql);
        query.executeUpdate();  
    }

    @Override
    public List<Object> findAll() {
     Class<T> c = typeParameterClass;
        List<Object> dataList = new ArrayList<>();

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory(NAMEPERSISTENCE);
        EntityManager entityManager = openTransaction();
        entityManager.getTransaction().begin();
        String nameEntity = getNameClass(getClassMethod());

        String sql = "SELECT o FROM " + nameEntity + " o ";
        Query query = entityManager.createQuery(sql);

        dataList = (List<Object>) query.getResultList();

//        entityManager.close();
//        entityManager.getEntityManagerFactory().close();
        return dataList;
    }

    @Override
    public Boolean checkExist(String Col, Object data) {
           Class<T> c = typeParameterClass;
        List<Object> dataList = new ArrayList<>();

        EntityManager entityManager = openTransaction();
        String nameEntity = getNameClass(getClassMethod());

        String sql = "SELECT COUNT(o) FROM " + nameEntity + " o WHERE " + Col + "= ";
        if (data instanceof Integer) {
            sql = sql + data;
        }
        if (data instanceof String) {
            sql = sql + "'" + data + "'";
        }

        Query query = entityManager.createQuery(sql);
        long result =(Long) query.getSingleResult();
        if (result == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
