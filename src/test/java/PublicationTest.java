import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublicationTest {

    @Test
    void testCreationPublicationParUtilisateurInscrit() {
        Personne personne = new Personne("première_id", "Aina", "Kely", "ainah@gmail.com");
        List<Message> messages = new ArrayList<>();
        Publication pub = new Publication(1, personne, messages);

        assertEquals(1, pub.getId());
        assertEquals(personne, pub.getLienUtilisateur());
        assertTrue(pub.getMessagesAssocies().isEmpty());
    }

    @Test
    void testAjoutMessagesMultiples() {
        Personne user1 = new Personne("deuxième_id", "pitou", "belouh", "pitouh@test.com");
        Internaute user2 = new Internaute("utilisateur_anonyme");

        Message m1 = new Message("Bonjour tout le monde", user1, false);
        Message m2 = new Message("Message anonyme", user2, true);

        List<Message> messages = new ArrayList<>();
        messages.add(m1);
        messages.add(m2);

        Publication pub = new Publication(2, user1, messages);

        assertEquals(2, pub.getMessagesAssocies().size());
        assertEquals("Bonjour tout le monde", pub.getMessagesAssocies().get(0).getTexte());
        assertEquals("Message anonyme", pub.getMessagesAssocies().get(1).getTexte());
    }

    @Test
    void testAfficherAuteurs() {
        Personne user1 = new Personne("troisième_id", "Mimi", "Socobis", "socobis@test.com");
        Internaute user2 = new Internaute("autre_utilisateur_anonyme");

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("bonjour", user1, false));
        messages.add(new Message("salut", user2, false));
        messages.add(new Message("aurevoir", user1, false));

        Publication pub = new Publication(3, user1, messages);

        pub.afficherAuteurs();
    }
}