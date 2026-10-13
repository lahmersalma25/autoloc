package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Employe;
import tn.esprit.autoloc.autoloc.repository.EmployeRepository;

import java.util.List;

@Service
public class IEmployeServiceImp implements IEmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> consulterEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmployeById(long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void supprimerEmployeById(long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
}
