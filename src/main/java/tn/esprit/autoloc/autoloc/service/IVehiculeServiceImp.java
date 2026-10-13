package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
public class IVehiculeServiceImp implements IVehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> consulterVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule consulterVehiculeById(long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElse(null);
    }

    @Override
    public void supprimerVehiculeById(long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }
}
