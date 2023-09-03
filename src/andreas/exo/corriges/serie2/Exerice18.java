package andreas.exo.corriges.serie2;

import andreas.projetfinal.entite.Client;

import java.util.Scanner;

public class Exerice18 {
    public static void main(String[] args) {
        /**
         * Ecrire un programme qui calcule la somme des chiffres d'un nombre
         * ex: 421
         * sortie: 4 + 2 + 1 = 7
         */

        System.out.println(new Client("Stephane"));
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Entre un nombre de votre choix : ");
        int nombre = sc.nextInt();

        int sommeDesChiffres = 0;
        int i = 1;
        while(nombre > 0){
            System.out.println("passage num : "+ i);
            i++;

            int chiffre = nombre % 10;
            System.out.println("\t chiffre : "+chiffre);

            sommeDesChiffres += chiffre;
            System.out.println("\t Somme : "+sommeDesChiffres);

            nombre /= 10;
            System.out.println("\t Nombre : "+nombre);
        }

        System.out.println("\n\t La somme des chiffres est : "+sommeDesChiffres+"\n");
    }
}
