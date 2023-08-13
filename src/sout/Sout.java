package sout;

import andreas.AccessModifiers;

public class Sout {
    public static void main(String[] args) {
        int x , y; // creation des variables  x et y

        AccessModifiers accessModifiers = new AccessModifiers();



        // Initialisation des variables
        x = 12;
        y = 19;

        System.out.println("Bonjour et bienvenue dans le programme");
        System.out.println(x);
        System.out.println(y);

        System.out.println(x + " et " + y);

        System.out.println(x + " - x -" + y + " = " + x*y);


    }
}
