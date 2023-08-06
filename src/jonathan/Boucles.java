package jonathan;


import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        for (int i=1; i<=10; i++){
            //System.out.println(x + " x " + i + " = " + x*i);
        }

        /*
        Liste des 100 prenier nombres paires ordre decroisent
        1-) nombre Max = 100-2 = 98 (valeur initial i = 100)
        2-) nombre Min = 2 (premier nombre pair : valeur finale i = 2)
        3-) pas : -2
        */

       // System.out.println("\n\t Liste des 100 prenier nombres paires par ordre décroisent");
        for (int i=98; i >= 2; i -= 2){
            //    System.out.println(i);
        }

        /**
         * nombre paire decroi
         * nMax =
         * nMin =
         */
        /*System.out.print("nombre Max : ");
        int nMax = sc.nextInt();
        System.out.print("nombre Min : ");
        int nMin = sc.nextInt();


        int tmp = nMax;

        if(tmp%2 == 0){
            tmp -= 2;
        }else{
            tmp -= 1;
        }

        for (int i=tmp; i > nMin; i -= 2){
            System.out.println(i);
        }*/

        //Exercice
        /**
         * Total de Nombre entier : 10 (index n°0 à index n°9)
         * ListNbr []
         * Somme
         * Moyenne
         */

        int[] ListNbr = new int[9]; // Tableau 1e dimension
        for (int i=0; i < ListNbr.length; i++){
            System.out.print("Entrée le nombre à l'index N° "+ i + " : ");
            ListNbr[i] = sc.nextInt();
        }

        System.out.print("\t\nTableau des nombres entrée par l'utilisateur [ ");
        int Somme=0;
        for (int Element : ListNbr) {
            Somme += Element;
            System.out.print(Element+ " ");
        }
        System.out.println("]");


        System.out.println("\t\n Calcul de la Somme et de la Moyenne");

        System.out.println("\t\n La Sommme est : "+Somme);
        System.out.println(" La moyenne est "+Somme+"/" + ListNbr.length+" = "+Somme/ListNbr.length);
    }
}

