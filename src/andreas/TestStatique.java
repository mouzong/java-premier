package andreas;

public class TestStatique {
    public static  int nombreDInstanceCree = 0;

    public String nom;
    public String prenom;
    private String email;

    public TestStatique() {
        nombreDInstanceCree++;
    }
}
