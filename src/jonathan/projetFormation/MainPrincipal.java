package jonathan.projetFormation;

public class MainPrincipal {
    public static void main(String[] args) {
        MenuPrincipal.afficherEnteteDeMenu();

        int choixDeMenu = MenuPrincipal.menuPrincipal();
        while(choixDeMenu < 1 || choixDeMenu > 4){
            MenuPrincipal.messageErreurChoixDeMenu();
            choixDeMenu = MenuPrincipal.menuPrincipal();
        }

        switch (choixDeMenu) {
            case 1:
                MenuPrincipal.Accueil();
                break;
            case 2:
                MenuPrincipal.NosProduits();
                break;
            case 3:
                MenuPrincipal.Nouscontacter();
                break;
            case 4:
                MenuPrincipal.Apropos();
                break;
        }
        //System.out.println("\n\t \uD83C\uDF89 Vous avez choisi le menu : "+ choixDeMenu);
    }
}
