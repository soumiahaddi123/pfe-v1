package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Produit {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String ref;
    private String libelle;

    @ManyToOne
    private CategorieProduit categorieProduit;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

}
