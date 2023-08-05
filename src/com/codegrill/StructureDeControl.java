package com.codegrill;

public class StructureDeControl {
    public static void main(String[] args) {
//        int age = 20;
//
//        // Dans le cas de figure de deux choix uniquement
//        if(  age >= 18 ){
//            System.out.println("Vous etes adulte");
//        } else {
//            System.out.println("Vous etes mineur");
//        }

//        // Si on a plusieurs choix
//        if(age < 10){
//            System.out.println("Vous etes un enfant");
//        } else if ( age >= 10 && age < 18) {
//            System.out.println("Vous etes ado");
//        } else {
//            System.out.println("Vous etes adulte");
//        }


        int jourDeSemaine = 56;
        /**
         *
         * SWICTH
         */
        switch (jourDeSemaine){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Erreur valeur erronee");
        }
    }
}
