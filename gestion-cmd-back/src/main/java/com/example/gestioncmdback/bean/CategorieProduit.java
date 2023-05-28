package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CategorieProduit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String libelle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    private String ref;
}
