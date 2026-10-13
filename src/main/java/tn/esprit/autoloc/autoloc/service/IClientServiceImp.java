package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.repository.ClientRepository;

import java.util.List;

@Service
public class IClientServiceImp implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> consulterClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client consulterClientById(long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void supprimerClientById(long idClient) {
        clientRepository.deleteById(idClient);
    }
}
