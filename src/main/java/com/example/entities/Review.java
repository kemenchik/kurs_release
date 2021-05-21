package com.example.entities;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @OneToOne
    private User author;
    @OneToOne
    private Employee addressee;

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Employee getAddressee() {
        return addressee;
    }

    public void setAddressee(Employee addressee) {
        this.addressee = addressee;
    }

    public Review(String text, boolean isActive) {
        this.text = text; this.enabled = isActive;
    }

    public Review() {
    }

    public String getText (){
        return text;
    }
}
