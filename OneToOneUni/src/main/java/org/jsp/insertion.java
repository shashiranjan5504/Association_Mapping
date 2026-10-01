package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertion {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        Person p=new Person();
        p.setName("Shashi");
        p.setPhoneNo(24648764354685l);

        Pancard card=new Pancard();
        card.setPanNo("BOAP1235I");
        card.setDob("16-09-1993");

        em.persist(card);
        p.setCard(card);
        em.persist(p);
        et.commit();



    }
}
