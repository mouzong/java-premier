package stephane.projetfinal.entite;

public class Client {

    public static int nombreDeClients = 0;

    private String nomClient;
    private String prenomClient;
    private String adresse;
    private String email;
    private String telephone;
    public  Client() { nombreDeClients++; }
    public Client(String nomClient, String prenomClient, String adresse, String email, String telephone){
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        nombreDeClients++;
    }
    public Client(String nomClient, String prenomClient){
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        nombreDeClients++;
    }

    public String getNomClient(){ return this.nomClient;}
    public void setNomClient(String nomClient){ this.nomClient = nomClient;}
    public String getPrenomClient(){ return this.prenomClient;}
    public void setPrenomClient(String prenomClient){ this.prenomClient = prenomClient;}
    public String getAdresse(){ return this.adresse;}
    public void setAdresse(String adresse){ this.adresse = adresse;}
    public String getEmail(){ return this.email;}
    public void setEmail(String email){ this.email = email;}
    public String getTelephone(){ return this.telephone;}
    public void setTelephone(String telephone){ this.telephone = telephone;}
   @Override
    public String toString() {
        return "Client{" +
                "\nnomClient='" + nomClient + '\'' +
                ", \nprenomClient='" + prenomClient + '\'' +
                ", \nadresse='" + adresse + '\'' +
                ", \nemail='" + email + '\'' +
                ", \ntelephone='" + telephone + '\'' +
                '}';
    }

}
