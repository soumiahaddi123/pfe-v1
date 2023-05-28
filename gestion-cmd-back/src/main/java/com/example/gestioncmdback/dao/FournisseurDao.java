package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {

   List<Fournisseur> findByNom(String nom);

   int deleteByNom(String nom);



}
