package jonathan.file;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Utilisateur {
    private String nomComplet;
    private String telephone;
    private String mail;
    private LocalDate dateDeNaissance;
    private LocalDateTime dateEnregistrement;

    public Utilisateur(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Utilisateur(String nomComplet, String telephone, String mail, LocalDate dateDeNaissance, LocalDateTime dateEnregistrement) {
        this.nomComplet = nomComplet;
        this.telephone = telephone;
        this.mail = mail;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEnregistrement = dateEnregistrement;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDateTime getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(LocalDateTime dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(nomComplet, that.nomComplet) && Objects.equals(telephone, that.telephone) && Objects.equals(mail, that.mail) && Objects.equals(dateDeNaissance, that.dateDeNaissance) && Objects.equals(dateEnregistrement, that.dateEnregistrement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, telephone, mail, dateDeNaissance, dateEnregistrement);
    }

    @Override
    public String toString() {
        return "User {" +
                "\n\t nomComplet : '" + nomComplet + '\'' +
                ", \n\t telephone : '" + telephone + '\'' +
                ", \n\t mail : '" + mail + '\'' +
                ",  \n\t dateDeNaissance : " + dateDeNaissance +
                ", \n\t dateEnregistrement : " + dateEnregistrement +
                "\n\t }";
    }
}
