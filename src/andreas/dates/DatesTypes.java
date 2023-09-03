package andreas.dates;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class DatesTypes {
    public static void main(String[] args) {
//        LocalDateTime toutDeSuite = LocalDateTime.now();
//
//        System.out.println(toutDeSuite);
//        System.out.println(toutDeSuite.getDayOfMonth());
//        System.out.println(toutDeSuite.getDayOfWeek());
//        System.out.println(toutDeSuite.getDayOfYear());
//        System.out.println(toutDeSuite.getMinute());
//
//
//        LocalDateTime datePersonalisee = LocalDateTime.of(
//                2023,
//                5,
//                13,
//                11,
//                20,
//                30
//        );
//
//        System.out.println("\n\t Date personnalisee : " + datePersonalisee);
//
//
//        LocalDate date = LocalDate.now();
//        LocalTime heure = LocalTime.now();
//
//        System.out.println("\n\t Date du jour : " + date);
//        System.out.println("\n\t Heure actuelle : " + heure);
//
//        LocalDate datePerso = LocalDate.of(2022, 4,13);


        Scanner monScanner = new Scanner(System.in);
        DatesMethodes.createCustomer(monScanner);

    }
}
