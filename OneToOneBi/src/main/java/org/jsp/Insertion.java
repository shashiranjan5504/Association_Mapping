package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Insertion {
    static void main(String[] args) {
        EntityManagerFactory emf= createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();

        EntityTransaction et=em.getTransaction();
        et.begin();
        User u1= new User();
        u1.setName("Shashi");
        u1.setPassword("sash");
        u1.setPhone(4864874867486l);

        AadharCard card= new AadharCard();
        card.setNo(86487445l);
        card.setDob("16-09-1992");
        card.setAddress("Bikramganj");

        u1.setCard(card);
        em.persist(u1);
        et.commit();
    }
}
