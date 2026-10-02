package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Scanner;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class FindUserById {
    static void main(String[] args) {
        EntityManagerFactory emf= createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the user id ");
        int key=new Scanner(System.in).nextInt();
        User u=em.find(User.class,key);
        if(u!=null){
            System.out.println(u);
        }

    }
}
