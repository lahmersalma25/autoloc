package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Contrat;
import tn.esprit.autoloc.autoloc.repository.ContratRepository;

import java.util.List;


@Service


public class IContratServiceImp implements IContratService {
    @Autowired
    private ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modfierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> consulterContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat consulterContratById(long idContrat) {
        return (Contrat) contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void supprimerContratById(long idContrat) {
        contratRepository.deleteById(idContrat);

    }
}
