package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    List<Employe> consulterEmployes();
    Employe consulterEmployeById(long idEmploye);
    void supprimerEmployeById(long idEmploye);
}
