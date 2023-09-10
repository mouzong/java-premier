package andreas.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) throws IOException {
/**
 * Modifier le programme actuel pour qu'il prenne en compte le nombre d'utilisateur
 * a enregistrer dans le system via la console:
 * - 1 : Demander a l'admin le nombre de user a enreghistrer
 * - 2 : pour chaque user stocker ses informations dans la bd-user.txt
 *
 *
 * PS:
 * - creer une methode pour enregistrer les users -> ok
 * - appeler la methode dans un boucle autant de fois que l'admin le souhaite
 * - creer un tableau de cette taille -> ok
 * - stocker les utilisateurs dans ce tableau -> ok
 * - enregistrez les user dans la BD
 *
 */
        File fichier = createFile("src/andreas/files/bd-users.txt");
        Scanner sc = new Scanner(System.in);
        Scanner scSurFichier = new Scanner(fichier);

        // Creation du fichier


        switch (menu(sc)) {
            case 1:
                addOneUser(fichier, sc);
                break;
            case 2:
                addManyUsers(fichier, sc);
                break;
            case 3:
                showUsers(scSurFichier);
                break;
            case 0:
                exitProgram();
                break;
            default:
                System.out.println("\n\t Erreur. Mauvais choix de menu !!! ");
        }

    }

    public static  void addManyUsers(File fichier, Scanner sc) throws IOException {
        // Demande du nombre de uses a enregister par l'admin
        System.out.println("\n\t Combien de users voulez-vous enregistrer? : ");
        int nombredeUser = sc.nextInt();

        // creation du tableau qui va contenir les users a sauvegarder dans la bd-users.txt
        User[] users = new User[nombredeUser];


        // remplissage du tableau des users
        for (int i = 0; i < nombredeUser; i++){
            users[i] = createUser(sc);
        }

        for(User utilisateur : users){
            try {
                ecrireDansFichier(fichier, utilisateur);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void exitProgram(){
        System.out.println("\n\t Merci pour votre visite à bientôt sur notre plateforme !!! ");
    }

    public static void showUsers(Scanner sc){
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
    public static void addOneUser(File fichier, Scanner sc) throws IOException {
        User user = createUser(sc);
        ecrireDansFichier(fichier, user);
    }
    private static File createFile(String chemin){
        File fichier = new File(chemin);
        try{
            if(!fichier.exists()){
                try {
                    fichier.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return fichier;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return fichier;
    }

    private static void ecrireDansFichier(File fichier, User utilisateurAEnregistrer) throws IOException {
        // Ecriture dans le fichier
        FileWriter stylo = null;
        try {
            stylo = new FileWriter(fichier, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter user = new PrintWriter(stylo);

        user.println("\n\t " + utilisateurAEnregistrer);

        // Vidange de la memoire
        user.flush();
        user.close();
    }

    private static User createUser(Scanner sc){
        User user = new User();

        System.out.print("\n\t Entrez votre nom complet: ");
        user.setNomComplet(sc.nextLine());



        return user;
    }

    private static int menu(Scanner sc){
        int choix = 0;

        System.out.println("\n\t :::::::: MENU ::::::: ");
        System.out.println("\n\t 1 - Ajouter un utilisateur ");
        System.out.println("\t 2 - Ajouter plusieurs utilisateurs ");
        System.out.println("\t 3 - Afficher les utilisateurs ");
        System.out.println("\t 0 - Sortir ");

        System.out.print("\n\t Entrez votre choixde menu : ");
        choix = sc.nextInt();

        sc.nextLine();

        return choix;
    }
}
