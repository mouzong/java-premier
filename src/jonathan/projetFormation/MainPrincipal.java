package jonathan.projetFormation;

import jonathan.projetFormation.Tools.MenuPrincipal;
import jonathan.projetFormation.Tools.Tools;
import jonathan.projetFormation.services.ClientService;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {

        /*ClientService.createClient();

        //Affichage de l'entête du Menu
        MenuPrincipal.afficherEnteteDeMenu();



        //Choix du menue Principal
        int choixDeMenu = MenuPrincipal.menuPrincipal();
        //Methode Controle de la valeur
        int choix2 = Tools.controleMenu(choixDeMenu, 0, 4);
        int choixMenuProduit=0;

        switch (choix2) {
            case 0:
                MenuPrincipal.Quitter();
                break;
            case 1:
                MenuPrincipal.Accueil();
                break;
            case 2:
                choixMenuProduit =MenuPrincipal.NosProduits();
                break;
            case 3:
                MenuPrincipal.Nouscontacter();
                break;
            case 4:
                MenuPrincipal.Apropos();
                break;
        }

        //Choix du menue Produit
       // int choixMenuProduit = MenuPrincipal.NosProduits();
        int choixProduit = Tools.controleMenuProduit(choixMenuProduit, 0, 6);

        switch (choixProduit) {
            case 0 -> MenuPrincipal.Quitter();
            case 6 -> MenuPrincipal.menuPrincipal();
        }*/
        Scanner monScanner = new Scanner(System.in);
        ClientService.createcustomer(monScanner);

    }
}
