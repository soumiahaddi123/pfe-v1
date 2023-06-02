package com.example.gestioncmdback.service;

import com.example.gestioncmdback.bean.Magasin;
import com.example.gestioncmdback.dao.MagasinDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagasinService {

    public Magasin findByLibelle(String libelle) {
        return magasinDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByLibelle(String libelle) {
        return magasinDao.deleteByLibelle(libelle);
    }

    public List<Magasin> findAll() {
        return magasinDao.findAll();
    }

    public Magasin save(Magasin magasin){

        return magasinDao.save(magasin);
    }

    @Autowired
    private MagasinDao magasinDao;
}
