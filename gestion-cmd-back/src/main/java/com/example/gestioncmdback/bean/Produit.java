package com.example.gestioncmdback.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
}
