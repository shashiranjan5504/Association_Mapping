package org.jsp;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;



public class FindPersonByName {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the person name ");
        String key=new Scanner(System.in).next();

        Query q=em.createQuery("select p from Person p where p.name=:name");
        q.setParameter("name",key);
        List<Person> plist=q.getResultList();
        if(!plist.isEmpty()){
            for(Person p:plist)
                System.out.println(p);


        }


    }
}
