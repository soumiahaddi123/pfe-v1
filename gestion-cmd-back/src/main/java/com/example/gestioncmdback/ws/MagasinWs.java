package com.example.gestioncmdback.ws;

import com.example.gestioncmdback.bean.Magasin;
import com.example.gestioncmdback.service.MagasinService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/magasin")
public class MagasinWs {
    @GetMapping("/libelle/{libelle}")
    public Magasin findByLibelle(@PathVariable String libelle) {
        return magasinService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return magasinService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Magasin> findAll() {
        return magasinService.findAll();
    }

    @PostMapping("/")
    public Magasin save(Magasin magasin) {
        return magasinService.save(magasin);
    }

    @Autowired
    private MagasinService magasinService;
}
