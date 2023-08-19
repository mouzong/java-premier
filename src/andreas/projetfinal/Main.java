package andreas.projetfinal;

public class Main {
    public static void main(String[] args) {
        Menu.afficherEnteteDeMenu();

        int choixDeMenu = Menu.menuPrincipal();

        while(choixDeMenu < 1 || choixDeMenu > 4){
            Menu.messageErreurChoixDeMenu();
            choixDeMenu = Menu.menuPrincipal();
        }

        System.out.println("\n\t \uD83C\uDF89 Vous avez choisi le menu : "+ choixDeMenu);
    }
}
