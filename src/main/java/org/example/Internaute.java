package org.example;

public class Internaute extends Utilisateur {
    public Internaute(String id) {
        super(id);
    }

    @Override
    public String afficherInfo() {
        return "ID: " + getId();
    }
}