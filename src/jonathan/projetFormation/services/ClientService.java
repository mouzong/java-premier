package jonathan.projetFormation.services;

import jonathan.projetFormation.entities.Client;

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
}
