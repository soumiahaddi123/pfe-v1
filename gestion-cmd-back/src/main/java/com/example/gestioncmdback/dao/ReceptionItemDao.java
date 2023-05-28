package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Reception;
import com.example.gestioncmdback.bean.ReceptionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionItemDao extends JpaRepository<ReceptionItem,Long> {

    Reception findByReception(Reception reception);

    int deleteByReception(Reception reception);


}
