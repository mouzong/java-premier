package andreas.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) throws IOException {

        Scanner scConsole = new Scanner(System.in);
        // Creation du fichier
        File fichier = createFile("src/andreas/files/fichier.txt");

        // Ecriture dans le fichier
        FileWriter stylo = new FileWriter(fichier);
        PrintWriter user = new PrintWriter(stylo);

        System.out.print("\n\t Entrez votre nom complet");
        String nomComplet = scConsole.nextLine();


        user.println("\n\t Bonjour et bienvenue dans mon premier fichier M./Mme : !!!" + nomComplet);

        // Vidange de la memoire
        user.flush();
        user.close();


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

    private static void ecrireDansFichier(){

    }
}
