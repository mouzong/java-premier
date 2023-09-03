package andreas.strings;

import java.util.Scanner;

public class StringMethode {
    public static void enregistrerClient(Scanner sc){
        System.out.print("\n\t Entrez votre prenom: ");
        String prenom = sc.nextLine();

        System.out.print("\t Entrez votre nom: ");
        String nom = sc.nextLine();

//        String nomComplet = prenom.concat(nom);
        String nomComplet = prenom +" "+ nom;

        String nomConcatene = prenom.concat(" ").concat(nom);

        System.out.println("\n\t nom complet: " + nomConcatene);
        System.out.println("\n\tIndex du caractere : "+ nomConcatene.indexOf("O"));
        System.out.println("\n\tContient  : "+ nomConcatene.contains("And"));

        System.out.print("\t Entrez votre email: ");
        String email = sc.nextLine();

        System.out.println("\n\t Informations Client");
        System.out.println("\t Clients: [ ");
        System.out.println("\t\t{ nom : "+ nomConcatene + ",");
        System.out.println("\t\t email : "+ email.toLowerCase() +" \n\t\t }\n\t ]");


        System.out.println("\n\t Longueur Nom: ");

    }

}
