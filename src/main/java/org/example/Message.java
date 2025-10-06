package org.example;

import java.util.Date;

public class Message {
    private Utilisateur auteur;
    private String texte;
    private Date date_creation;
    private boolean confidentiel;

    public Message(String texte, Utilisateur auteur, boolean confidentiel) {
        this.texte = texte;
        this.auteur = auteur;
        this.confidentiel = confidentiel;
        this.date_creation = new Date();
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public String getTexte() {
        return texte;
    }

    public Date getDateCreation() {
        return date_creation;
    }

    public boolean isConfidentiel() {
        return confidentiel;
    }
}