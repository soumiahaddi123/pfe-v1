package com.example.gestioncmdback.service;

import com.example.gestioncmdback.bean.ReceptionItem;
import com.example.gestioncmdback.dao.ReceptionItemDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionItemService {

    public List<ReceptionItem> findByReceptionReference(String reference) {
        return receptionItemDao.findByReceptionReference(reference);
    }
    @Transactional
    public int deleteByReceptionReference(String reference) {
        return receptionItemDao.deleteByReceptionReference(reference);
    }

    public List<ReceptionItem> findAll() {
        return receptionItemDao.findAll();
    }


    public int save(ReceptionItem receptionItem){

         receptionItemDao.save(receptionItem);
        return 1;
    }

    @Autowired
    private ReceptionItemDao receptionItemDao;
}
