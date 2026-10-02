package org.jsp;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private Long phoneNo;
    @OneToOne
    private Pancard card;

    public int getId() {
        return id;
    }

    public Pancard getCard() {
        return card;
    }

    public void setCard(Pancard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }
}
