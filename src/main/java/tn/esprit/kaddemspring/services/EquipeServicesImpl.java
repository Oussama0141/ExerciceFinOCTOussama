package tn.esprit.kaddemspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddemspring.model.Equipe;
import tn.esprit.kaddemspring.model.Etudiant;
import tn.esprit.kaddemspring.repository.EquipeRepository;

import java.util.List;

@Service
public class EquipeServicesImpl implements EquipeServices {
    @Autowired
    public EquipeRepository EquipeRepository;



    @Override
    public Equipe addEquipe(Equipe Equipe){
        return EquipeRepository.save(Equipe);
    }

    @Override
    public List<Equipe> findAllEquipes(){
        return (List<Equipe>) EquipeRepository.findAll();
    }

    @Override
    public void deleteEquipeById(Long id) {
        EquipeRepository.deleteById(id);
    }

    @Override
    public Equipe UpdateEquipe(Equipe Equipe) {
        return EquipeRepository.save(Equipe);
    }
    @Override
    public Equipe GetEquipeById(Long id) {
        return EquipeRepository.findById(id).orElse(null);
    }
    }
