package manu;

import sout.Sout;

import java.util.Arrays;
import java.util.Scanner;

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
        // int x = 5;

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
//
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
//
//
//        // Afficher les nombres paires inferieur à 100
//        System.out.println("\n\t Liste des 100 premiers nombres paires par ordre décroissant");
//        for (i=100; i>=100; i -= 2){
//            System.out.println(i);

        /**
         * nMax = 15
         * nMin = 7
         *
         * afficher :::: [ 14, 12, 10, 8 ]
         *
         */
        // Afficher les nombres paires decroissa    nts compris entre un nombre max et un nombre minScanner sc = new Scanner(System.in);
//        int nbre1,nbre2;
//
//            System.out.print("Nombre Min : ");
//            int nMin = sc.nextInt();
//            System.out.print("Nombre Max : ");
//            int nMax = sc.nextInt();
//
//            // transfert des valeurs
//            nbre1 = nMax;
//            nbre2 = nMin;

//
//        String[] listeDePresence = {
//                "Manu",
//                "Jonathan",
//                "Ferry",
//                "Florian",
//                "Sylvain",
//                "Stephane",
//                "Nicaise",
//                "adacorp",
//                "Andreas"
//        };
//        for(int j = 0; j < listeDePresence.length; j++){
//       System.out.println("\n\t A l'index " +j+ " du tableau on a ;");
//
//        System.out.println(listeDePresence[j]);
//        }
//
//    Scanner sc = new Scanner(System.in);
//        // entrez 10 nombres
//        int tab1[] = new int[10];
//        int nSom = 0;
//        double moy = 0;
//        System.out.println(" Entrer dix Nombres  : ");
//
//    for(int nbre = 0; nbre < 10; nbre++){
//        tab1[nbre] = sc.nextInt();
//    }
//        System.out.print("Vous avez Entré les nombres suivant : [");
//
//        for(int element : tab1){
//            System.out.print(element +" ");
//            nSom += element;
//            moy = nSom/10;
//        }
//        System.out.println("]");
//        System.out.println(" La Somme est : "+nSom);
//        System.out.println(" La Moyenne est : "+moy);
//
//        }

    // Exercice 1 : Boucle for
    /*
    *Ecrivez un programme java qui utilise une boucle for pour afficher les nombres de 1 à N
    * en ordre croissant.
    * l'utilisateur entre la limite N de la boucle de la console (en utilisant le scanner)
    *
     */
    //
    // entrez 10 nombres
//    int tab1[] = new int[10];
//
//    Scanner sc = new Scanner(System.in);
//    int nomb1 = 0;
//    System.out.println("Entrez la limite supérieure (N) : ");
//    nomb1 = sc.nextInt();
//
//        for(int nbre = 1; nbre <= nomb1; nbre++){
//            //int tab1[] = new int[nomb1];
//         //tab1[nbre] = sc.nextInt();
//         System.out.print(nbre +" ");
//  }

        // Exercice 2 : Switch
        /*
         *Ecrivez un programme java qui utilise l'instruction switch pour afficher le jour de la semaine
         * correspondant à un numéro donné.
         * l'utilisateur entre le numero du jour depuis la console (en utilisant
          */
//        Scanner sc = new Scanner(System.in);
//        int numJour = 0;
//        System.out.print("Entrez le numéro du jour : ");
//        numJour = sc.nextInt();
//
//        switch (numJour){
//            case 1:
//                System.out.println(" Le N° saisie correspond à Lundi");
//                break;
//            case 2:
//                System.out.println(" Le N° saisie correspond à Mardi");
//                break;
//            case 3:
//                System.out.println(" Le N° saisie correspond à Mercredi");
//                break;
//            case 4:
//                System.out.println(" Le N° saisie correspond à Jeudi");
//                break;
//            case 5:
//                System.out.println(" Le N° saisie correspond à Vendredi");
//                break;
//            case 6:
//                System.out.println(" Le N° saisie correspond à Samedi");
//                break;
//            case 7:
//                System.out.println(" Le N° saisie correspond à Dimanche");
//                break;
//            default:
//                System.out.println("Erreur Le N° saisie ne correspond à aucun jour de la semaine !!! ");
//        }
        // Exercice 3 : Tableau à une dimension
        /*
         *Ecrivez un programme java qui crée un tableau d'entiers contenant les nombres de 1 à 5
         * puis utilise une boucle for pour les parcourir et les afficher.
         * l'utilisateur entre les valeurs depuis la console.
         */

//        Scanner keyboard = new Scanner(System.in);
//        int tab1[] = new int[5];
//        System.out.print(" Entrer cinq Nombres  : ");
//        for(int nbre = 0; nbre < 5; nbre++){
//             tab1[nbre] = keyboard.nextInt();
//    }
//        System.out.print(" les nombres Saisies sont les suivants : ");
//
//       for(int element : tab1){
//           System.out.print(element +" ");
//        }

        // Exercice 5 : Calcul de la moyenne
        /*
         *Ecrivez un programme java qui utilise un tableau pour stocker les notes d'un étudiant
         * puis calcul la moyenne de ces notes.
         */

//        Scanner keyboard = new Scanner(System.in);
//        int tab1[] = new int[5];
//        int somme = 0;
//        double moyenne = 0;
//        //
//        System.out.println(" Entrer les notes de l'Etudiant  : ");
//        for(int nbre = 0; nbre < 5; nbre++){
//            tab1[nbre] = keyboard.nextInt();
//        }
//        System.out.print(" les nombres Saisies sont les suivants : ");
//
//        for(int element : tab1){
//            System.out.print(element +" ");
//            somme += element;
//            moyenne = somme/5;
//        }
//        //System.out.println(" La Somme est : "+somme);
//       System.out.println(" La Moyenne de l'Etudiant est : "+moyenne);
    }
}

