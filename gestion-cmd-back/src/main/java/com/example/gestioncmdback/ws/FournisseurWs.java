package com.example.gestioncmdback.ws;

import com.example.gestioncmdback.bean.Fournisseur;
import com.example.gestioncmdback.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



    @Autowired
    private FournisseurService fournisseurService;
}
