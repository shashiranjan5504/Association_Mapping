package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindUserByAadharNumber {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the aadhar  number");
        Query q=em.createQuery("select a.user from AadharCard a  where  a.no=?1");
        Query name = q.setParameter(1, new Scanner(System.in).nextLong());
        try{
            User u=(User)q.getSingleResult();
            System.out.println(u);

        }catch(NoResultException exp){
            System.err.println("no user record found");
        }
    }
}

