package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

@Entity
public class Reception {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;
    private String reference;





}
