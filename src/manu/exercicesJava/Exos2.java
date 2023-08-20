package manu.exercicesJava;

import java.util.Arrays;
public class Exos2 {

    public static void main(String[] args) {
        /**
         * Tableau inversé
         * Ecrivez un programme Java qui utilise un tableau pour stocker une liste de nombres entiers
         * entrées par l'utilisateur.
         * Ensuite, créer un nouveau tableau qui contient les memes nombres, mais dans l'ordre inverse.
         */

        int[] tab = {1, 2, 3, 4, 5, 6};
        System.out.println("Tableau avant l'inversion: " + Arrays.toString(tab));

        for(int i=0; i< tab.length/2; i++){
            int tmp = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = tmp;
        }
        System.out.println("Tableau après l'inversion: " + Arrays.toString(tab));
    }
}


