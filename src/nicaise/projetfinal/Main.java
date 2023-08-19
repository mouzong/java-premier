package nicaise.projetfinal;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choixDemenu = Menu.menuPrincipal();

        while(choixDemenu < 1 || choixDemenu > 4){
            Menu.messageErreurChoixDeMenu();
            choixDemenu = Menu.menuPrincipal();

        }
        switch (choixDemenu){
            case 4:
                Menu.menuApropos();
                break;
            case 1:
                Menu.menuAccueil();
                break;
            case 2:
                Menu.menuNosProduits();
                break;
            case 3:
                Menu.menuNousContacter();
                break;


        }



    }


}
