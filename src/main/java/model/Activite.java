package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activite")
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "duree_execution")
    private double dureeExecution;
    @Column(name = "date_demarrage")
    private Date dateDemarrage;
    @Column(name = "date_fin_effective")
    private Date dateFinEffective;
    @Column(name = "budget_alloue")
    private double budgetAlloue;

    @ManyToOne
    @JoinColumn(name = "id_programme")
    private Programme programme;

    // Constructeurs, getters et setters


    public Activite() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getDureeExecution() {
        return dureeExecution;
    }

    public void setDureeExecution(double dureeExecution) {
        this.dureeExecution = dureeExecution;
    }

    public Date getDateDemarrage() {
        return dateDemarrage;
    }

    public void setDateDemarrage(Date dateDemarrage) {
        this.dateDemarrage = dateDemarrage;
    }

    public Date getDateFinEffective() {
        return dateFinEffective;
    }

    public void setDateFinEffective(Date dateFinEffective) {
        this.dateFinEffective = dateFinEffective;
    }

    public double getBudgetAlloue() {
        return budgetAlloue;
    }

    public void setBudgetAlloue(double budgetAlloue) {
        this.budgetAlloue = budgetAlloue;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
}
