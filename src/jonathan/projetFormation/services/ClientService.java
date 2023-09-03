package jonathan.projetFormation.services;

import jonathan.projetFormation.entities.Client;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientService {
    public static Client enregistrerClient(String nomClient, String prenomClient, String emailClient, String adresseClient, String telephoneClient){
        Client client =new Client();
        client.setNomClient(nomClient);
        client.setPrenomClient(prenomClient);
        client.setEmail(emailClient);
        client.setAdresse(adresseClient);
        client.setTelephone(telephoneClient);
        return client;
    }

    public static Client createClient(){
        Scanner sc =new Scanner(System.in);
        Client monClient = new Client();

        System.out.print("\n\t Entrer le nom du client : ");
        String nom = sc.nextLine();
        monClient.setNomClient(nom);

        System.out.print("\n\t Entrer le prenom du client : ");
        String prenom = sc.nextLine();
        monClient.setNomClient(prenom);

        System.out.print("\n\t Entrer le email du client : ");
        String email = sc.nextLine();
        monClient.setNomClient(email);

        System.out.print("\n\t Entrer le adresse du client : ");
        String adresse = sc.nextLine();
        monClient.setNomClient(adresse);

        System.out.print("\n\t Entrer le telephone du client : ");
        String telephone = sc.nextLine();
        monClient.setNomClient(telephone);

        return monClient;
    }
    public static void createcustomer(Scanner sc){
        // Enregistrer un client avec ses details:

        System.out.print("\t Entrée votre Nom et Prenom : ");
        String nom = sc.nextLine();

        System.out.print("\t Entrée votre Annee de naissance : ");
        int annee = sc.nextInt();
        System.out.print("\t Entrée votre Mois de naissance : ");
        int mois = sc.nextInt();
        System.out.print("\t Entrée votre Jour de naissance : ");
        int jour = sc.nextInt();
        LocalDate dateNaissance = LocalDate.of(annee,mois,jour);
        //LocalDate dateNaissance = LocalDate.of(jour,mois,annee);
        sc.nextLine();
        System.out.print("\t Entrée votre Adresse Mail : ");
        String mail = sc.nextLine();

        System.out.print("\t Entrée votre numero de telephone : ");
        int tel = sc.nextInt();

        System.out.print("\t Entrée votre Annee d'entrée : ");
        int annee2 = sc.nextInt();
        System.out.print("\t Entrée votre Mois d'entrée : ");
        int mois2 = sc.nextInt();
        System.out.print("\t Entrée votre Jour d'entrée : ");
        int jour2 = sc.nextInt();
        LocalDate dateEntree = LocalDate.of(annee2,mois2,jour2);

        System.out.println("Affichage des informations sur le client");

        System.out.println("Clients : [\n{");
        System.out.println(
                "\t nom :"+nom+
                "\n\t dateDeNaissance : "+dateNaissance.getDayOfMonth()+" "+dateNaissance.getMonth()+" "+dateNaissance.getYear()+
                "\n\t mail : " +mail+
                "\n\t telephone : " +tel+
                "\n\t dateEntree : " +dateEntree+
        "\n}\n]");
    }
}
