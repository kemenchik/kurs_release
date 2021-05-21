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

    public Register(Integer id, Date date, Employee doctor, User client) {
        Id = id;
        this.date = date;
        this.doctor = doctor;
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
