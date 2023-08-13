package stephane;

import java.util.Scanner;

public class MesMenus {
    /**
     * Recuperation du nombre dont on souhaite afficher la table de multiplication
     *
     * @return
     */
        public static int MenuTableDeMultiplication(){
        System.out.print("Entrer un nombre");
       Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
    /**
     * Cette methode affiche la table de multiplicatiopn d'un nombre
     * parametres
     * n : Nombre entré par l'utilisateur
     * l : nombre de ligne de la table de multiplication
     */
    public static void tableMultView(int n, int l){
        for (int i=1; i<=l; i++){
            System.out.println(n+" x "+ i + " = "+ i*n);
        }
    }
    public static int nombreDeLigne(){
        System.out.print("Entrer le nombre de ligne pour la table de multiplication ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        return l;
    }



}
