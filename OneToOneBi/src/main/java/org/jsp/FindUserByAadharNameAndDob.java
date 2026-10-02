package org.jsp;

import javax.persistence.*;
import java.util.Scanner;

public class FindUserByAadharNameAndDob {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();



        Query q=em.createQuery("select a.user from AadharCard a  where  a.no=:number  and a.dob=:dob  ");
        System.out.println("enter the Aadhar Number");
        q.setParameter("number",new Scanner(System.in).nextLong());
        System.out.println("enter the  Aadhar dob");
        q.setParameter("dob",new Scanner(System.in).next());
        try{
            User u=(User)q.getSingleResult();
            System.out.println(u);
        }catch(NoResultException exp){
            System.out.println("No User Record");
        }
    }
}
