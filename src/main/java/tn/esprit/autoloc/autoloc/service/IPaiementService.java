package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    List<Paiement> consulterPaiements();
    Paiement consulterPaiementById(long idPaiement);
    void supprimerPaiementById(long idPaiement);
}
