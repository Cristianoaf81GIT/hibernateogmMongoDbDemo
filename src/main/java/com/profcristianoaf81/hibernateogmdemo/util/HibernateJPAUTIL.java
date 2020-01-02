package com.profcristianoaf81.hibernateogmdemo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cristianoaf81
 */
public class HibernateJPAUTIL {
     private static final EntityManagerFactory EMF = setEntityManagerFactory();
             
     private static EntityManagerFactory setEntityManagerFactory(){
         try{
             return Persistence
                 .createEntityManagerFactory("ogm-mongodb");
         }catch(Exception e){
             throw new ExceptionInInitializerError(e);
         }                 
         
     }
     
     public static EntityManager getEntityManagerFactory(){
         return EMF.createEntityManager();
     }

}
