package com.codegrill;

public class Boucles {
    public static void main(String[] args) {
        /**
         * Boucles
         * For
         * For (Evolu)
         * While
         * Do While
         *
         */

        // Table de multiplication sans les boucles
        int x = 5;

//        System.out.println(x + " x 1" + " = " + x*1);
//        System.out.println(x + " x 2" + " = " + x*2);
//        System.out.println(x + " x 3" + " = " + x*3);
//        System.out.println(x + " x 4" + " = " + x*4);
//        System.out.println(x + " x 5" + " = " + x*5);
//        System.out.println(x + " x 6" + " = " + x*6);
//        System.out.println(x + " x 7" + " = " + x*7);
//        System.out.println(x + " x 8" + " = " + x*8);
//        System.out.println(x + " x 9" + " = " + x*9);
//        System.out.println(x + " x 10" + " = " + x*10);

//        int i,n;
//        //i = 1;
//        n = 5;
//        // Structure de la boucle for
//        for (i =1; i <= n; i++){
//            System.out.println(x + " x "+ i + " = " + x*i);
//        }
//
//        // Afficher la lste des 100 premier nombres paires
//        System.out.println("\n\t Liste de nombre paires");
//        for (i=2; i<=100; i += 2){
//            System.out.println(i);
//        }


        // Afficher les nombres paires inferieur à 100

        /**
         * nMax = 15
         * nMin = 7
         *
         * afficher :::: [ 14, 12, 10, 8 ]
         *
         */

        String[] listeDePresence = {
                "Manu",     // index 0
                "Jonathan", // index 1
                "Ferry",    // index 2
                "Florian",  // index 3
                "Sylvain",  // index 4
                "Stephane", // index 5
                "Nicaise",  // index 6
                "adacorp",  // index 7
                "Andreas"   // index 8
        };

//        for(int j = 0; j < listeDePresence.length; j++){
//            System.out.print("\n\t A l'index "+ j + " du tableau on a :: ");
//            System.out.println(listeDePresence[j]);
//        }

        for(String element : listeDePresence){
            System.out.println("\n\t - " + element);
        }

        // Exercice : Ecrire bout de code qui demande a un utilisateur de fournir 10 nombres entiers
        // et calclule puis affiche la liste des nombres entrés sous forme de tableau [12, 15, -7 .... ]
        // somme et la moyenne de ces nombres.
        /**
         * Liste de nombre entrés :  [a, b ,c ,....]
         * Somme = ...
         * Moyenne = ...
         *
         * rappel :: moyenne = somme / nombreTotal
         */




    }
}
