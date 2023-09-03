<<<<<<<< HEAD:src/andreas/projetfinal/outils/Menu.java
package andreas.projetfinal.outils;

========
package jonathan.projetFormation.Tools;
>>>>>>>> 231e266f34cf188036194261fe4f819c8907b959:src/jonathan/projetFormation/Tools/MenuPrincipal.java
import java.util.Scanner;

public class Menu {
    /**
     * Cette methode affiche le menu principal de notre application
     * @return Le choix de menu fait par l'utilisateur
     */
    public static int menuPrincipal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\t 1️⃣ - Accueil");
        System.out.println("\t 2️⃣ - Nos Produits");
        System.out.println("\t 3️⃣ - Nous contacter");
        System.out.println("\t 4️⃣ - A propos");
        System.out.println("\t  5\uFE0F⃣  - Admin ");
        System.out.print("\n\t \uD83D\uDE00 Votre choix : ");

        return scanner.nextInt();
    }

    /**
     *   Cette methode affiche la page à propos de notre application
     */
    public static void menuApropos(){
        System.out.println("""
                \n\t Situé dans le centre de la ville de Yaoundé,
                \t nous somme une agence de location de biens immobiliers.
                \t Nous faisons dasn la location saisonniere et à l'année.
             
                \t Ouvert depuis 1978 nous avons a notre actif des partenaire
                \t de qualité qui vous offrent des espaces de choix en fonctionde votre budget 
                """);
    }
    /**
     * Cette methode affiche l'entete de notre menu de programme
     */

    public static void afficherEnteteDeMenu(){
        System.out.println("\t ==================================================================");
        System.out.println("\t :::::::::::: Application de Gestion d'agence Immobiliere :::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t :::::::::::::::::::::::::::    MENU   ::::::::::::::::::::::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t ==================================================================\n");
        System.out.println("\t Entrez un nombre correspondant au menu de votre choix !");
    }

    /**
     * Cette methode affiche un message d'erreur
     * lorsque l'utilisateur fait une erreure
     * dans le choix de son menu
     */
    public static void messageErreurChoixDeMenu() {
        System.out.println("\n\t ❌ Erreur de choix : Vueillez entrer un nombre compris entre 1 et 4 !\n");
    }

    public static void menuAcceuil() {
        System.out.println("\n\t Bienvenue a l'accueil de notre projet");
    }

    public static int menuNoProduits(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t 1 - Appartements meublés / vide");
        System.out.println("\t 2 - Studio meublés / vide");
        System.out.println("\t 3 - Chambres meublés / vide");
        System.out.println("\t 4 - Salles de fêtes");
        System.out.println("\t 5 - Menu Précédent");
        System.out.println("\t 0 - Quitter l'application");
        System.out.print("\n\t Votre choix : ");

        return scanner.nextInt();
    }


    public static void menuNousContacter(){
        System.out.println("\n\t Menu nous contacter");
    }

    public static int menuAdministration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t 1 - Gestion des clients");
        System.out.println("\t 2 - Gestions des produits");
        System.out.println("\t 3 - Gestion des commandes");
        System.out.println("\t 4 - Gestion des factures");
        System.out.println("\t 5 - Retour à l'Accueil");
        System.out.println("\t 0 - Quitter l'application");
        System.out.print("\n\t Votre choix : ");

        return scanner.nextInt();

    }
}
