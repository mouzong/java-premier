package andreas.exo.corriges.serie2;

import java.util.Scanner;

public class ExoMethodes {
    public static void exo1(Scanner scanner){
        /**
         *  ENONCE : Calculer la somme des elements d'un tableau
         */
        System.out.print("\n\t Entrez la taille tableau : ");
        int taille = scanner.nextInt();

        int[] elements = new int[taille];

        int somme = 0;

        System.out.print("\n\t Entrez "+ taille +" nombres entier séparés par des espaces : ");

        for (int i = 0; i < taille; i++){
            elements[i] = scanner.nextInt();
            somme += elements[i];
        }

        System.out.println("\n\t La somme des éléments est = "+ somme);

    }

    public static void tableauInverse(Scanner scanner){
        System.out.print("\n\t Entrez la taille tableau : ");
        int taille = scanner.nextInt();

        int[] elements = new int[taille];
        int[] elementsInverse = new int[taille];


        for (int i = 0; i < taille; i++){
            System.out.print("\t Entre un nombre : ");
            elements[i] = scanner.nextInt();
        }

        /**
         *      elements
         *      [ 1 0 7 -3 12 ] -> tableau de taille (5)
         *        | | |  |  |
         *        0 1 2  3  4   -> indices du tableau
         *
         *      elementsInverse
         *      [ 12 -3 0  0  0 ] -> tableau de taille (5)
         *        |   | |  |  |
         *        0   1 2  3  4   -> indices du tableau
         */
        for(int i = 0; i < taille; i++){
            elementsInverse[i] = elements[taille - 1 - i];
        }

        System.out.print("\n\t Tableau initial : [");
        for (int valeur : elements){
            System.out.print(" "+valeur);
        }
        System.out.println(" ]");

        System.out.print("\n\t Tableau inversé : [");
        for (int valeur : elementsInverse){
            System.out.print(" "+valeur);
        }
        System.out.println(" ]");
    }

    public static void factoriel(Scanner sc){
        /**
         * Factoriel (N) = N * Factoriel(N-1) * Factoriel(N-2) * Factoriel(N-3) * ... * Factoriel(1)
         * Factoriel (0) = 1
         */
        System.out.println("Entrez un nombre : ");
        int nombre = sc.nextInt();

        int facto = 1;
        for(int i = 1; i <= nombre; i++){
            facto *= i; // facto = facto * i;
        }

        System.out.println("Factoriel ("+nombre+") = "+facto);

    }

    public static void temperature(Scanner sc){
        System.out.print("\n\t");
    }

}
