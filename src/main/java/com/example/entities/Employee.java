package com.example.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer count = id;
    private String firstName;
    private String secondName;
    private Date dates;
    private String cabinet;
    private String details;

    @OneToMany
    private Set<Review> comments;


    public Integer getId() {
        return this.id;
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

    public Set<Review> getComments() {
        return comments;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setComments(Set<Review> comments) {
        this.comments = comments;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public Employee(Integer id, String firstName, String secondName, Date dates, String cabinet, String details, Set<Review> comments) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dates = dates;
        this.cabinet = cabinet;
        this.details = details;
        this.comments = comments;
        this.count = id;
    }
}
