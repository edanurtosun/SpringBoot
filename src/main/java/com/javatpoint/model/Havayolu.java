package com.javatpoint.model;


import javax.persistence.*;


@Entity
@Table
public class Havayolu {


    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String sirket_adi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSirket_adi() {
        return sirket_adi;
    }

    public void setSirket_adi(String sirket_adi) {
        this.sirket_adi = sirket_adi;
    }



}
