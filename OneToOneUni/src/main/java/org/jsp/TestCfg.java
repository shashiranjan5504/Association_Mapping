package org.jsp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCfg {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
          System.out.println(emf);



    }
}
