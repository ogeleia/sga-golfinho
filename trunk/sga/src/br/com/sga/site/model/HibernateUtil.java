/*
 * HibernateUtil.java
 *
 * Created on August 7, 2006, 8:00 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package br.com.sga.site.model;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("SessionFactory - erro de criação." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
           return sessionFactory;
    }
      
    public static Session getSession() {
        return sessionFactory.openSession();
    }  
    
}

