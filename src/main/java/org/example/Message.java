package org.example;

import java.util.Date;

public class Message {
    private Utilisateur auteur;
    private String texte;
    private Date dateCreation;
    private boolean confidentiel;

    public Message(String texte, Utilisateur auteur, boolean confidentiel) {
        this.texte = texte;
        this.auteur = auteur;
        this.confidentiel = confidentiel;
        this.dateCreation = new Date();
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public String getTexte() {
        return texte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public boolean isConfidentiel() {
        return confidentiel;
    }
}