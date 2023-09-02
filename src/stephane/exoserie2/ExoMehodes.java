package stephane.exoserie2;

import java.util.Scanner;

public class ExoMehodes {

    public static void comptageVoyelles(Scanner sc){

        System.out.println("\t\t ***** COMPTAGE DES VOYELLES ***** ");
        System.out.print("\t\t Entrez un mot : ");

        // Recuperation du mot entré au clavier
        String mot = sc.nextLine();

        // Convertir en minuscule
            mot = mot.toLowerCase();

        int i=0, nbreVoyelle = 0;

        // Compte les voyelles du mot et stock le nombre dans nbreVoyelle

        while (i < mot.length()){
            if ((mot.charAt(i) == 'a') || (mot.charAt(i) == 'e') || (mot.charAt(i) == 'i')
                    || (mot.charAt(i) == 'o') || (mot.charAt(i) == 'u')){
                nbreVoyelle += 1;
            }
            i++;
        }
        // Affichage du nombre de voyelle
             System.out.println("Le nombre de voyelle est : "+ nbreVoyelle);

    }
}
