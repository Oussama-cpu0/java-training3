import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
    // Classe interne pour représenter un livre
    static class Livre {
        private String titre;
        private String auteur;

        public Livre(String titre, String auteur) {
            this.titre = titre;
            this.auteur = auteur;
        }

        public String getTitre() {
            return titre;
        }

        public String getAuteur() {
            return auteur;
        }

        @Override
        public String toString() {
            return "Titre: " + titre + ", Auteur: " + auteur;
        }
    }

    // Liste pour stocker les livres
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    // Ajouter un livre
    public void ajouterLivre(String titre, String auteur) {
        livres.add(new Livre(titre, auteur));
        System.out.println("Livre ajouté : " + titre);
    }

    // Afficher tous les livres
    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
        } else {
            System.out.println("Liste des livres disponibles :");
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        }
    }

    // Rechercher un livre par titre
    public void rechercherLivreParTitre(String titre) {
        boolean trouve = false;
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                System.out.println("Livre trouvé : " + livre);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun livre trouvé avec le titre : " + titre);
        }
    }

    // Rechercher un livre par auteur
    public void rechercherLivreParAuteur(String auteur) {
        boolean trouve = false;
        for (Livre livre : livres) {
            if (livre.getAuteur().equalsIgnoreCase(auteur)) {
                System.out.println("Livre trouvé : " + livre);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun livre trouvé avec l'auteur : " + auteur);
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Menu Bibliothèque ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher tous les livres");
            System.out.println("3. Rechercher un livre par titre");
            System.out.println("4. Rechercher un livre par auteur");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez le titre du livre : ");
                    String titre = scanner.nextLine();
                    System.out.print("Entrez l'auteur du livre : ");
                    String auteur = scanner.nextLine();
                    bibliotheque.ajouterLivre(titre, auteur);
                    break;
                case 2:
                    bibliotheque.afficherLivres();
                    break;
                case 3:
                    System.out.print("Entrez le titre du livre à rechercher : ");
                    String rechercheTitre = scanner.nextLine();
                    bibliotheque.rechercherLivreParTitre(rechercheTitre);
                    break;
                case 4:
                    System.out.print("Entrez l'auteur du livre à rechercher : ");
                    String rechercheAuteur = scanner.nextLine();
                    bibliotheque.rechercherLivreParAuteur(rechercheAuteur);
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);

        scanner.close();
    }
}
