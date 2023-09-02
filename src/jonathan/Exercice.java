package jonathan;

import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {

        // Exercice 1 : Somme des éléments d'un tableau
        /*int n;
        int Somme=0;
        System.out.print("Entre le Tatal des valeurs à entrée : ");
        Scanner Nmax = new Scanner(System.in);
        n = Nmax.nextInt();
        int[] ListNbr = new int[n]; // Tableau 1e dimension
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre les valeur des n nombres  :");
        for (int i=0; i < ListNbr.length; i++){
           // System.out.print("Entrée le nombre N° "+ (i+1)+ " : ");
            ListNbr[i] = sc.nextInt();
            Somme += ListNbr[i];
        }
        System.out.println("\t\n La Sommme est : "+Somme);*/

        //Exercice 2 : Tableau inversé
        /*int n;
        System.out.print("Entre le Tatal des valeurs à entrée : ");
        Scanner Nmax = new Scanner(System.in);
        n = Nmax.nextInt();
        int[] ListNbr = new int[n]; // Tableau 1e dimension
        int[] ListNbrInv = new int[n]; // Tableau 1e dimension
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre les valeur des n nombres  :");
        int j = ListNbr.length-1;
        for (int i=0; i < ListNbr.length; i++){
            // System.out.print("Entrée le nombre N° "+ (i+1)+ " : ");
            ListNbr[i] = sc.nextInt();
            ListNbrInv[j] = ListNbr[i];
            j--;
        }
        System.out.print("Le tableau qui contient les mêmes nombres, mais dans l'ordre inverse :  [ ");
        for (int Element : ListNbrInv) {
            System.out.print(Element+ " ");
        }
        System.out.println("]");*/

        //Exercice 3 : Calcul de la factorielle
        /*int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un Nombre : ");
        n = sc.nextInt();
        int fact = n;
        for (int i= fact-1; i > 0; i--){
            fact = fact * i;
        }
        System.out.println("factoriel : "+n+"! = "+fact);*/

        //Exercice 9 : Comptage des voyelles
        /**Écrivez un programme Java qui demande à l'utilisateur d'entrer une chaîne de caractères
         et compte le nombre de voyelles (a, e, i, o, u) dans la chaîne.

         */
        String chaine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre une Chaine de caractère : ");
        chaine = sc.nextLine();
        chaine = chaine.toLowerCase();
        int cpt = 0;
        for(int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cpt++;
            }
        }
        System.out.println("Le nombre de voyelles est :"+cpt);
    }
}
