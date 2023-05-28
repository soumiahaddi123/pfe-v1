package com.example.gestioncmdback.ws;

import com.example.gestioncmdback.bean.Reception;
import com.example.gestioncmdback.service.ReceptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/reception")
public class ReceptionWs {
    @GetMapping("/reference/{reference}")
    public Reception findByReference(String reference) {
        return receptionService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(String reference) {
        return receptionService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Reception> findAll() {
        return receptionService.findAll();
    }

    @Autowired
    private ReceptionService receptionService;
}
