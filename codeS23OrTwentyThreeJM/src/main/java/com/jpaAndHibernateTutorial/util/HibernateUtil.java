package com.jpaAndHibernateTutorial.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory emf;
//    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    static {
        emf = Persistence.createEntityManagerFactory("default");
//        emf = Persistence.createEntityManagerFactory("name file persistence in tag <persistence-unit name="default">");
    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
