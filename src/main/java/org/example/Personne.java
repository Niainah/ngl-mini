package org.example;

public class Personne extends Utilisateur {
    private String prénom;
    private String nom;
    private String email;

    public Personne(String id, String prénom, String nom, String email) {
        super(id);
        this.prénom = prénom;
        this.nom = nom;
        this.email = email;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String afficherInfo() {
        return "ID: " + getId() + ", Nom: " + nom + ", Prénom: " + prénom + ", Email: " + email;
    }
}