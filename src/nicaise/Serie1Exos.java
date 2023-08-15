package nicaise;

import java.util.Scanner;
//< = >
public class Serie1Exos {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
//  Exo 1 Boucle for
//        System.out.println("Affichez n nombres par ordre croissant ");
//        System.out.print("Veuillez rentrer N 'limite supérieure  :");
//        int n= sc.nextInt();
//        int i;
//    for (i=1;i <= n;i++){
//        System.out.print("| "+ i + " ");
//    }
//  Exo 2 Switch
//        System.out.print("Affichez le numero du jour  :");
//        int jourSemaine = sc.nextInt();
//      switch (jourSemaine){
//          case 1:
//              System.out.println("Lundi");
//              break;
//          case 2 :
//              System.out.println("Mardi");
//              break;
//          case 3 :
//              System.out.println("Mercredi");
//              break;
//          case 4 :
//              System.out.println("Jeudi");
//              break;
//          case 5 :
//              System.out.println("Vendredi");
//              break;
//          case 6 :
//              System.out.println("Samedi");
//              break;
//          case 7 :
//              System.out.println("Dimanche");
//              break;
//          default:
//              System.out.println("Ce jour de semaine n'est pas valide ");
//              System.out.println("Entrez une valeur comprise entre 1 et 7");
//      }

//     Exo 3 TableUneDimension
//
//        int []tableauUneDimension = {1;2;3;4;5};
//        System.out.print("Entrez les valeurs du tableau : ");
//        tableauUneDimension= sc.nextInt();

//     Exo 4-a Multiple de 3 et 5 Afficher les multiples de 3 et 5 compris entre 1 et 50 (sans saisie utilisateur)
        int valeurMutiple =1;
        System.out.println("Afficher les multiples de 3 et 5 compris entre 1 et 50");

            for (valeurMutiple=1;valeurMutiple >=1 && valeurMutiple <= 50;valeurMutiple++){

                if (valeurMutiple%3==0 || valeurMutiple%5 == 0){
                    System.out.println( valeurMutiple);
            }
        }
    }
}