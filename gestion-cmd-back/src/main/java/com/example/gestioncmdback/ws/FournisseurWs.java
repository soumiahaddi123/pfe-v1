package com.example.gestioncmdback.ws;

import com.example.gestioncmdback.bean.Fournisseur;
import com.example.gestioncmdback.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fourisseur")
public class FournisseurWs {

    @GetMapping("/nom/{nom}")
    public List<Fournisseur> findByNom(String nom) {
        return fournisseurService.findByNom(nom);
    }

    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(String nom) {
        return fournisseurService.deleteByNom(nom);
    }
    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }

    @PostMapping("/")
    public Fournisseur save(Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }

    @Autowired
    private FournisseurService fournisseurService;
}
