package com.example.gestioncmdback.ws;

import com.example.gestioncmdback.bean.Reception;
import com.example.gestioncmdback.service.ReceptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reception-item")
public class ReceptionItemWs {
    @GetMapping("/reference/{reference}")
    public Reception findByReference(@PathVariable String reference) {
        return receptionService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return receptionService.deleteByReference(reference);
    }
    @GetMapping("/")
    public List<Reception> findAll() {
        return receptionService.findAll();
    }

    @PostMapping("/")
    public int save(Reception reception) {
        return receptionService.save(reception);
    }

    @Autowired
    private ReceptionService receptionService;
}
