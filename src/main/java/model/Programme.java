package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "programme")
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String commanditaire;
    private String duree;
    private Date dateDemarrage;
    private Date dateFinEffective;
    private double budgetGlobal;

    private String nomPrenomResponsable;

    @ManyToOne
    @JoinColumn(name = "id_pole")
    private Pole pole;

    @ManyToOne
    @JoinColumn(name = "id_employe")
    private Employe responsable;

    // Constructeurs, getters et setters

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

    public String getCommanditaire() {
        return commanditaire;
    }

    public void setCommanditaire(String commanditaire) {
        this.commanditaire = commanditaire;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
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

    public double getBudgetGlobal() {
        return budgetGlobal;
    }

    public void setBudgetGlobal(double budgetGlobal) {
        this.budgetGlobal = budgetGlobal;
    }

    public String getNomPrenomResponsable() {
        return nomPrenomResponsable;
    }

    public void setNomPrenomResponsable(String nomPrenomResponsable) {
        this.nomPrenomResponsable = nomPrenomResponsable;
    }

    public Pole getPole() {
        return pole;
    }

    public void setPole(Pole pole) {
        this.pole = pole;
    }
}
