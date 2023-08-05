package com.codegrill;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        String nomUtilisateur;

        Scanner notreScanner = new Scanner(System.in);

        System.out.print("Entrez votre numero de table : ");
        int numero = notreScanner.nextInt();

        String bufferRead = notreScanner.nextLine();
        System.out.println("\n\t Buffer Content : "+ bufferRead + "\n\n");

        System.out.print("Entrez votre nom : ");
        nomUtilisateur = notreScanner.nextLine();

        System.out.println("Bonjour "+ nomUtilisateur +
                " soyez la bienvenue sur votre table "+ numero);

    }
}
