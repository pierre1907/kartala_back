package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employe")
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "fonction")
    private String fonction;
    @Column(name = "date_embauche")
    private Date dateEmbauche;
    @Column(name = "date_fin_contrat")
    private Date dateFinContrat;
    @Column(name = "age")
    private int age;
    @Column(name = "sexe")
    private boolean sexe; // true pour masculin, false pour féminin
    @Column(name = "statut_matrimonial")
    private String statutMatrimonial;
    @Column(name = "niveau_education")
    private String niveauEducation;

    @ManyToMany(mappedBy = "employes")
    private Set<Programme> programmes = new HashSet<>();

    // Constructeurs, getters et setters


    public Employe() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public String getStatutMatrimonial() {
        return statutMatrimonial;
    }

    public void setStatutMatrimonial(String statutMatrimonial) {
        this.statutMatrimonial = statutMatrimonial;
    }

    public String getNiveauEducation() {
        return niveauEducation;
    }

    public void setNiveauEducation(String niveauEducation) {
        this.niveauEducation = niveauEducation;
    }

    public Set<Programme> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(Set<Programme> programmes) {
        this.programmes = programmes;
    }
}
