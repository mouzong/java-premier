package andreas.projetfinal;

import andreas.projetfinal.entite.Client;
import andreas.projetfinal.entite.Produit;
import andreas.projetfinal.outils.BoiteAOutils;
import andreas.projetfinal.outils.Menu;

public class Main {
    public static void main(String[] args) {
//        Menu.afficherEnteteDeMenu();
//
//        int choixDeMenu = Menu.menuPrincipal();
//
//        int choix2 = BoiteAOutils.controleMenu(choixDeMenu, 1, 5);
//
//        switch (choix2) {
//            case 1 -> Menu.menuAcceuil();
//            case 2 -> Menu.menuNoProduits();
//            case 3 -> Menu.menuNousContacter();
//            case 4 -> Menu.menuApropos();
//            case 5 -> Menu.menuAdministration();


//        }

        Client cl1 = new Client();
        Client cl2 = new Client();

        Produit p1 = new Produit();

        System.out.println(cl1.equals(p1));
        System.out.println(cl1.hashCode());
        System.out.println(cl2.hashCode());

        cl2.setEmail("andreas@adacorp.com");

        System.out.println(cl2.hashCode());
        System.out.println(cl1.equals(cl2));


        System.out.println("\n\t Client CL1 : " + cl1);
        System.out.println("\n\t Client CL2 : " + cl2);
    }
}
