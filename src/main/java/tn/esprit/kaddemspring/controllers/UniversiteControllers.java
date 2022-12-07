package tn.esprit.kaddemspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddemspring.model.Departement;
import tn.esprit.kaddemspring.model.Université;
import tn.esprit.kaddemspring.services.UniversiteServices;
import tn.esprit.kaddemspring.services.UniversiteServicesImpl;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/universite")
public class UniversiteControllers {

    @Autowired
    public UniversiteServices UniversiteService;


    @GetMapping("/all")
    public ResponseEntity<List<Université>> getAllUniversite(){
        List<Université> université = UniversiteService.findAllUniversites();
        return new ResponseEntity<>(université, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Université> addUniversite(@RequestBody Université universite){
        Université newUniversite = UniversiteService.addUniversite(universite);
        return new ResponseEntity<>(newUniversite, HttpStatus.CREATED);
    }


}

