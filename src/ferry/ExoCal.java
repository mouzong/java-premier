package ferry;

import java.util.Scanner;

public class ExoCal {
    public static void exocal(Scanner scanner) {
        int a,b;
        char operateur;
        int calcul = 0;

        System.out.println("Faites vos operations librement");
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un chiffre : ");
        a = sc.nextInt();
        System.out.println("Veuillez entrer un operateur ( +, -, *, /, % ) : ");
        operateur = (char) sc.nextInt(0);
        System.out.println("Veuillez entrer un autre chiffre : ");
        b = sc.nextInt();
        switch (operateur) {
            case '+':
                  calcul = a + b;
                  break;
            case '-':
                  calcul = a - b;
                  break;
            case '*':
                  calcul = a * b;
                  break;
            case '/':
                  calcul = a / b;
                  break;
            case '%':
                  calcul = a % b;
                  break;
            default:
                break;
        }
        System.out.println("Le resultat de l'operation est : " + calcul);
    }
}
