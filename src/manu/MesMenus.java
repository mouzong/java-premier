package manu;

import java.util.Scanner;

public class MesMenus {
    public static int tabMultipliMethode() {
        System.out.println("\t==========================================");
        System.out.println("\t:::::: Table de Multiplication  ::::::");
        System.out.println("\t==========================================");
        System.out.print("Entrez le Nombre : ");
        //
        int nbre1;
        Scanner keyboard = new Scanner(System.in);
        nbre1 = keyboard.nextInt();
        return nbre1;
    }
//
        public static void affichageTable(int n, int p) {
           for(int i = 1; i <= p; i++){
               System.out.println(n + " X " + i+ " = " +i*n);
           }

        }

        }


