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

        // Enregistrer un client avec ses details:
        /**
         * - nom et prenom
         * - date de naissance
         * - mail
         * - telephone
         * - date d'entrée previsionnelle
         * - date de sortie
         * - Afficher les informationssur le client actuel sous la forme
         *
         * Clients : [
         *  {
         *      "nom" : "Andreas .....",
         *      "dateDeNaissance" : "03 septembre 2023",
         *      " mail" : "andreas@adacorp.com",
         *      "telephone" : "0707070707",
         *      "dateEntree" : "2023-09-03"
         *  }
         *
         * ]
         */


    }

}
