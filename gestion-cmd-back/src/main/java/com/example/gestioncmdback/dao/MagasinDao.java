package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagasinDao extends JpaRepository<Magasin,Long> {

    Magasin findByLibelle(String libelle);
    int deleteByLibelle(String libelle);




}
