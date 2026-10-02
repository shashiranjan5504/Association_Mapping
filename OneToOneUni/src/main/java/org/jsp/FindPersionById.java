package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FindPersionById {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em= emf.createEntityManager();
        System.out.println("enter the person id ");
        int key=new Scanner(System.in).nextInt();
        Person p=em.find(Person.class,key);
        if(p!=null)
            System.out.println(p);

    }
}
