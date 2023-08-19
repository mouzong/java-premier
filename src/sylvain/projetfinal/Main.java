package sylvain.projetfinal;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choix = Menu.menuPrincipal();

        while(choix < 1 || choix > 4){
            Menu.messageErreurChoixDeMenu();
            choix = Menu.menuPrincipal();
        }

        switch (choix) {
            case 4:
                sylvain.projetfinal.Menu.menuApropos();
                break;

            case 2:
                sylvain.projetfinal.Menu.menuNosProduits();
                break;

            case 1:
                sylvain.projetfinal.Menu.menuAccueil();
                break;

            case 3:
                sylvain.projetfinal.Menu.menuNousContacter();
                break;
        }
    }
}
