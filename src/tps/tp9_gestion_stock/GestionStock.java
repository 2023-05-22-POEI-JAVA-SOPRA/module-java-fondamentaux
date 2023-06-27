package tps.tp9_gestion_stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionStock {
    private List<Article> stock;
    private Scanner scanner;

    public GestionStock() {
        stock = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void afficherMenu() {
        System.out.println("===== Gestion du Stock =====");
        System.out.println("1. Rechercher un article par référence");
        System.out.println("2. Ajouter un article au stock");
        System.out.println("3. Supprimer un article par référence");
        System.out.println("4. Modifier un article par référence");
        System.out.println("5. Rechercher un article par nom");
        System.out.println("6. Rechercher un article par intervalle de prix de vente");
        System.out.println("7. Afficher tous les articles");
        System.out.println("8. Quitter");
    }

    public void executer() {
        boolean quitter = false;
        while (!quitter) {
            afficherMenu();
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne vide après la saisie du choix

            switch (choix) {
                case 1:
                    rechercherArticleParReference();
                    break;
                case 2:
                    ajouterArticleAuStock();
                    break;
                case 3:
                    supprimerArticleParReference();
                    break;
                case 4:
                    modifierArticleParReference();
                    break;
                case 5:
                    rechercherArticleParNom();
                    break;
                case 6:
                    rechercherArticleParIntervallePrix();
                    break;
                case 7:
                    afficherTousLesArticles();
                    break;
                case 8:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }

            System.out.println();
        }
    }

    private void rechercherArticleParReference() {
        System.out.print("Veuillez saisir la référence de l'article : ");
        int reference = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne vide après la saisie de la référence

        Article articleTrouve = null;
        for (Article article : stock) {
            if (article.getReference() == reference) {
                articleTrouve = article;
                break;
            }
        }

        if (articleTrouve != null) {
            System.out.println("Article trouvé : " + articleTrouve);
        } else {
            System.out.println("Aucun article trouvé avec la référence : " + reference);
        }
    }

    private void ajouterArticleAuStock() {
        System.out.print("Veuillez saisir la référence de l'article : ");
        int reference = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne vide après la saisie de la référence

        // Vérifier l'unicité de la référence
        boolean referenceExistante = false;
        for (Article article : stock) {
            if (article.getReference() == reference) {
                referenceExistante = true;
                break;
            }
        }

        if (referenceExistante) {
            System.out.println("Article avec la référence " + reference + " déjà existant dans le stock.");
        } else {
            System.out.print("Veuillez saisir le nom de l'article : ");
            String nom = scanner.nextLine();

            System.out.print("Veuillez saisir le prix de vente de l'article : ");
            double prixVente = scanner.nextDouble();
            scanner.nextLine(); // Consommer la ligne vide après la saisie du prix de vente

            System.out.print("Veuillez saisir la quantité en stock de l'article : ");
            int quantiteStock = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne vide après la saisie de la quantité en stock

            Article nouvelArticle = new Article(reference, nom, prixVente, quantiteStock);
            stock.add(nouvelArticle);

            System.out.println("Article ajouté avec succès au stock : " + nouvelArticle);
        }
    }

    private void supprimerArticleParReference() {
        System.out.print("Veuillez saisir la référence de l'article à supprimer : ");
        int reference = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne vide après la saisie de la référence

        boolean articleSupprime = false;
        for (Article article : stock) {
            if (article.getReference() == reference) {
                stock.remove(article);
                articleSupprime = true;
                break;
            }
        }

        if (articleSupprime) {
            System.out.println("Article avec la référence " + reference + " supprimé du stock.");
        } else {
            System.out.println("Aucun article trouvé avec la référence : " + reference);
        }
    }

    private void modifierArticleParReference() {
        System.out.print("Veuillez saisir la référence de l'article à modifier : ");
        int reference = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne vide après la saisie de la référence

        Article articleAModifier = null;
        for (Article article : stock) {
            if (article.getReference() == reference) {
                articleAModifier = article;
                break;
            }
        }

        if (articleAModifier != null) {
            System.out.println("Article trouvé : " + articleAModifier);
            System.out.println("Veuillez saisir les nouvelles informations de l'article :");

            System.out.print("Nouveau nom : ");
            String nouveauNom = scanner.nextLine();
            articleAModifier.setNom(nouveauNom);

            System.out.print("Nouveau prix de vente : ");
            double nouveauPrixVente = scanner.nextDouble();
            scanner.nextLine(); // Consommer la ligne vide après la saisie du nouveau prix de vente
            articleAModifier.setPrixVente(nouveauPrixVente);

            System.out.print("Nouvelle quantité en stock : ");
            int nouvelleQuantiteStock = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne vide après la saisie de la nouvelle quantité en stock
            articleAModifier.setQuantiteStock(nouvelleQuantiteStock);

            System.out.println("Article modifié avec succès : " + articleAModifier);
        } else {
            System.out.println("Aucun article trouvé avec la référence : " + reference);
        }
    }

    private void rechercherArticleParNom() {
        System.out.print("Veuillez saisir le nom de l'article : ");
        String nom = scanner.nextLine();

        List<Article> articlesTrouves = new ArrayList<>();
        for (Article article : stock) {
            if (article.getNom().equalsIgnoreCase(nom)) {
                articlesTrouves.add(article);
            }
        }

        if (!articlesTrouves.isEmpty()) {
            System.out.println("Articles trouvés : ");
            for (Article article : articlesTrouves) {
                System.out.println(article);
            }
        } else {
            System.out.println("Aucun article trouvé avec le nom : " + nom);
        }
    }

    private void rechercherArticleParIntervallePrix() {
        System.out.print("Veuillez saisir le prix minimum : ");
        double prixMin = scanner.nextDouble();
        scanner.nextLine(); // Consommer la ligne vide après la saisie du prix minimum

        System.out.print("Veuillez saisir le prix maximum : ");
        double prixMax = scanner.nextDouble();
        scanner.nextLine(); // Consommer la ligne vide après la saisie du prix maximum

        List<Article> articlesTrouves = new ArrayList<>();
        for (Article article : stock) {
            double prixVente = article.getPrixVente();
            if (prixVente >= prixMin && prixVente <= prixMax) {
                articlesTrouves.add(article);
            }
        }

        if (!articlesTrouves.isEmpty()) {
            System.out.println("Articles trouvés dans l'intervalle de prix [ " + prixMin + " - " + prixMax + " ] : ");
            for (Article article : articlesTrouves) {
                System.out.println(article);
            }
        } else {
            System.out.println("Aucun article trouvé dans l'intervalle de prix [ " + prixMin + " - " + prixMax + " ]");
        }
    }

    private void afficherTousLesArticles() {
        System.out.println("===== Stock =====");
        for (Article article : stock) {
            System.out.println(article);
        }
    }
}
