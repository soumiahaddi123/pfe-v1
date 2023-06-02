package com.example.gestioncmdback.service;

import com.example.gestioncmdback.bean.Reception;
import com.example.gestioncmdback.dao.ReceptionDao;
import com.example.gestioncmdback.dao.ReceptionItemDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionService {

    public Reception findByReference(String reference) {
        return receptionDao.findByReference(reference);
    }
    @Transactional
    public int deleteByReference(String reference) {
        return receptionDao.deleteByReference(reference);
    }

    public List<Reception> findAll() {
        return receptionDao.findAll();
    }

    public int save(Reception reception){
        if(findByReference(reception.getReference())!=null){
            return -1;
        }else {
            receptionDao.save(reception);
            
            return 1;
        }
    }

    @Autowired
    private ReceptionDao receptionDao;

    @Autowired
    private ReceptionItemService receptionItemService;
}
