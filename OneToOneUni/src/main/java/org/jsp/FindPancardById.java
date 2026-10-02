package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.Scanner;

import static javax.persistence.Persistence.*;

public class FindPancardById {
    static void main(String[] args) {
        EntityManagerFactory emf= createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the pancacrd id ");
        int key=new Scanner(System.in).nextInt();

//        Query q=em.createQuery("select  p.card from Person p where p.card.id =?1");
//        q.setParameter(1,key);
//        Pancard p=(Pancard)q.getSingleResult();
//        if(p!=null)
//            System.out.println(p);

        Pancard p=(Pancard)em.find(Pancard.class,key);
        if(p!=null)
            System.out.println(p);

    }
}
