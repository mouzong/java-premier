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
 * - creer une methode pour enregistrer les users
 * - appeler la methode dans un boucle autant de fois que l'admin le souhaite
 *
 */
        User utilisateur1 = new User(
                "Sylvain FOTSO",
                "+237 (6) XX XX XX XX",
                "sylvain.fotso@adacorp.com",
                LocalDate.of(1993,5,2)
        );

        // Scanner scConsole = new Scanner(System.in);
        // Creation du fichier
        File fichier = createFile("src/andreas/files/bd-users.txt");
//fichier.renameTo();
        ecrireDansFichier(fichier, utilisateur1);

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

//        System.out.print("\n\t Entrez une phrase a ecrire dans le fichier : ");
//        String phrase = scConsole.nextLine();


        user.println("\n\t " + utilisateurAEnregistrer);

        // Vidange de la memoire
        user.flush();
        user.close();
    }
}
