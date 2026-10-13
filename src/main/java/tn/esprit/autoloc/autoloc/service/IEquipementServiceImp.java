package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Equipement;
import tn.esprit.autoloc.autoloc.repository.EquipementRepository;

import java.util.List;

@Service
public class IEquipementServiceImp implements IEquipementService {

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> consulterEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement consulterEquipementById(long idEquipement) {
        return equipementRepository.findById(idEquipement).orElse(null);
    }

    @Override
    public void supprimerEquipementById(long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }
}
