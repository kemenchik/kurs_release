package com.example.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private Date date;

    @OneToOne
    private Employee doctor;

    @OneToOne
    private User user;

    public Register(Date date, Employee doctor, User user, User client) {
        this.date = date;
        this.doctor = doctor;
        this.user = user;
        this.client = client;
    }

    @OneToOne
    private User client;

    public Register() {
    }

    public Register(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
