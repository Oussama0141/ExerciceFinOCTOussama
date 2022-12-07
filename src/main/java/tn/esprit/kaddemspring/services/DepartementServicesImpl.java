package tn.esprit.kaddemspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemspring.model.Departement;
import tn.esprit.kaddemspring.model.Equipe;
import tn.esprit.kaddemspring.repository.DepartementRepository;

import java.util.List;


@Service
public class DepartementServicesImpl implements DepartementServices {
    @Autowired
    public DepartementRepository DepartementRepository;

    @Override
    public Departement addDepartement(Departement Departement){
        return DepartementRepository.save(Departement);
    }

    @Override
    public List<Departement> findAllDepartements(){
        return (List<Departement>) DepartementRepository.findAll();
    }

    @Override
    public void deleteDepartementById(Long id) {
        DepartementRepository.deleteById(id);
    }

    @Override
    public Departement UpdateDepartement(Departement Departement){
        return DepartementRepository.save(Departement);
    }

    public Departement GetDepartementById(Long id) {
        return DepartementRepository.findById(id).orElse(null);
    }
}
