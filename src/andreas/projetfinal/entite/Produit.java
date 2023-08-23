package andreas.projetfinal.entite;

import andreas.projetfinal.enums.Service;
import andreas.projetfinal.enums.Ville;

import java.util.Objects;

public class Produit {
    private String libele;
    private String codeProduit;
    private double prix;
    private boolean estTresDisponible;
    private int nombreDePieces;
    private Ville ville;
    private Service service;

    public Produit() {
    }

    public Produit(String libele, String codeProduit, double prix, boolean estDisponible, int nombreDePieces, Ville ville, Service service) {
        this.libele = libele;
        this.codeProduit = codeProduit;
        this.prix = prix;
        this.estTresDisponible = estDisponible;
        this.nombreDePieces = nombreDePieces;
        this.ville = ville;
        this.service = service;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return estTresDisponible;
    }

    public void setEstTresDisponible(boolean estTresDisponible) {
        this.estTresDisponible = estTresDisponible;
    }

    public int getNombreDePieces() {
        return nombreDePieces;
    }

    public void setNombreDePieces(int nombreDePieces) {
        this.nombreDePieces = nombreDePieces;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Double.compare(produit.prix, prix) == 0 && estTresDisponible == produit.estTresDisponible && nombreDePieces == produit.nombreDePieces && Objects.equals(libele, produit.libele) && Objects.equals(codeProduit, produit.codeProduit) && ville == produit.ville && service == produit.service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(libele, codeProduit, prix, estTresDisponible, nombreDePieces, ville, service);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "libele='" + libele + '\'' +
                ", codeProduit='" + codeProduit + '\'' +
                ", prix=" + prix +
                ", estTresDisponible=" + estTresDisponible +
                ", nombreDePieces=" + nombreDePieces +
                ", ville=" + ville +
                ", service=" + service +
                '}';
    }
}
