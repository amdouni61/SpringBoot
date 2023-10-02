package com.example.projetabd.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    @ManyToOne
    @JoinColumn(name="foyer_id")
    private Foyer foyer ;

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    @OneToMany(mappedBy = "bloc" )
    private List<Chambre> chambreList ;

    public List<Chambre> getChambreList() {
        return chambreList;
    }

    public void setChambreList(List<Chambre> chambreList) {
        this.chambreList = chambreList;
    }
}
