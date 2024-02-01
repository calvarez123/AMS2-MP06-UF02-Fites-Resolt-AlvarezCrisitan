package com.project.fites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    private Ciutat ciutat;

    public Aeroport (){

    }


    public Aeroport(Long id, String nom, Ciutat ciutat) {
        this.id = id;
        this.nom = nom;
        this.ciutat = ciutat;
    }

    public Aeroport(long ciutatId, String nomAeroport) {
        //TODO Auto-generated constructor stub
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ciutat getCiutat() {
        return this.ciutat;
    }

    public void setCiutat(Ciutat ciutat) {
        this.ciutat = ciutat;
    }

    @Override
    public String toString() {
        return String.format("Aeroport id=%d, nom='%s', ciutat =%s", getId(), getNom(), getCiutat());
    }


}
