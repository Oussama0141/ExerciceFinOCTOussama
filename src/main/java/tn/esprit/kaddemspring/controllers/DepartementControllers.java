package tn.esprit.kaddemspring.controllers;

import org.apache.catalina.security.DeployXmlPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddemspring.model.Departement;
import tn.esprit.kaddemspring.model.Etudiant;
import tn.esprit.kaddemspring.services.DepartementServices;

import java.util.List;

@RestController
@RequestMapping("/Departement")
public class DepartementControllers {

    @Autowired
    public  DepartementServices DepartementService;

    @GetMapping("/all")
    public ResponseEntity<List<Departement>> getAllDepartement(){
        List<Departement> departements = DepartementService.findAllDepartements();
        return new ResponseEntity<>(departements, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Departement> addDepartement(@RequestBody Departement departement){
        Departement newDepartement = DepartementService.addDepartement(departement);
        return new ResponseEntity<>(newDepartement, HttpStatus.CREATED);
    }


}
