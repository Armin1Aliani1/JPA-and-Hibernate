package com.jpaAndHibernateTutorial;

import com.jpaAndHibernateTutorial.util.HibernateUtil;

import javax.persistence.EntityManagerFactory;

public class JpaApplication {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();
        System.out.println("done");
    }
}
