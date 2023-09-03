package jonathan.projetFormation.entities;

import java.util.Objects;

public class Facture {
    private String numeroCommande;
    private String montantFacture;
    private String modePaiement;
    private String dateFacturation;

    public Facture() {
    }

    public Facture(String numeroCommande, String montantFacture, String modePaiement, String dateFacturation) {
        this.numeroCommande = numeroCommande;
        this.montantFacture = montantFacture;
        this.modePaiement = modePaiement;
        this.dateFacturation = dateFacturation;
    }

    public String getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(String numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(String montantFacture) {
        this.montantFacture = montantFacture;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getDateFacturation() {
        return dateFacturation;
    }

    public void setDateFacturation(String dateFacturation) {
        this.dateFacturation = dateFacturation;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "numeroCommande='" + numeroCommande + '\'' +
                ", montantFacture='" + montantFacture + '\'' +
                ", modePaiement='" + modePaiement + '\'' +
                ", dateFacturation='" + dateFacturation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facture facture = (Facture) o;
        return Objects.equals(numeroCommande, facture.numeroCommande) && Objects.equals(montantFacture, facture.montantFacture) && Objects.equals(modePaiement, facture.modePaiement) && Objects.equals(dateFacturation, facture.dateFacturation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCommande, montantFacture, modePaiement, dateFacturation);
    }
}
