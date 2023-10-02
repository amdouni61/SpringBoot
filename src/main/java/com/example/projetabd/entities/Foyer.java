package com.example.projetabd.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFoyer ;
    private String nomFoyer ;
    private long capaciteFoyer ;

    public Long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
    @OneToMany(mappedBy = "foyer" )
    private List<Bloc> blocList ;

    public List<Bloc> getBlocList() {
        return blocList;
    }

    public void setBlocList(List<Bloc> blocList) {
        this.blocList = blocList;
    }

    @OneToOne(mappedBy = "foyerUniversite")
    private Universite universite ;

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }
}
