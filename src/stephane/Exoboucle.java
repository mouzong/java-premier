package stephane;

import java.util.Scanner;

public class Exoboucle {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
     //   Exo1: Boucle FOR
//        System.out.println("Affichage des N premier par ordre croissant");
//        System.out.println("Entrez N (limite supérieur)");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++) {
//            System.out.print("| "+ i + " ");
//        }

      // Exo2: Jour de la semaine

//        System.out.println("Entrez le numéro du jour souhaité");
//        int n = sc.nextInt();
//      switch (n ){
//          case 1:
//              System.out.println(" Lundi");
//              break;
//          case 2:
//              System.out.println("Mardi");
//              break;
//          case 3:
//              System.out.println("Mercredi");
//              break;
//          case 4:
//              System.out.println("Jeudi");
//              break;
//          case 5:
//              System.out.println("Vendredi");
//              break;
//          case 6:
//              System.out.println("Samedi");
//              break;
//          case 7:
//              System.out.println("Dimanche");
//              break;
//          default:
//              System.out.println("Erreur : Entrez une valeur comprise entre 1 et 7");
//      }

        // Exo 3: Tableau à une dimension

//        int[] tab = new int[10];
//        System.out.println("Entrez les 5 valeurs du tableau");
//        for(int i = 0; i<=4; i++){
//            tab[i] = sc.nextInt();
//        }
//        System.out.println("Vous avez entré les valeurs suivants:");
//        for(int i = 0; i<=4; i++) {
//            System.out.print("| " + tab[i]);
//        }

        // Exo 4: Multiple de 3 et 5
//        System.out.println("Entrez 2 nombres ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        System.out.println("Les Multiples de " +n+ " et "+ m+" sont :");
//        for(int i = 1; i<=50; i++){
//            if(i%n == 0 || i%m == 0)
//                System.out.print(" | "+i);
//        }

        // Exo 5: Calcul de la Moyenne

//        System.out.println("Entrez les notes de l'étudiant et terminer par la valeur -1");
//        int n=50; int tmp=0; int moy=0;
//        int tab[] = new int[n];
//        for(int i= 0; i<=n; i++){
//             tab[i]= sc.nextInt();
//            if(tab[i]== -1) i = n+1;
//            ++tmp;
//        }
//        for(int i= 0; i<=tmp-2; i++)
//            moy = moy + tab[i];
//
//            System.out.print("Moyenne =  "+moy/(tmp-2));

        // Exo 5: Recherche dans un tableau

        int[] tab = new int[50]; int indixeTrouve=0;
        boolean trouve = false;

        for(int i=0; i<=49; i++){
            tab[i] = i;
        }
        System.out.println("Entrez la valeur à rechercher");
        int valSeach = sc.nextInt();
        for(int i = 0; i<=49; i++) {
            if (tab[i] == valSeach) {
                trouve = true;
                indixeTrouve = i;
               i = tab.length + 1;
            }
        }
            if(trouve == true) System.out.println("La valeur " + valSeach + " est presente dans le tableau à la position "+ indixeTrouve);
            else System.out.println(" La valeur " + valSeach + " est absente du tableau");
        }
        }



