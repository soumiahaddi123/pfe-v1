package com.example.gestioncmdback.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Commande {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ref;
    private double total;
    private double totalPaye;

    @OneToMany(mappedBy = "commande")
    private List<CommandeItem> commandeItems;

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(double totalPaye) {
        this.totalPaye = totalPaye;
    }

    public List<CommandeItem> getCommandeItems() {
        return commandeItems;
    }

    public void setCommandeItems(List<CommandeItem> commandeItems) {
        this.commandeItems = commandeItems;
    }
}
