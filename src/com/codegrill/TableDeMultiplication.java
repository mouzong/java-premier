package com.codegrill;

public class TableDeMultiplication {
    public static void main(String[] args) {
        /**
         *    --- --- --- ---
         *   | 0 | 1 | 2 | 3 | -> ligne 1
         *    --- --- --- ---
         *   | 4 | 5 | 6 | 7 | -> ligne 2
         *    --- --- --- ---
         *   | 8 | 9 | 0 | 1 | -> ligne 3
         *    --- --- --- ---
         *     C1  C2  C3  C4
         *     int[][] tab = new int[3][4]
         *
         *     tab[1][2]
         *     tab[1][1] = 5;
         *     tableau de taille "n"
         *     index [0.......(n-1)]
         *
         *                      Tableau des index
         *                ---   ---   ---   ---
         *          *   | 0,0 | 0,1 | 0,2 | 0,3 | -> ligne 1
         *          *     ---   ---   ---   ---
         *          *   | 1,0 | 1,1 | 1,2 | 1,3 | -> ligne 2
         *          *     ---   ---   ---   ---
         *          *   | 2,0 | 2,1 | 2,2 | 2,3 | -> ligne 3
         *          *     ---   ---   ---   ---
         *          *     C1    C2     C3     C4
         *
         *     int[][] tabResulatValeur = new int[12][2];
         *      Table de multiplication de X = 2
         *
         *     Tableau de résultat valeur
         *      --- ---
         *     | 1 | 2 |
         *      --- ---
         *     | 2 | 4 |
         *      --- ---
         *
         *
         *     Afficher une table de multiplication sous cette forme
         *      --- --- --- --- ---
         *     | 2 | x | 1 | = | 2 |
         *      --- --- --- --- ---
         *
         *
         *    tableau2D[2][2] -> 5
         */
        int x = 5;
        System.out.println("\t==========================================");
        System.out.println("\t:::::: Table de Multiplication de "+ x +" ::::::");
        System.out.println("\t==========================================");

        int[][] mult = new int[12][2];
        /**
         * Remplissage du tableau de résultat/valeur
         *              --- ---
         *             | 1 | 2 |
         *              --- ---
         *             | 2 | 4 |
         *              --- ---
         */
        // remplissage première ligne
        mult[0][0] = 1;
        mult[0][1] = x * mult[0][0];

        // remplissage première ligne
        mult[1][0] = 2;
        mult[1][1] = x * mult[1][0];

        // Test d'affichage de la premiere ligne de notre tableau

        System.out.println("\n\t Affichage du tableau valeur/résultat");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | " + mult[0][0] + " | " + mult[0][1] + " |");
        System.out.println("\t\t\t  --- ---");


//        Afficher une table de multiplication sous cette forme
//         *      --- --- --- --- ---
//         *     | 2 | x | 1 | = | 2 |
//         *      --- --- --- --- ---
        System.out.println("\n\t  Affichage de la table de multiplication ");
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[0][0] + " | = | " + mult[0][1] + " | ");
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[1][0] + " | = | " + mult[1][1] + " | ");
        System.out.println("\t\t  --- --- --- --- ---");


    }
}
