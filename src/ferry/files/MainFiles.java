package ferry.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) throws IOException{
        Scanner scConsole = new Scanner(System.in);
        File fichier = createFile("src/ferry/files/projet.txt");

        ecrireDansFichier(fichier, scConsole);
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

    private static void ecrireDansFichier(File fichier, Scanner scConsole) throws IOException {

        FileWriter stylo = null;
        try {
            stylo = new FileWriter(fichier, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter user = new PrintWriter(stylo);

        System.out.print("\n\t Entrez votre nom complet");
        String nomComplet = scConsole.nextLine();

        user.println("\n\t Bonjour bienvenue dans mon premier fichier Mme / Mr :" +nomComplet);

        user.flush();
        user.close();

    }
}
