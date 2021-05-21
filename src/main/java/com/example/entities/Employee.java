package com.example.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String firstName;
    private String secondName;
    private Date dates;
    private String cabinet;

    @ElementCollection
    private Set<String> comments;


    public Integer getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public Employee() {
    }

    public Set<String> getComments() {
        return comments;
    }

    public void setComments(Set<String> comments) {
        this.comments = comments;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public Employee(String firstName, String secondName, Date dates, String cabinet) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dates = dates;
        this.cabinet = cabinet;
    }
}
