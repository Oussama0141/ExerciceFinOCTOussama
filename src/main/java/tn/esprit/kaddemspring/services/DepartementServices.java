package tn.esprit.kaddemspring.services;

import tn.esprit.kaddemspring.model.Departement;

import java.util.List;

public interface DepartementServices {
    Departement addDepartement(Departement Departement);

    List<Departement> findAllDepartements();

    void deleteDepartementById(Long id);

    Departement UpdateDepartement(Departement Departement);

    Departement GetDepartementById(Long id);
}
