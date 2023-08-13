package andreas;

import sout.BoiteAOutils;

public class TestClass {
    public static void main(String[] args) {
        int x, y;


        x = BoiteAOutils.menuTableMultiplication();
        y = BoiteAOutils.menuTableMultiplication();

        int resultat = BoiteAOutils.additionDeuxNombres(x,y);

        System.out.println(resultat);
    }
}
