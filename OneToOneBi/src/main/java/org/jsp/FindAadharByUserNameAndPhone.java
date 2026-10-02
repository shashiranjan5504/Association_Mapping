package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindAadharByUserNameAndPhone {
    static void main() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();

        Query q=em.createQuery("select u.card from User u  where  u.phone=:number  and u.name=:name");
        System.out.println("enter the user name");
        q.setParameter("name",new Scanner(System.in).next());
        System.out.println("enter the user phone number");
        q.setParameter("number",new Scanner(System.in).nextLong());
        try{
            AadharCard card=(AadharCard) q.getSingleResult();
            System.out.println(card);
        }catch(NoResultException exp){
            System.out.println("No AadharCard Record");
        }

    }
}
