package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitDao extends JpaRepository<Produit,Long> {
    Produit findByRef(String ref);
    int deleteByRef(String ref);

    @Override
    List<Produit> findAll();
}
