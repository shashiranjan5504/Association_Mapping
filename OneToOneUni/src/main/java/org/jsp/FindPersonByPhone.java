package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class FindPersonByPhone {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the person phone number ");
        long key=new Scanner(System.in).nextLong();
        Query q=em.createQuery("select p  from Person p where p.phoneNo=?1");
        q.setParameter(1,key);
        Person p=(Person)q.getSingleResult();
        if(p!=null)
            System.out.println(p);
    }
}
