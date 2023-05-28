package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande,Long> {
 Commande findByRef(String ref);
 int deleteByRef(String ref);
}
