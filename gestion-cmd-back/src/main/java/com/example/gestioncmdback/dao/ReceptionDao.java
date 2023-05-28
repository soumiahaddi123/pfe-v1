package com.example.gestioncmdback.dao;

import com.example.gestioncmdback.bean.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReceptionDao extends JpaRepository<Reception, Long> {

    Reception findByReference(String reference);
    int deleteByReference(String reference);

}
