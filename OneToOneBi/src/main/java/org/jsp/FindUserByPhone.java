package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindUserByPhone {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the user phone number");
        Query q=em.createQuery("select u from User u  where  u.phone=:phone");
        q.setParameter("phone",new Scanner(System.in).nextLong());
        try{
            User u=(User)q.getSingleResult();
            System.out.println(u);

        }catch(NoResultException exp){
            System.out.println("No Record Found");
        }
    }
}
