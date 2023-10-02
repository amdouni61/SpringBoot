package com.example.projetabd.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation ;
    private Date anneeUniversitaire ;
    private Boolean estvalide ;

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public Boolean getEstvalide() {
        return estvalide;
    }

    public void setEstvalide(Boolean estvalide) {
        this.estvalide = estvalide;
    }

    @ManyToOne
    @JoinColumn(name="chambre_id")
    private Reservation reservation ;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
