package stephane;

import java.util.Scanner;

public class ExosSerie2 {
    public static void main(String[] args) {

    // Exo 2 : TAbleau inversé

     /*   Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau: ");
        // Recuperation et declaration des tableaux
        int size = sc.nextInt();
        int[] tab = new int[size]; int[] tabReverse = new int[size];
        System.out.println("Entrez les "+ size + " elements du tableau");
        // Remplissage des deux tableaux
        for(int i = 0; i<size; i++){
            tab[i] = sc.nextInt();
            tabReverse[size-1-i] = tab[i];
        }
        System.out.println("Votre tableau inversé est : ");
        for (int el:tabReverse){
            System.out.print(" | "+ el);
        }*/
        //Exo 3: Calcul de la factorielle
//        System.out.println(" ****** Calcul de la factorielle ****** ");
//        System.out.print("Entrer un nombre ");
//        int n = sc.nextInt();
//        int fact = n;
//        for (int i=1; i<=n-1; i++){
//            fact = fact*(n-i);
//        }
//        System.out.println("La factorielle de "+n+" est : " +fact);
/**
 * Écrivez un programme Java qui utilise un tableau pour stocker une liste de nombres
 * entiers entrés par l'utilisateur. Ensuite, trouvez et affichez le nombre maximum et le
 * nombre minimum dans le tableau.
 */
           // Exo 5: Recherche du maximum et du minimum

//        System.out.print("Entrez la taille du tableau: ");
//        int size = sc.nextInt();
//        int[] tab = new int[size]; int min,max;
//        System.out.println("Entrez les "+ size + " elements du tableau");
//        Remplissage du tableau
//        for(int i = 0; i<=size-1; i++){
//            tab[i] = sc.nextInt();
//                   }
//        // Initialisation du max et min
//        min = tab[1]; max = tab[1];
//        // Recherche du max et du min réel
//        for(int i = 0; i<= tab.length-1; i++){
//           if(tab[i] < min)  min = tab[i];
//           if (tab[i] > max) max = tab[i];
//        }
//        System.out.println("Min = " +min+" ; max = "+max);

          //Exo 7 :  Vérification de palindrome
//        System.out.println("\t\t ***** Vérification PALINDROME ***** ");
//        System.out.print("\t\t Entrez le mot à vérifier : ");
//            // Recuperation du mot entré au clavier
//        String mot = sc.nextLine();
//        boolean pal = true;
//        int i=0;
//            // Comparaison des caractères du mot afin de vérifier s'il est un palindrome
//        while (i < mot.length()){
//            if (mot.charAt(i) != mot.charAt(mot.length()-1-i)) pal = false;
//            i++;
//        }
//            // Affichage du resultat
//            if (pal == true)
//                System.out.println("\t\t\t\t"+mot+" est un palindrome");
//            else System.out.println("\t\t\t\t"+mot +" n'est pas un palindrome");

        // Exo 8: Suite de FIBONACCI
//        System.out.println("\t\t ***** SUITE DE FIBONACCI ***** ");
//        System.out.print("\t\t Entrez un nombre : ");
//        //Recuperation du nombre et declaration du tableau qui contiendra Fibonacci
//        int n = sc.nextInt();
//        int[] fib = new int[n+1];
//        // initialisation du tableau (fib(0)=0 et fib(1)=1)
//        fib[0] = 0;
//        fib[1] = 1;
//        // Remplissage du reste du tableau fib[n] = fib[n-1] + fib[n-2]
//        for (int i=2; i<=n; i++){
//            fib[i] = fib[i-1] + fib[i-2];
//        }
//        System.out.print("\t les "+n+" premiers élements de la suite de FIBONACCI sont : ");
//        for (int el:fib) {
//            System.out.print(el+"  ");
//        }

             //  Exo 9: Comptage des voyelles

        Scanner sc = new Scanner(System.in);
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


        // Exo 10 : Calcul de moyenne ponderée
//
       // Declaration du tableau à 2 dimensions : n diciplines et 2 colonnes (note - coef)
//        System.out.println("Entrez le nombre de discipline ");
//        int n = sc.nextInt(), somNote = 0, somCoef =0;
//        int[][] noteCoef = new int[n][2];
//        // Remplissage du tableau note-coef
//        System.out.println("Entrez les notes suivis du coeficient");
//        for (int i=0; i<n; i++){
//            System.out.print("Note : ");
//            noteCoef[i][0] = sc.nextInt();
//            System.out.print("Coef : ");
//            noteCoef[i][1] = sc.nextInt();
//            somNote += noteCoef[i][0] * noteCoef[i][1];
//            somCoef += noteCoef[i][1];
//        }
//        System.out.println("La moyenne Pondérée est : " +somNote/somCoef);


        // Exo 18: SOMME DES CHIFFRES D'UN NOMBRE
//            System.out.println("\t\t ***** SOMME DES CHIFFRES D'UN NOMBRE ***** ");
//            System.out.print("\t\t Entrez le nombre : ");
////            // Recuperation du nombre entré au clavier
//          int nbre = sc.nextInt();
//        int i=0;





    }


}
