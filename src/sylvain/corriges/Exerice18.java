<<<<<<<< HEAD:src/sylvain/corriges/Exerice18.java
package sylvain.corriges;
========
package andreas.exo.corriges.serie2;
>>>>>>>> fe1fcd314df73d676afb0680e5ea5f54c3167a17:src/andreas/exo/corriges/serie2/Exerice18.java

import java.util.Scanner;

public class Exerice18 {
    public static void main(String[] args) {
        /**
         * Ecrire un programme qui calcule la somme des chiffres d'un nombre
         * ex: 421
         * sortie: 4 + 2 + 1 = 7
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Entre un nombre de votre choix : ");
        int nombre = sc.nextInt();

        int sommeDesChiffres = 0;
        int i = 1;
        while(nombre > 0){
            System.out.println("passage num : "+ i);
            i++;

            int chiffre = nombre % 10;
            System.out.println("\t chiffre : "+chiffre);

            sommeDesChiffres += chiffre;
            System.out.println("\t Somme : "+sommeDesChiffres);

            nombre /= 10;
            System.out.println("\t Nombre : "+nombre);
        }

        System.out.println("\n\t La somme des chiffres est : "+sommeDesChiffres+"\n");
    }
}
