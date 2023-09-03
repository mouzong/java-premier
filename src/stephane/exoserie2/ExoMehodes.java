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
    public static void palindrome(Scanner sc){

        System.out.println("\t\t ***** Vérification PALINDROME ***** ");
              System.out.print("\t\t Entrez le mot à vérifier : ");
            // Recuperation du mot entré au clavier

            String mot = sc.nextLine();
            boolean pal = true;
            int i=0;
           // Comparaison des caractères du mot afin de vérifier s'il est un palindrome
          while (i < mot.length()){
            if (mot.charAt(i) != mot.charAt(mot.length()-1-i)){
                pal = false;
                 break;
            }
//             pal = mot.charAt(i) != mot.charAt(mot.length()-1-i) ? false : true ;
                 i++;
          }
            // Affichage du resultat
               if (pal == true)
                System.out.println("\t\t\t\t"+mot+" est un palindrome");
             else System.out.println("\t\t\t\t"+mot +" n'est pas un palindrome");
    }


}

