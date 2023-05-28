package com.example.gestioncmdback.service;

import com.example.gestioncmdback.bean.Fournisseur;
import com.example.gestioncmdback.dao.FournisseurDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    public Fournisseur findByNom(String nom) {
        return fournisseurDao.findByNom(nom);
    }

    @Transactional
    public int deleteByNom(String nom) {
        return fournisseurDao.deleteByNom(nom);
    }


    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }

    @Autowired
    private FournisseurDao fournisseurDao;



}
