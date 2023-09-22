package stephane.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFilesTest {
    public static void main(String[] args) throws IOException {

        Scanner scConsole = new Scanner(System.in);
        // Creation du fichier
        File fichier = createFile("src/stephane/files/fichierStep.txt");

        // Ecriture dans le Fichier
        FileWriter stylo = new FileWriter(fichier);
        PrintWriter user = new PrintWriter(stylo);

        System.out.print("Entrez votre nom complet :");
        String nomComplet = scConsole.nextLine();
        user.println("\n\t\t Bonjour le monde de la programmation JAVA avec le Big Boss Andreas "+
                nomComplet);

        //vidage de la memoire
        user.flush();
        user.close();
    }

    private static File createFile(String chemin) throws IOException{
        File fichier = new File(chemin);

            if (!fichier.exists()){
                try {
                    fichier.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else System.out.println("Le fichier existe deja ");
            return fichier;
        }
        //return fichier;

        }


