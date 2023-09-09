package ferry.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) throws IOException{
        Scanner scConsole = new Scanner(System.in);
        File fichier = new File("src/ferry/files/projet.text");
        if(!fichier.exists()){
            try{
                fichier.createNewFile();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }

        FileWriter stylo = new FileWriter(fichier);
        PrintWriter user = new PrintWriter(stylo);

        System.out.print("\n\t Entrez votre nom complet");
        String nomComplet = scConsole.nextLine();


    }

}
