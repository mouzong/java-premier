package andreas.poo;

public class Homme extends  Animal{
    @Override
    public void seDeplacer() {
        System.out.println("Je cours comme un Homme !!!");
    }

    public Homme() {
    }

    public Homme(String nom) {
        super(nom);
    }
}
