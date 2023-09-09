package andreas.exceptions;

import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        int x = 10, y = 2;

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\t Veuillez entrer deux entiers : ");
            x = sc.nextInt();
            y = sc.nextInt();
        }catch (Exception e){
            // utiliser throws sur la methode
            // puis vous lever avec throw dans le code
        }




        try{
            System.out.println("\n\t Division : "+x+" / "+y+" = "+ (x/y));
        } catch (ArithmeticException a){
            System.out.println(a);
        } finally {

        }

        /**
         * - try :
         * - catch :
         * - finally :
         * - throw :
         * - throws :
         *
         * Exercice : Ecrire un bloc de code qui permet de gérer une exception générée par
         * le type de la valeur entrée par l'utilisateur:
         *
         * exp: Si j'attend une valeur de type int et l'utilisateur entre un valeur String,
         * lever l'exception adequate
         */

//        TestExceptions te1 = new TestExceptions();
//        try {
//            System.out.println("\n\t "+te1.divide(10,0));
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }finally{
//            // modifie la valeur de on controleur de sortie du programme
//        }
    }
}
