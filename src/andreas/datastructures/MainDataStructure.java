package andreas.datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainDataStructure {
    public static void main(String[] args) {
        // [1,2,3,5,6,8,4,5,2,6,9,7,5,6]

        int[] tableau = new int[5]; // Tbaleau statique

        List<Integer> tableau2 = new ArrayList<>(); // Tableau dynamique

        Set<Integer> tabSet = new HashSet<>();

        tableau2.add(1);
        tableau2.add(1);
        tableau2.add(2);
        tableau2.add(3);
        tableau2.add(2);

        System.out.println("\n\t List : "+ tableau2);

        tabSet.add(1);
        tabSet.add(1);
        tabSet.add(2);
        tabSet.add(3);
        tabSet.add(2);

        System.out.println("\n\t Set : "+ tabSet);
    }
}
