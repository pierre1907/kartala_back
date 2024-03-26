package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pole")
public class Pole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Employe> employes;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employe> getEmployees() {
        return employes;
    }

    public void setEmployees(Set<Employe> employes) {
        this.employes = employes;
    }
}
