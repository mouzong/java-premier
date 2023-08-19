package andreas.projetfinal;

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
        System.out.print("\n\t \uD83D\uDE00 Votre choix : ");

        return scanner.nextInt();
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
}
