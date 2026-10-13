package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Agence;
import tn.esprit.autoloc.autoloc.repository.AgenceRepository;

import java.util.List;

@Service
public class IAgenceServiceImp implements IAgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> consulterAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence consulterAgenceById(long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public void supprimerAgenceById(long idAgence) {
        agenceRepository.deleteById(idAgence);
    }
}
