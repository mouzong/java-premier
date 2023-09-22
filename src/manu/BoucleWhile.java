package manu;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
//        int number = 2;
//        while(number < 100){
//        System.out.println(number);
//        number += 2;
//        }
        /**
         * Ecrire un programme qui affiche la table de
         * multiplication d'un nombre passer par l'utilisateur en faisant usage de la boucle while
         * vérifier que le nombre entré est compris entre 1 et 20
         */
        Scanner sc = new Scanner(System.in);
          int valnbre = 0;
          //
        while(valnbre == 0 ){

          System.out.print("Entrez le Nombre : ");
          valnbre = sc.nextInt();
          //
          if(valnbre >= 1 && valnbre <= 20){
              System.out.println("\t==========================================");
              System.out.println("\t:::::: Table de Multiplication de "+ valnbre +" ::::::");
              System.out.println("\t==========================================");
          } else {
              System.out.println("le Nombre entré est incorrect, recommencer");
              valnbre = 0;
          }
        }
          //
        int i = 1;
        while(i <= 25){
            System.out.println(valnbre+ "X " + i + " = "+ valnbre*i);
            i++;
        }
    }

}





