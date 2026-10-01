package org.jsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pancard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String panNo;
    private  String dob;

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public String getPanNo() {
        return panNo;
    }

    @Override
    public String toString() {
        return "Pancard{" +
                "dob='" + dob + '\'' +
                ", id=" + id +
                ", panNo='" + panNo + '\'' +
                '}';
    }
}
