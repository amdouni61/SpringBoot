package com.example.projetabd.entities;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUniversite ;
    private String nomUniversite ;
    private String adresse ;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @OneToOne
    private Foyer foyerUniversite ;

    public Foyer getFoyerUniversite() {
        return foyerUniversite;
    }

    public void setFoyerUniversite(Foyer foyerUniversite) {
        this.foyerUniversite = foyerUniversite;
    }
}
