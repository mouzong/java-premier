package jonathan.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainFile {
    public static void main(String[] args) throws IOException {

        File doc =createFile("src/jonathan/file/memoire.txt");
        writedocument(doc);


        //Creation du fichier
        //File fichier = new File("src/jonathan/file/jonathan.txt");
        /*if(!fichier.exists()){
            try {
                fichier.createNewFile();
            }catch (IOException e){
                throw new RuntimeException();
            }
        }*/

        //Ecriture dans le ficfier
       /* FileWriter stylo = new FileWriter(fichier);
        PrintWriter happy = new PrintWriter(stylo);

        happy.println("`\n\t Happy vient d'ecrire : Bonjour ma première ecriture !!!");
        happy.flush();
        happy.close();*/

    }

    private static File createFile(String chemin){
        File fichier = new File(chemin);
        try {
               if(!fichier.exists()) {
                   try {
                       fichier.createNewFile();
                   } catch (IOException e) {
                       throw new RuntimeException();
                   }
               }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return fichier;
    }

    private static void writedocument(File document) throws IOException {
        FileWriter stylo = new FileWriter (document);
        PrintWriter happy = new PrintWriter(stylo);
        happy.println("`\n\t Happy vient d'ecrire : mon premier memoire !!!");
        happy.flush();
        happy.close();

    }
}
