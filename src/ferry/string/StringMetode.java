package ferry.string;

import java.util.Scanner;

public class StringMetode {

    public static void enregistrementClient(Scanner sc){
        System.out.println("\n\t Entrez votre prenom:");
        String prenom = sc.nextLine();

        System.out.println("\n\t Entrez votre nom:" );
        String nom = sc.nextLine();

        String nomComplet = prenom.concat(nom);

        String nomConcatene = prenom.concat("").concat(nom);

        System.out.println("\n\t Nom Complet: " +nomConcatene);
        System.out.println("\n\t Index du caractere : " +nomConcatene.indexOf("O"));
        System.out.println("\n\t Contient : " +nomConcatene.contains("And"));



    //    System.out.println("\n\t Entrez votre numero de tel :");
     //   int tel = sc.nextInt();

        System.out.println("\n\t Entrez votre email: ");
        String email = sc.nextLine();



        System.out.println("\n\t Informations Client ");
        System.out.println("\t Clent : [");
        System.out.println("\t\t { nom : "+nomConcatene + ",");
       // System.out.println("\t\t tel :");
        System.out.println("\t\t email : " +email.toLowerCase() + "\n\t\t }\n\t ]");


        System.out.println("\n\t longueur nom est : ");

    }
}
