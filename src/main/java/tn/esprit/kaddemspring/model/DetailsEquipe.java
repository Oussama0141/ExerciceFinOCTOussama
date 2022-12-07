package tn.esprit.kaddemspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailsEquipe {
    @Id
    private long idDetailsEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy ="detailsequipe",cascade = CascadeType.ALL)
    private Equipe equipe;

}
