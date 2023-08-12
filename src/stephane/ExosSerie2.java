package stephane;

<<<<<<< HEAD
import java.util.Scanner;

public class ExosSerie2 {
    public static void main(String[] args) {

    // Exo 2 : TAbleau inversé

        Scanner sc = new Scanner(System.in);

//        System.out.print("Entrez la taille du tableau: ");
//        int size = sc.nextInt();
//        int[] tab = new int[size]; int[] tabReverse = new int[size];
//        System.out.println("Entrez les "+ size + " elements du tableau");
//        for(int i = 0; i<=size-1; i++){
//            tab[i] = sc.nextInt();
//            tabReverse[size-1-i] = tab[i];
//        }
//        System.out.println("Votre tableau inversé est : ");
//        for (int el:tabReverse){
//            System.out.print(" | "+ el);
//        }

        //Exo 3: Calcul de la factorielle
//        System.out.println(" ****** Calcul de la factorielle ****** ");
//        System.out.print("Entrer un nombre ");
//        int n = sc.nextInt();
//        int fact = n;
//        for (int i=1; i<=n-1; i++){
//            fact = fact*(n-i);
//        }
//        System.out.println("La factorielle de "+n+" est : " +fact);

           // Exo 5: Recherche du maximum et du minimum

//        System.out.print("Entrez la taille du tableau: ");
//        int size = sc.nextInt();
//        int[] tab = new int[size]; int min,max;
//        System.out.println("Entrez les "+ size + " elements du tableau");
//        for(int i = 0; i<=size-1; i++){
//            tab[i] = sc.nextInt();
//                   }
//        min = tab[1]; max = tab[1];
//        for(int i = 0; i<= tab.length-1; i++){
//           if(tab[i] < min)  min = tab[i];
//           if (tab[i] > max) max = tab[i];
//        }
//        System.out.println("Min = " +min+" ; max = "+max);

          //Exo 7 :  Vérification de palindrome
        System.out.println("\t\t Entrez un mot ");

        String mot = sc.nextLine();
        System.out.println("Bonjour "+ mot);

        int i=0;
        while (i < mot.length()){
            System.out.print(mot.charAt(mot.length()-1-i));
            i++;
        }
      //  System.out.println(mot.charAt(2));


=======
public class TAbleDeMultiplication {
    public static void main(String[] args) {
        System.out.println("hello world");
>>>>>>> 12b25d7512d692955ac87640e5388a29886d7aff
    }

}
