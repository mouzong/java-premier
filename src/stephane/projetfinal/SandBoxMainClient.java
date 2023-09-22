package stephane.projetfinal;

import stephane.projetfinal.entite.Client;

public class SandBoxMainClient {
    public static void main(String[] args) {
        Client c0 = new Client("EBAH", "Michel");
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client("YOTEDJE" ,
                "Stephane", "Yaounde",
                "merlinstephane9@gmail.com", "699335913");
        System.out.println("Nombre total de client = "+ Client.nombreDeClients);
        System.out.println("Client 0 avant modification : "+ c0);
        System.out.println("Client 1 avant modification : "+ c1);
        System.out.println("Client 2 avant modification : "+ c2);
        System.out.println("Client 3 avant modification : "+ c3);

        c0.setTelephone("699338877");
        c0.setAdresse("TORONTO");
        c1.setNomClient("KAMNANG");
        c1.setPrenomClient("Brad");
        c1.setAdresse("MONTREAL");
        c2.setNomClient("YANDANG");
        c2.setPrenomClient("ANGE");

        System.out.println("Client 0 apres modification : "+ c0);
        System.out.println("Client 1 apres modification : "+ c1);
        System.out.println("Client 2 apres modification : "+ c2);
        System.out.println("Client 3 apres modification : "+ c3);

    }
}
