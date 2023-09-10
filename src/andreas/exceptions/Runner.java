package andreas.exceptions;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean controleurDeProgramme = false;
        Scanner sc = new Scanner(System.in);
        int choix;
        TestExceptions te1 = new TestExceptions();

        while (controleurDeProgramme == false) {

            do {
                System.out.println("\n\t 1 - Addition");
                System.out.println("\t 2 - Division");
                System.out.println("\t 3 - Multiplication");
                System.out.println("\t 4 - Soustratction");
                System.out.println("\t 0 - Sortir");

                System.out.print("\n\t Votre choix : ");
                choix = sc.nextInt();
            } while (choix < 0 || choix > 4);

            try {
                System.out.println("\n\t " + te1.divide(10, 0));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                // modifie la valeur de on controleur de sortie du programme
                if(choix == 0){
                    controleurDeProgramme = true;
                    System.out.println("\n\t Merci d'avoir utilisé notre programme aurevoir !!!");
                }
            }

        }
    }
}
