package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Maintenance;
import tn.esprit.autoloc.autoloc.repository.MaintenanceRepository;

import java.util.List;

@Service
public class IMaintenanceServiceImp implements IMaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> consulterMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance consulterMaintenanceById(long idMaintenance) {
        return maintenanceRepository.findById(idMaintenance).orElse(null);
    }

    @Override
    public void supprimerMaintenanceById(long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }
}
