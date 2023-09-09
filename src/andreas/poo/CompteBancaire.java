package andreas.poo;

public class CompteBancaire {
    private String numeroDeCompte;
    Double solde;
    Boolean estADecouvert;
    Double decouvertAutorise;

    public CompteBancaire() {
    }

    public CompteBancaire(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public CompteBancaire(String numeroDeCompte, Double solde, Boolean estADecouvert, Double decouvertAutorise) {
        this.numeroDeCompte = numeroDeCompte;
        this.solde = solde;
        this.estADecouvert = estADecouvert;
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Boolean getEstADecouvert() {
        return estADecouvert;
    }

    public void setEstADecouvert(Boolean estADecouvert) {
        this.estADecouvert = estADecouvert;
    }

    public Double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(Double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }
}
