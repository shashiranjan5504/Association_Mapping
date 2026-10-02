package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindAadharByNumber {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the Aadhar number");
        Query q=em.createQuery("select a from AadharCard a  where  a.no=:number");
        q.setParameter("number",new Scanner(System.in).nextLong());
        try {
            AadharCard card = (AadharCard) q.getSingleResult();
            System.out.println(card);
        }catch(NoResultException exp){
            System.out.println("No Record Found");
        }

    }
}
