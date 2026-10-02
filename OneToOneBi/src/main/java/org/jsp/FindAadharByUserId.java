package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class FindAadharByUserId {
    static void main() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the user id");
        User u=em.find(User.class,new Scanner(System.in).nextInt());
        if(u!=null){
            if(u.getCard()!=null){
                System.out.println(u.getCard());
            }
        }

    }
}
