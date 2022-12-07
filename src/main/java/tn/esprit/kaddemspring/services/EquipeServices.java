package tn.esprit.kaddemspring.services;

import tn.esprit.kaddemspring.model.Equipe;

import java.util.List;

public interface EquipeServices {
    Equipe addEquipe(Equipe Equipe);

    List<Equipe> findAllEquipes();

    void deleteEquipeById(Long id);

    Equipe UpdateEquipe(Equipe Equipe);

    Equipe GetEquipeById(Long id);

}
