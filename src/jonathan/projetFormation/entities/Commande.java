package jonathan.projetFormation.entities;

import java.util.Objects;

public class Commande {
    private  String client;
    private String produit;
    private Double quantiteProduit;
    private String numeroCommande;
    private String dateCommande;

    public Commande() {
    }

    public Commande(String client, String produit, Double quantiteProduit, String numeroCommande, String dateCommande) {
        this.client = client;
        this.produit = produit;
        this.quantiteProduit = quantiteProduit;
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public Double getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(Double quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public String getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(String numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "client='" + client + '\'' +
                ", produit='" + produit + '\'' +
                ", quantiteProduit='" + quantiteProduit + '\'' +
                ", numeroCommande='" + numeroCommande + '\'' +
                ", dateCommande='" + dateCommande + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(client, commande.client) && Objects.equals(produit, commande.produit) && Objects.equals(quantiteProduit, commande.quantiteProduit) && Objects.equals(numeroCommande, commande.numeroCommande) && Objects.equals(dateCommande, commande.dateCommande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, produit, quantiteProduit, numeroCommande, dateCommande);
    }
}
