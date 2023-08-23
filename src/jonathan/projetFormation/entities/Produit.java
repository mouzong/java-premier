package jonathan.projetFormation.entities;

import jonathan.projetFormation.enums.Service;
import jonathan.projetFormation.enums.Ville;

import java.util.Objects;

public class Produit {
   private String Libelé;
   private String codeProduit;
   private Double prix;
   private Boolean disponible;
   private int nombreDePieces;
   private Ville ville;
   private Service service;

    public Produit() {
    }

    public Produit(String libelé, String codeProduit, Double prix, Boolean estDisponible, int nombreDePieces, Ville ville, Service service) {
        Libelé = libelé;
        this.codeProduit = codeProduit;
        this.prix = prix;
        this.disponible = estDisponible;
        this.nombreDePieces = nombreDePieces;
        this.ville = ville;
        this.service = service;
    }

    public String getLibelé() {
        return Libelé;
    }

    public void setLibelé(String libelé) {
        Libelé = libelé;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
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
        return nombreDePieces == produit.nombreDePieces && Objects.equals(Libelé, produit.Libelé) && Objects.equals(codeProduit, produit.codeProduit) && Objects.equals(prix, produit.prix) && Objects.equals(disponible, produit.disponible) && ville == produit.ville && service == produit.service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Libelé, codeProduit, prix, disponible, nombreDePieces, ville, service);
    }
}
