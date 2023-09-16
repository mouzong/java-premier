package jonathan.file;

import andreas.files.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Recoder {

    //Methode de creation de fichier
    public static File createFile(String chemin){
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

    //Methode d 'enregistrement du fichier
    public static void ecrireFichier(File fichier, User utilisateurAEnregistrer) throws IOException {
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
