package stephane;

import java.util.Random;
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

//        System.out.print("Entrez le numéro du jour souhaité ");
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
//
////        for(int i = 1; i<=50; i++){
////            if(i%n == 0 && i%m == 0)
////                System.out.print(" | "+i);
////        }
//            for(int i = 1; i<=50; i++){
//                if(i%n == 0) System.out.print(" | "+i);
//            }
//            for(int j = 1; j<=50; j++){
//                 if(j%m == 0) System.out.print(" | "+j);
//        }
//


        // Exo 5: Calcul de la Moyenne

//        System.out.println("Entrez les notes de l'étudiant et terminer par la valeur -1");
//        int n=50; int tmp=0; double moy=0;
//        int tab[] = new int[n];
//        for(int i= 0; i<=n; i++){
//             tab[i]= sc.nextInt();
//            if(tab[i]== -1) break;
//            tmp++;
//        }
//        for(int i= 0; i<=tmp-1; i++)
//            moy = moy + tab[i];
//
//            System.out.print("Moyenne =  "+moy/(tmp));

        // Exo 6: Recherche dans un tableau

        int[] tab = new int[50]; int indixeTrouve=0;
        boolean trouve = false;
        Random random = new Random();
        for(int i=0; i<=49; i++){
            tab[i] = random.nextInt(100);
        }
        System.out.println("Entrez la valeur à rechercher");
        int valSeach = sc.nextInt();
        for(int i = 0; i<=49; i++) {
            if (tab[i] == valSeach) {
                trouve = true;
                indixeTrouve = i;
               break;
            }
        }
            if(trouve == true) System.out.println("La valeur " + valSeach + " est presente dans le tableau à la position "+ indixeTrouve);
            else System.out.println(" La valeur " + valSeach + " est absente du tableau");
        }
        }



