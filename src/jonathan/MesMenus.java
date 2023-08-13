package jonathan;

import java.util.Scanner;

public class MesMenus {
    public static void MenuTableDeMultiplication(){
        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int i=0; i<=12; i++){
            System.out.println(x + " x " + i + " = " + x*i);
        }
    }
}
