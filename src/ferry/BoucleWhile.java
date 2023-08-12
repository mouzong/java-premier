package ferry;

import java.util.Scanner;

public class BoucleWhile
{
    public static void main(String[] args)
    {
       int number = 2;

      //  while(number < 100)
      //  {
      //      System.out.println(number);
      //      number += 2;
      //  }
        for(int i = 2; i < 100; i += 2){
            System.out.println(number);

        }
        // Exercice : Ecrire un programme qui affiche la table de mutiplication
        // d'un nombre passer par l'utilisateur en faisant usage de la boucle WHILE
        // verifier que le nombre enté est compris entre 1 et 12.

        System.out.println("Table de mutipliquation");
        System.out.println("Veuillez entrer un nombre compris entre 1 et 12");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


      // for(int i = 1; i<=12; i++ ) {
         //  System.out.println(n + " x " + i + " = " + n*i );

      // }







    }
}
