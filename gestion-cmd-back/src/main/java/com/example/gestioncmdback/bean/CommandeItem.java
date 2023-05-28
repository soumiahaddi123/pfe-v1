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
    private BigDecimal prix;
    private BigDecimal quantité;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getQuantité() {
        return quantité;
    }

    public void setQuantité(BigDecimal quantité) {
        this.quantité = quantité;
    }
}
