package manu.exercicesJava;

import java.util.Scanner;

public class Exos3 {
    public static void main(String[] args) {
        /**
         * Ecrivez un programme Java qui demande à l'utilisateur d'entrer
         * un nombre positif et calcule sa factorielle à l'aide d'une boucle 'for'
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Veuillez Saisir le Nombre Entier : ");
        int nbre = sc.nextInt();
        System.out.println(" Le Nombre Entier Saisi est : "+nbre);

        // Contrôle du nombre saisi

        if (nbre != 0) {
            for (int i = nbre-1 ;i >= 1 ;i--){
                nbre = nbre*i;
            }

            System.out.println("donc le factoriel est =  "+nbre);
        } else
            nbre = 1;
        System.out.println("le factoriel est = "+ nbre);
    }
}
