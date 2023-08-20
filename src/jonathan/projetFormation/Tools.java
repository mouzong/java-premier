package jonathan.projetFormation;

import andreas.projetfinal.Menu;

public class Tools {
    public static int controleMenu(int choix, int nbrinf, int nbrsup){

        int choixDeRetour = choix;

        while(choixDeRetour < nbrinf || choixDeRetour > nbrsup){
            MenuPrincipal.messageErreurChoixDeMenu();
            choixDeRetour = MenuPrincipal.menuPrincipal();
        }
        return choixDeRetour;
    }

    public static int controleMenuProduit(int choix, int inf, int sup){

        int choixDeRetour = choix;

        while(choixDeRetour < inf || choixDeRetour > sup){
            Menu.messageErreurChoixDeMenu();
            choixDeRetour = MenuPrincipal.NosProduits();
        }

        return choixDeRetour;
    }
}
