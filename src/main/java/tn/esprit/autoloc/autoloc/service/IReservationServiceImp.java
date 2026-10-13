package tn.esprit.autoloc.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Reservation;
import tn.esprit.autoloc.autoloc.repository.ReservationRepository;

import java.util.List;

@Service
public class IReservationServiceImp implements IReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> consulterReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation consulterReservationById(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void supprimerReservationById(long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
