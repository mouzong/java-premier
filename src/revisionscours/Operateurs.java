package revisionscours;

public class Operateurs {
    public static void main(String[] args) {
        /**
         * Operateurs en java
         *
         * Operateurs Arithmetiques
         *
         *  + : -> Addition
         *  - : -> Soustraction
         *  / : -> Division (Entière)
         *  * : -> Multiplication
         *  % : -> Modulo (Reste de la division de deux nombres entiers)
         *
         */

//        int a = 7;
//        int b = 3;
//
//        System.out.println("\n\tInitialement a = "+a+" et b = "+b);
//        System.out.println("\n\t Addition "+ a +" + "+ b +" = "+ (a+b));
//        System.out.println("\t Soustraction "+ a +" - "+ b +" = "+ (a-b));
//        System.out.println("\t Division "+ a +" / "+ b +" = "+ (a/b));
//        System.out.println("\t Multiplication "+ a +" * "+ b +" = "+ (a*b));
//        System.out.println("\t Modulo "+ a +" % "+ b +" = "+ (a%b));

        /**
         * Operateurs en java
         *
         * Operateurs De comparaisons
         *
         *  > : -> Superieur
         *  < : -> Inferieur
         *  == : -> Egalité
         *  != : -> Inegalité
         *  <= : -> Inferieur ou egal
         *  >= : -> Superieur ou egal
         *
         */
//
//        int a = 7;
//        int b = 3;
//
//        System.out.println("\n\tInitialement a = "+a+" et b = "+b);
//        System.out.println("\t Egalité "+ a +" == "+ b +" : "+ (a == b));
//        System.out.println("\t InEgalité "+ a +" != "+ b +" : "+ (a != b));
//        System.out.println("\t Superieur "+ a +" > "+ b +" : "+ (a > b));
//        System.out.println("\t Inf ou Egal "+ a +" <= "+ b +" : "+ (a <= b));
//        System.out.println("\t Sup ou Egal "+ a +" >= "+ b +" : "+ (a >= b));
//        System.out.println("\t Inf "+ a +" < "+ b +" : "+ (a < b));

        /**
         * Operateurs en java
         *
         * Operateurs De Conjonction et disjonction
         *
         *  || : -> OU
         *  && : -> ET
         *
         */

        int a = 7, b = 2;

        if( a>b && (a%2 == 0)){
            System.out.println(a + " est un nombre superieur à "+b+" et paire !");
        } else if(a>b && (a%2 != 0)){
            System.out.println(a + " est un nombre superieur à "+b+" et impaire !");
        } else {
            System.out.println(a + " est un nombre inferieur ou egal à "+b+" et impaire ou paire !");
        }
    }
}
