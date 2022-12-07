package tn.esprit.kaddemspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemspring.model.Etudiant;
import tn.esprit.kaddemspring.model.Université;
import tn.esprit.kaddemspring.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServicesImpl implements UniversiteServices {

    @Autowired
    public UniversiteRepository UniversiteRepository;

    @Override
    public Université addUniversite(Université Universite){
        return UniversiteRepository.save(Universite);
    }

    @Override
    public List<Université> findAllUniversites(){
        return (List<Université>) UniversiteRepository.findAll();
    }

    @Override
    public void deleteUniversiteById(Long id) {
        UniversiteRepository.deleteById(id);
    }

    @Override
    public Université UpdateUniversite(Université Universite){
        return UniversiteRepository.save(Universite);
    }

    public Université GetUniversiteById(Long id) {
        return UniversiteRepository.findById(id).orElse(null);
    }

}
