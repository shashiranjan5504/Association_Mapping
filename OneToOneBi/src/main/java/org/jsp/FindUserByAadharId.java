package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindUserByAadharId {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the aadhar id");
        Query q=em.createQuery("select a.user from AadharCard a  where  a.id=?1");
        Query name = q.setParameter(1, new Scanner(System.in).nextInt());
        try{
            User u=(User)q.getSingleResult();
            System.out.println(u);

        }catch(NoResultException exp){
            System.err.println("no user record found");
        }
    }
}
