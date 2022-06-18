package com.jpaAndHibernateTutorial;

import com.jpaAndHibernateTutorial.domain.User;
import com.jpaAndHibernateTutorial.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaApplication {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<User> query = entityManager.createQuery("SELECT u from User u", User.class);
        List<User> userList = query.getResultList();
        if (userList == null || userList.isEmpty()) {
            System.out.println("Empty users");
        } else {
            userList.forEach(user -> System.out.println(user));
        }

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        User user = new User("Armin", "Aliani", "ArminA", "123456789");
        entityManager.persist(user);
        System.out.println(user);

        transaction.commit();

        userList = query.getResultList();
        System.out.println(userList);

        System.out.println("end");
    }
}
