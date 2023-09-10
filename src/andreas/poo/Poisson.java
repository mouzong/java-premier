package andreas.poo;

public class Poisson extends Animal{
    private String habitat;
    public Poisson() {

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je nage comme une baleine !!!");
    }
}
