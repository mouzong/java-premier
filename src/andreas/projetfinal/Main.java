package andreas.projetfinal;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choix = Menu.menuPrincipal();

        while(choix < 1 || choix > 4){
            Menu.messageErreurChoixDeMenu();
            choix = Menu.menuPrincipal();
        }

        System.out.println("\n\t \uD83C\uDF89 Vous avez choisi le menu : "+ choix);
    }
}
