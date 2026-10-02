package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Scanner;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class FindPancardByNumber {
    static void main(String[] args) {
        EntityManagerFactory emf= createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the pancard number ");
        String key =new Scanner(System.in).next();
        Query q=em.createQuery("select p.card from Person p where  p.card.panNo=:panNumber");
        q.setParameter("panNumber",key);
        Pancard p=(Pancard)q.getSingleResult();
        if(p!=null)
            System.out.println(p);



    }
}
