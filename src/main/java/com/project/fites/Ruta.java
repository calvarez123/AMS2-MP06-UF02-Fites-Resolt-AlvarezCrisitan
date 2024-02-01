package com.project.fites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    private Aeroport origen;

    @ManyToOne
    private Aeroport desti;

    public Ruta(){

    }

    public Ruta(Long id, String nom, Aeroport origen, Aeroport desti) {
        this.id = id;
        this.nom = nom;
        this.origen = origen;
        this.desti = desti;
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

    public Aeroport getOrigen() {
        return this.origen;
    }

    public void setOrigen(Aeroport origen) {
        this.origen = origen;
    }

    public Aeroport getDesti() {
        return this.desti;
    }

    public void setDesti(Aeroport desti) {
        this.desti = desti;
    }

    @Override
    public String toString() {
        return String.format("Ruta id= %d ---> nom= '%s'\norigen= %s\ndestino= %s\n",getId(), getNom(), getOrigen(), getDesti());
    }
    

}
