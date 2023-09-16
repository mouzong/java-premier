package ferry.files;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class User {

    private String nomComplet;

    private String telephone;

    private String mail;

    private LocalDate dateDeNaissance;

    private LocalDateTime dateEnregistrement;


    public User(){this.dateEnregistrement = LocalDateTime.now();}


    public User(String nomComplet, String telephone, String mail, LocalDate dateDeNaissance){
        this.nomComplet = nomComplet;
        this.telephone = telephone;
        this.mail = mail;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEnregistrement = LocalDateTime.now();
    }

    public String getNomComplet(){return nomComplet;}

    public void setNomComplet(String nomComplet) { this.nomComplet = nomComplet; }

    public String getTelephone() { return telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }

    public LocalDate getDateDeNaissance() { return dateDeNaissance; }

    public void setDateDeNaissance(LocalDate dateDeNaissance) { this.dateDeNaissance = dateDeNaissance; }

    public LocalDateTime getDateEnregistrement() { return dateEnregistrement; }

    public void setDateEnregistrement(LocalDateTime dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nomComplet, user.nomComplet) && Objects.equals(telephone, user.telephone) && Objects.equals(mail, user.mail) && Objects.equals(dateDeNaissance, user.dateDeNaissance) && Objects.equals(dateEnregistrement, user.dateEnregistrement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, telephone, mail, dateDeNaissance, dateEnregistrement);

    }

    @Override
    public String toString() {
        return "User {" +
                "\n\t nomComplet : ' " + nomComplet + '\'' +
                ", \n\t telephone : ' " + telephone + '\'' +
                ",  \n\t mail : ' " + mail + '\'' +
                ",  \n\t dateDeNaissance : ' " + dateDeNaissance +
                ",\n\t dateEnregistrement : " + dateEnregistrement +
                "\n\t }";
    }
}
