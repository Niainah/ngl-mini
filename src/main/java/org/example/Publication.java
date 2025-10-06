package org.example;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Publication {
    private int id;
    private Utilisateur lienUtilisateur;
    private List<Message> messagesAssocies;

    public Publication(int id, Utilisateur lienUtilisateur, List<Message> messagesAssocies) {
        this.id = id;
        this.lienUtilisateur = lienUtilisateur;
        this.messagesAssocies = messagesAssocies;
    }

    public int getId() {
        return id;
    }

    public Utilisateur getLienUtilisateur() {
        return lienUtilisateur;
    }

    public List<Message> getMessagesAssocies() {
        return messagesAssocies;
    }

    public void afficherAuteurs() {
        Set<String> dejaAffiches = new HashSet<>();
        for (Message msg : messagesAssocies) {
            if (msg.getAuteur() != null) {
                String info = msg.getAuteur().afficherInfo();
                if (!dejaAffiches.contains(info)) {
                    System.out.println(info);
                    dejaAffiches.add(info);
                }
            }
        }
    }
}