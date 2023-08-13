package sout;

import java.util.Scanner;

public class BoiteAOutils {

    public static int additionDeuxNombres(int a, int b){

        return a + b;
    }

    public static int menuTableMultiplication(){
        System.out.println("\n\t Entrez une valeure : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
