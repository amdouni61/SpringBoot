package com.example.projetabd.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chambre extends  Reservation {

    private String numerochambre ;
    private TypeChambre typeChambre ;



    public String getNumerochambre() {
        return numerochambre;
    }

    public void setNumerochambre(String numerochambre) {
        this.numerochambre = numerochambre;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
    public Chambre (){

    }

    @ManyToOne
    @JoinColumn(name="bloc_id")
    private Bloc bloc ;

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }


    @OneToMany(mappedBy = "reservation" )
    private List<Reservation> reservationList ;

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }



}
