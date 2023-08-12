package jonathan;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        // Exercice : Table de multiplication d'un nombre compris entre 1 et 12 entrée par un utilisateur
        int n; //variable devant contenir le nombre entré par un utilisateur
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre compris entre 1 et 12 pour afficher sa table de multiplication :");
        n = sc.nextInt();
        /*if(n >= 1 && n <= 12){
            int i =0;
            System.out.println("\n Table de multiplication de "+n);
            while (i <= 12){
                System.out.println("\t"+n+" x "+ i +" = "+ n*i);
                i++;
                //i +=1;
            }
        }else{
            System.out.println("\n Le nombre entrez n'est pas compris entre 1 et 12");
        }*/
        int cmpt = 0;
        boolean test = false;
        while (cmpt <= 12 ||  test == false){
            if(n >= 1 && n <= 12){
                test = true; //
                //System.out.println("\n Table de multiplication de "+n);
                System.out.println("\t"+n+" x "+ cmpt +" = "+ n*cmpt);
                cmpt++;
            }else{
                cmpt=0;
                System.out.print("Entrez un nombre compris entre 1 et 12 :");
                n = sc.nextInt();
            }

        }

    }
}
