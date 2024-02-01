package com.project.fites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class Ciutat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "ciutat")
    private List<Aeroport> aeroports;


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

    public List<Aeroport> getAeroports() {
        return this.aeroports;
    }

    public void setAeroports(List<Aeroport> aeroports) {
        this.aeroports = aeroports;
    }

    public Ciutat(Long id, String nom, List<Aeroport> aeroports) {
        this.id = id;
        this.nom = nom;
        this.aeroports = aeroports;
    }

    public Ciutat(){
    }


    public Ciutat(String nom2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return String.format("Ciutatid=%d, nom='%s'", getId(), getNom());
    }

}
