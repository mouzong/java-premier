package andreas.projetfinal;

import andreas.projetfinal.entite.Client;

public class SandBoxMainClient {
    public static void main(String[] args) {
        Client c0 = new Client("ETOUA","Nicaise");
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client(
                "FOTSO",
                "Sylvain",
                "Douala",
                "sylvain@gmail.com",
                "+237 6 989 898 98");

        System.out.println("Nombre total de clients = " + Client.nombreDeClients);
        System.out.println("Client 0 avant modification : " + c0);
        System.out.println("Client 1 avant modification : " + c1);
        System.out.println("Client 2 avant modification : " + c2);
        System.out.println("Client 3 avant modification : " + c3);

        c0.setNomClient("EVINA");
        c0.setAdresse("Douala");
        c1.setNomClient("Ferry");
        c2.setNomClient("Manu");
        c2.setAdresse("Yaounde");
        c3.setNomClient("NANA");

        System.out.println("Client 0 apres modification : " + c0);
        System.out.println("Client 1 apres modification : " + c1);
        System.out.println("Client 2 apres modification : " + c2);
        System.out.println("Client 3 apres modification : " + c3);
    }
}
