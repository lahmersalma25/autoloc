package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Contrat;
import java.util.List;
public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modfierContrat(Contrat contrat);
    List<Contrat> consulterContrat();
    Contrat consulterContratById(long idContrat);
    void supprimerContratById(long idContrat);
}
