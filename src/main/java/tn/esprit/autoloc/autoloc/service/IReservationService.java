package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    List<Reservation> consulterReservations();
    Reservation consulterReservationById(long idReservation);
    void supprimerReservationById(long idReservation);
}
