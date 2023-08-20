package manu.exercicesJava;

import sout.Sout;

import java.util.Scanner;

public class Exos1 {
    public static void main(String[] args) {
        /**
         * Ecrivez un programme java qui utilise un tableau pour stocker une liste de nombres entiers entrées par l'utilisateur.
         * ensuite calculez et affichez la somme de tous les elements du tableau.
         */
        final int n = 5;
        int i;
        float s = 0;
        float t[] = new float[n];
        System.out.println("Donnez les valeurs à saisir dans le tableau : ");
        Scanner x = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            t[i] = x.nextFloat();
        }
        for (i = 0; i < n; i++)
            s += t[i];
        System.out.println("La sommes est : " + s);

    }
}
