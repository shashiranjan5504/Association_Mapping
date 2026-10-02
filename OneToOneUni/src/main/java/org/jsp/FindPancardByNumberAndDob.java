package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Scanner;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class FindPancardByNumberAndDob {
    static void main(String[] args) {
        EntityManagerFactory emf= createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the pancard number ");
        String key1=new Scanner(System.in).next();
        System.out.println("enter the pancard dob");
        String key2=new Scanner(System.in).next();
        Query q=em.createQuery("select p.card from Person p  where p.card.panNo=:panNumber and p.card.dob=:Dob");
        q.setParameter("panNumber",key1);
        q.setParameter("Dob",key2);
        Pancard p=(Pancard)q.getSingleResult();
        if(p!=null)
            System.out.println(p);

    }
}
