package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Reception {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;
    private String reference;

    @ManyToOne
    private Commande commande;

    public List<ReceptionItem> getReceptionItems() {
        return receptionItems;
    }

    public void setReceptionItems(List<ReceptionItem> receptionItems) {
        this.receptionItems = receptionItems;
    }

    @OneToMany(mappedBy = "reception")
    private List<ReceptionItem> receptionItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
