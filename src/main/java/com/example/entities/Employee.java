package com.example.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private Integer count = id;
    private String firstName;
    private String secondName;
    private String cabinet;
    private String details;
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Register> registers;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Review> comments;

    public Set<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(Set<Register> registers) {
        this.registers = registers;
    }

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

    public Employee(String firstName, String secondName, String cabinet, String details, String profession) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.cabinet = cabinet;
        this.details = details;
        this.profession = profession;
    }

    public Employee(Integer id, Integer count, String firstName, String secondName, String cabinet, String details, Set<Register> registers, Set<Review> comments) {
        this.id = id;
        this.count = count;
        this.firstName = firstName;
        this.secondName = secondName;
        this.cabinet = cabinet;
        this.details = details;
        this.registers = registers;
        this.comments = comments;
    }
}
