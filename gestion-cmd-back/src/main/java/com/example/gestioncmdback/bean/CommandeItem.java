package com.example.gestioncmdback.bean;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class CommandeItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Produit produit;
    private double prix;
    private BigDecimal quantité;

}
