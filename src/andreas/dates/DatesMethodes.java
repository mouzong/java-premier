package andreas.dates;

import java.time.LocalDate;
import java.util.Scanner;

public class DatesMethodes {
    public static  void createCustomer(Scanner sc){

        System.out.print("\n\t Annee de naissance : ");
        int annee = sc.nextInt();

        System.out.print("\n\t Mois de naissance : ");
        int mois = sc.nextInt();

        System.out.print("\n\t Jour de naissance : ");
        int jour = sc.nextInt();

        LocalDate dateNaissance = LocalDate.of(annee,mois,jour);

        System.out.println("\n\t Vous etes nee le : "+ dateNaissance);


    }

}
