package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieProduitDao extends JpaRepository<CategorieProduit,Long> {
    CategorieProduit findByRef(String ref);
    int deleteByRef(String ref);
}
