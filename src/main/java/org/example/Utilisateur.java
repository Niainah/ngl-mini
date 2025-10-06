package org.example;

public abstract class Utilisateur {
    private String id;

    public Utilisateur(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String afficherInfo();
}