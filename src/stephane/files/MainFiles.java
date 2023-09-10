package stephane.files;

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
//        User utilisateur1 = new User(
//                "Sylvain FOTSO",
//                "+237 (6) XX XX XX XX",
//                "sylvain.fotso@adacorp.com",
//                LocalDate.of(1993,5,2)
//        );

        Scanner sc = new Scanner(System.in);

        // Creation du fichier
        File fichier = createFile("src/stephane/files/bd-users.txt");

        // Demande du nombre de uses a enregister par l'admin
        System.out.print("\n\t Combien de users voulez-vous enregistrer? : ");
        int nombredeUser = sc.nextInt();
        sc.nextLine();
        // creation du tableau qui va contenir les users a sauvegarder dans la bd-users.txt
        UserYot[] users = new UserYot[nombredeUser];


        // remplissage du tableau des users
        for (int i = 0; i < nombredeUser; i++){
            users[i] = createUser(sc);
        }

        for(UserYot utilisateur : users){
            ecrireDansFichier(fichier, utilisateur);
        }


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

    private static void ecrireDansFichier(File fichier, UserYot utilisateurAEnregistrer) throws IOException {
        // Ecriture dans le fichier
        FileWriter stylo = null;
        try {
            stylo = new FileWriter(fichier, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter user = new PrintWriter(stylo);

//        System.out.print("\n\t Entrez une phrase a ecrire dans le fichier : ");
//        String phrase = scConsole.nextLine();


        user.println("\n\t " + utilisateurAEnregistrer);

        // Vidange de la memoire
        user.flush();
        user.close();
    }

    private static UserYot createUser(Scanner sc){
        UserYot user = new UserYot();

        System.out.print("\n\t Entrez votre nom complet: ");
        user.setNomComplet(sc.nextLine());
        System.out.print("\n\t Entrez votre Email: ");
        user.setMail(sc.nextLine());
        System.out.print("\n\t Entrez votre Telephone: ");
        user.setTelephone(sc.nextLine());

        System.out.print("\n\t Entrez votre date de naissance (aaaa/mm/jj): ");
        String[] date = sc.nextLine().split("/");

        user.setDateDeNaissance(LocalDate.of(
                Integer.parseInt(date[0]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[2]))
        );

        return user;
    }
}
