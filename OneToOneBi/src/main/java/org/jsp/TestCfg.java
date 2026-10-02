package org.jsp;

import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class TestCfg {
    static void main(String[] args) {

            EntityManagerFactory emf= createEntityManagerFactory("dev");
            System.out.println(emf);
    }

}
