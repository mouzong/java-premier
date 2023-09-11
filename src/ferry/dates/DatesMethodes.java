package ferry.dates;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DatesMethodes {
    public static void createCustumer(Scanner sc){
        System.out.println("\n\t ******* ENREGISTREMENT CLIENTS *******");
        System.out.println("\n\t BIEN VOULOIR ENTRER VOTRE NOM : ");
        String nom = sc.nextLine();

        System.out.println("\n\t VOTRE PRENOM");
        String prenom = sc.nextLine();
        System.out.println("\n\t VOTRE DATE DE NAISSANCE (année/mois/jour)");
        String date = sc.nextLine();
        System.out.println("\n\t Vous etes né le " +date + ".");
        String message = "Bienvenu chez nous et passez un agreable séjour";
        System.out.println("\n\t Bonjour Mr/Mme :"  + message);

        String[] tab = date.split("/");
        int annee = parseInt(tab[0]), mois = parseInt(tab[1]), jour = parseInt(tab[2]);

        LocalDate dateNais = LocalDate.of(annee, mois, jour);



    }
}
