package org.jsp;

import javax.persistence.*;
import javax.smartcardio.Card;
import java.util.Scanner;

public class FindPancardByPersonId {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        System.out.println("enter the person id");
//        Query q=em.createQuery("select p.card from Person p where p.id=?1 ");
//        q.setParameter(1,new Scanner(System.in).nextInt());
//        try{
//            Pancard card=(Pancard) q.getSingleResult();
//            System.out.println(card);
//
//        }catch(NoResultException exp){
//            System.out.println("No Record found");
//        }

        int key =new Scanner(System.in).nextInt();
        Person p=(Person)em.find(Person.class,key);
        if(p!=null){
            if(p.getCard()!=null)
                System.out.println(p.getCard());
        }

    }
}
