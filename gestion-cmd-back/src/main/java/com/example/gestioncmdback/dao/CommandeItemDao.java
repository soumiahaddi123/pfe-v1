package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Commande;
import com.example.gestioncmdback.bean.CommandeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeItemDao extends JpaRepository<CommandeItem,Long> {
}
