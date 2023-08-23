package jonathan.projetFormation.Tools;
import java.util.Scanner;

public class MenuPrincipal {

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
     * Cette methode affiche le menu principal de notre application
     * @return Le choix de menu fait par l'utilisateur
     */
    public static int menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t 1️⃣ - Accueil");
        System.out.println("\t 2️⃣ - Nos Produits");
        System.out.println("\t 3️⃣ - Nous contacter");
        System.out.println("\t 4️⃣ - A propos");
        System.out.println("\t  0 - Quitter l'application");
        System.out.print("\n\t \uD83D\uDE00 Votre choix : ");
        int choix = scanner.nextInt();
        return choix;
    }

    /**
     *   Cette methode affiche la page à Accueil de notre application
     */
    public static int Quitter(){
        System.out.println("bye bye Programme Terminé !!!!!!!!!!!!!!");
        return -1;
    }
    public static void Accueil(){
        System.out.println("\n\t Bienvenue a l'accueil de notre projet");
    }

    /**
     *   Cette methode affiche la page à Nos Produits de notre application
     */
    public static int NosProduits(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t 1 - Appartements meublés / vide");
        System.out.println("\t 2 - Studio meublés / vide");
        System.out.println("\t 3 - Chambres meublés / vide");
        System.out.println("\t 4 - Salles de fêtes");
        System.out.println("\t 5 - Menu Précédent");
        System.out.println("\t 6 - Retour a la page précedente");
        System.out.println("\t 0 - Quitter l'application");
        System.out.print("\n\t Votre choix : ");
        return scanner.nextInt();
    }

    /**
     *   Cette methode affiche la page à Nous contacter de notre application
     */
    public static void Nouscontacter(){
        System.out.println("Nouscontacter");
    }

    /**
     *   Cette methode affiche la page à propos de notre application
     */
    public static void Apropos(){
        System.out.println("""
                \n\t Situé dans le centre de la ville de Yaoundé,
                \t nous somme une agence de location de biens immobiliers.
                \t Nous faisons dasn la location saisonniere et à l'année.
             
                \t Ouvert depuis 1978 nous avons a notre actif des partenaire
                \t de qualité qui vous offrent des espaces de choix en fonctionde votre budget 
                """);
    }

    /**
     * Cette methode affiche un message d'erreur lorsque l'utilisateur fait une erreure dans le choix de son menu
     */
    public static void messageErreurChoixDeMenu() {
        System.out.println("\n\t ❌ Erreur de choix : Vueillez entrer un nombre compris entre 0 et 4 !\n");
    }

}