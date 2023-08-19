package andreas.projetfinal;

public class BoiteAOutils {
    public static int controleMenu(int choix, int inf, int sup){

        int choixDeRetour = choix;

        while(choixDeRetour < inf || choixDeRetour > sup){
            Menu.messageErreurChoixDeMenu();
            choixDeRetour = Menu.menuPrincipal();
        }

        return choixDeRetour;
    }
}
