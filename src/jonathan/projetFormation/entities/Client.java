package jonathan.projetFormation.entities;

import java.util.Objects;

public class Client {
    public static int nombreDeClients = 0;
    private String nomClient;
    private String prenomClient;
    private String adresse;
    private String email;
    private String telephone;

    public Client(){
        nombreDeClients++;
    }
    public Client(String nomClient,String prenomClient, String adresse, String email, String telephone){
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        nombreDeClients++;
    }

    public Client(String nomClient, String prenomClient) {
        nombreDeClients++;

        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nomClient, client.nomClient) && Objects.equals(prenomClient, client.prenomClient) && Objects.equals(adresse, client.adresse) && Objects.equals(email, client.email) && Objects.equals(telephone, client.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomClient, prenomClient, adresse, email, telephone);
    }
}
