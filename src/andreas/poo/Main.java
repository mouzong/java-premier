package andreas.poo;

import andreas.poo.abstraction.Constructeur;

public class Main {
    public static void main(String[] args) {
//        CompteBancaire cb0 = new CompteBancaire();
//        CompteBancaire cb1 = new CompteBancaire("ADA-C01");
//        CompteBancaire cb2 = new CompteBancaire(
//                "ADA-C02",
//                2500000.250,
//                false,
//                500000.0
//        );
//        CompteBancaire cb3 = new CompteBancaire();

//        Poisson p1 = new Poisson();
//
//        p1.setNom("Requin");


        Animal an1 = new Animal("Animal Numero 1");
        an1.seDeplacer();

        Animal an2 = new Aigle();
        Animal an3 = new Homme();
        Animal an4 = new Poisson();

        an2.seDeplacer();
        an3.seDeplacer();

        Constructeur cst1 = new Constructeur();







    }
}
