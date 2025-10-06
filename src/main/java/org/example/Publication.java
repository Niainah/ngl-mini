package org.example;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Publication {
    private int id;
    private Utilisateur lien_utilisateur;
    private List<Message> messages_associes;

    public Publication(int id, Utilisateur lienUtilisateur, List<Message> messagesAssocies) {
        this.id = id;
        this.lien_utilisateur = lienUtilisateur;
        this.messages_associes = messagesAssocies;
    }

    public int getId() {
        return id;
    }

    public Utilisateur getLienUtilisateur() {
        return lien_utilisateur;
    }

    public List<Message> getMessagesAssocies() {
        return messages_associes;
    }

    public void afficherAuteurs() {
        Set<String> dejaAffiches = new HashSet<>();
        for (Message msg : messages_associes) {
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