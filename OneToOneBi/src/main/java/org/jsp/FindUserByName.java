package org.jsp;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;


public class FindUserByName {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the user name");
        Query q=em.createQuery("select u from User u  where  u.name=:name");
        q.setParameter("name",new Scanner(System.in).next());
        List<User> users=q.getResultList();
        if(!users.isEmpty())
            System.out.println(users);

    }
}
