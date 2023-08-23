package andreas.projetfinal.services;

import andreas.projetfinal.entite.Client;

import java.util.Scanner;

public class ClientService {

    public static Client enregistrerClient(
            String nomClient,
            String prenomClient,
            String emailClient,
            String adresseClient,
            String telephoneClient){

        Client client = new Client();

        client.setNomClient(nomClient);
        client.setPrenomClient(prenomClient);
        client.setEmail(emailClient);
        client.setAdresse(adresseClient);
        client.setTelephone(telephoneClient);

        return client;
    }

    public static Client createClient(){
        Scanner sc = new Scanner(System.in);

        Client client = new Client();

        System.out.print("\n\t Entrer le nom du client : ");
        String nom = sc.nextLine();

        client.setNomClient(nom);

        return client;
    }

    public static Client modifierClient(
            Client client,
            String nomClient,
            String prenomClient,
            String emailClient,
            String adresseClient,
            String telephoneClient){

        Client clientModifie = client;

        if (nomClient != null){
            clientModifie.setNomClient(nomClient);
        }
        if (prenomClient != null){
            clientModifie.setPrenomClient(prenomClient);
        }
        if (emailClient != null){
            clientModifie.setEmail(emailClient);
        }
        if(adresseClient != null){
            clientModifie.setAdresse(adresseClient);
        }

        if(telephoneClient != null){
            clientModifie.setTelephone(telephoneClient);
        }

        return clientModifie;
    }
}
