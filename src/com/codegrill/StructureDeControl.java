package com.codegrill;

public class StructureDeControl {
    public static void main(String[] args) {
        int age = 20;

        // Dans le cas de figure de deux choix uniquement
        if(  age >= 18 ){
            System.out.println("Vous etes adulte");
        } else {
            System.out.println("Vous etes mineur");
        }

        // Si on a plusieurs choix
        if(age < 10){
            System.out.println("Vous etes un enfant");
        } else if ( age >= 10 && age < 18) {
            System.out.println("Vous etes ado");
        } else {
            System.out.println("Vous etes adulte");
        }
    }
}
