package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ReceptionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal qte;

    @ManyToOne
    private Magasin magasin;
    @OneToMany
    private Reception reception;
    @OneToMany
    private Produit produit;

    public void setQte(BigDecimal qte) {
        this.qte = qte;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getQte() {
        return qte;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }
}
