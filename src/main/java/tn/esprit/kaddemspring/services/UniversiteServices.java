package tn.esprit.kaddemspring.services;

import tn.esprit.kaddemspring.model.Université;

import java.util.List;

public interface UniversiteServices {
    Université addUniversite(Université Universite);

    List<Université> findAllUniversites();

    void deleteUniversiteById(Long id);

    Université UpdateUniversite(Université Universite);

    Université GetUniversiteById(Long id);

}
