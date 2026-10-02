package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindAadharByUserPhone {
    static void main() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the user phone number");
        Query q=em.createQuery("select u.card from User u  where  u.phone=:number");
        q.setParameter("number",new Scanner(System.in).nextLong());
        try{
            AadharCard card=(AadharCard) q.getSingleResult();
            System.out.println(card);
        }catch(NoResultException exp){
            System.out.println("No AadharCard Record");
        }

    }


}
