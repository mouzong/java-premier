package andreas.projetfinal;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choixDeMenu = Menu.menuPrincipal();

        while(choixDeMenu < 1 || choixDeMenu > 4){
            Menu.messageErreurChoixDeMenu();
            choixDeMenu = Menu.menuPrincipal();
        }

        switch (choixDeMenu) {
            case 1 -> Menu.menuAcceuil();
            case 2 -> Menu.menuNoProduits();
            case 3 -> Menu.menuNousContacter();
            case 4 -> Menu.menuApropos();
        }
    }
}
