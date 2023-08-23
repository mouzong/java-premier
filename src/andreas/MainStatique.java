package andreas;

public class MainStatique {
    public static void main(String[] args) {
        TestStatique ts1 = new TestStatique();
        TestStatique ts2 = new TestStatique();
        TestStatique ts3 = new TestStatique();


        System.out.println(TestStatique.nombreDInstanceCree);

        TestStatique ts4 = new TestStatique();

        System.out.println(TestStatique.nombreDInstanceCree);

        System.out.println(ts1.nom);


    }
}
