package andreas.projetfinal;

import andreas.projetfinal.outils.BoiteAOutils;
import andreas.projetfinal.outils.Menu;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choixDeMenu = Menu.menuPrincipal();

        int choix2 = BoiteAOutils.controleMenu(choixDeMenu, 1, 5);

        switch (choix2) {
            case 1 -> Menu.menuAcceuil();
            case 2 -> Menu.menuNoProduits();
            case 3 -> Menu.menuNousContacter();
            case 4 -> Menu.menuApropos();
            case 5 -> Menu.menuAdministration();
        }
    }
}
