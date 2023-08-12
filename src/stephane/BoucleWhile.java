package stephane;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n==0) {
            n = sc.nextInt();
            if (n>=1 && n<=12){
                System.out.println("\t==========================================");
                System.out.println("\t:::::: Table de Multiplication de "+ n +" ::::::");
                System.out.println("\t==========================================");
            }
            else{
                    System.out.print("Entrez un nombre compris entre 1 et 12 : ");
                    n = 0;
                }

        }
        int i = 1;
            while (i <=12){
                    System.out.println("\t\t\t"+n+ " x " + i + " = " + n*i);
                i++;
            }


    }
}
