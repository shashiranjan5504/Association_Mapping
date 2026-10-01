package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindPersonByPancardId {
    static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the pancard id");
        Query q=em.createQuery("select p from Person p where p.card.id=?1");
        q.setParameter(1,new Scanner(System.in).nextInt());
        try{
            Person p=(Person)q.getSingleResult();
            System.out.println(p);
        }catch(NoResultException e){
            System.err.println("no record found ");
        }
    }
}
