package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private Set<CommandeItem> commandeItems;
}
