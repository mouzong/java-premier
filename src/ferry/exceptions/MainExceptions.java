package ferry.exceptions;

import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        int x = 10, y = 2;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n\t Veuillez entrer deux nombres entiers :");
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (Exception e){


        }






        try {
            System.out.println("\n\t Division : " +x+ "/" +y+ "=" + (x/y));

        }catch (ArithmeticException a){
            System.out.println(a);
        }finally {

        }
    }
}

