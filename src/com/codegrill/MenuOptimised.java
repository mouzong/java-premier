package com.codegrill;

import java.util.Scanner;

public class MenuOptimised {
    public static void main(String[] args) {

//        int[] numeroAleatoire = { 2,6,-3 };
//
//        int[][] tab2D = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//
        Scanner sc = new Scanner(System.in);
        // Declaration du tableau
        String[] menu = { "Accueil", "Nos Produits", "Nous contacter", "A propos" };

        System.out.println("\t ==================================================================");
        System.out.println("\t :::::::::::: Application de Gestion d'agence Immobiliere :::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t :::::::::::::::::::::::::::    MENU   ::::::::::::::::::::::::::::");
        System.out.println("\t ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t ==================================================================");

        System.out.println("\n\t 1️⃣ - " + menu[0]);
        System.out.println("\t 2️⃣ - " + menu[1]);
        System.out.println("\t 3️⃣ - " + menu [2]);
        System.out.println("\t 4️⃣ - "+ menu[3]);

        System.out.print("\n\t \uD83D\uDE00 Votre choix : ");

        int choix = sc.nextInt();

        System.out.println("\n\n Vous avez choisi de consulter le menu : " + menu[1]);
    }
}
