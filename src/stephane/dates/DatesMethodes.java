package stephane.dates;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DatesMethodes {
    public static void createCustumer( Scanner sc){
        System.out.println("\n\t********* ENREGISTREMENT DES CLIENTS **************");
        System.out.println("\n\t Entrez votre Nom");
        String nom = sc.nextLine();

        System.out.println("\n\t Entrez votre Prénom");
        String prenom = sc.nextLine();

        System.out.println("\n\t Entrez votre date de naissance (annee/mois/jour)");
        String date = sc.nextLine();

        String[] tab = date.split("/");

        int annee = parseInt(tab[0]) , mois = parseInt(tab[1]), jour = parseInt(tab[2]);

        LocalDate dateNais = LocalDate.of(annee, mois, jour);

        System.out.println(dateNais);



//        for (int i = 0 ; i <= 3; i++ ){
//            annee += date.charAt(i);
//        }
//        mois += date.charAt(5);
//        mois += date.charAt(6);
//
//        jour += date.charAt(8);
//        jour += date.charAt(9);
//
//        LocalDate dateNais = LocalDate.of(annee, mois, jour);






//        String date = sc.nextLine();
//
//        System.out.println("\n\t Entrez votre mois de naissance ");
//        String mois = sc.nextLine();
//
//        System.out.println("\n\t Entrez votre jour de naissance ");
//        String jour = sc.nextLine();
//
//        System.out.println("\n\t Entrez votre adresse mail ");
//        String email = sc.nextLine();
//
//        System.out.println("\n\t Entrez votre numéro de telephone ");
//        String tel = sc.nextLine();
//
//        System.out.println("\n\t Entrez la date d'entrée prévisionnelle ");
//        String dateEntree = sc.nextLine();
//
//        System.out.println("\n\t Entrez la date de sortie ");
//        String dateSortie = sc.nextLine();
//

    }
}
