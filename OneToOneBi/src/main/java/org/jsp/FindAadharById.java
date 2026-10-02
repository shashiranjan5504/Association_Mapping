package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class FindAadharById {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the Aadhar id");
        AadharCard card=em.find(AadharCard.class,new Scanner(System.in).nextInt());
        if(card!=null)
            System.out.println(card);
    }
}
