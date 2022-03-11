package com.example.api;

public class Item {
    public int id ;
    public String nom ;
    public String prenom ;
    public String cne ;

    public Item(int id, String nom, String prenom, String cne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
}
