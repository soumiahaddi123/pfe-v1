package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Reception;
import com.example.gestioncmdback.bean.ReceptionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptionItemDao extends JpaRepository<ReceptionItem, Long> {

    List<ReceptionItem> findByReceptionReference(String reference);

    int deleteByReceptionReference(String reference);

}

