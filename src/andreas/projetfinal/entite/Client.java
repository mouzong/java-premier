package andreas.projetfinal.entite;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    public static int nombreDeClients = 0;
    private String nomClient;
    private String prenomClient;
    private String email;
    private String telephone;
    private LocalDate dateDeNaissance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nomClient, client.nomClient) && Objects.equals(prenomClient, client.prenomClient) && Objects.equals(email, client.email) && Objects.equals(telephone, client.telephone) && Objects.equals(dateDeNaissance, client.dateDeNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomClient, prenomClient, email, telephone, dateDeNaissance);
    }

    @Override
    public String toString() {
        return "Client { \n" +
                "\t\t nomClient = '" + nomClient + '\'' +
                ", \n\t\t prenomClient = '" + prenomClient + '\'' +
                ", \n\t\t email = '" + email + '\'' +
                ", \n\t\t telephone = '" + telephone + '\'' +
                ", \n\t\t dateDeNaissance = " + dateDeNaissance +
                "\n\t }";
    }

    public static int getNombreDeClients() {
        return nombreDeClients;
    }

    public static void setNombreDeClients(int nombreDeClients) {
        Client.nombreDeClients = nombreDeClients;
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

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}
