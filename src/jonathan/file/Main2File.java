package jonathan.file;

import andreas.files.User;

import java.io.File;
import java.time.LocalDate;

public class Main2File {

    User utilisateur1 = new User(
            "Sylvain FOTSO",
            "+237 (6) XX XX XX XX",
            "sylvain.fotso@adacorp.com",
            LocalDate.of(1993,5,2)
    );
    File fichier = Recoder.createFile("src/jonathan/file/bd-users.txt");
    //fichier.ecrireFichier(fichier, utilisateur1);
}
