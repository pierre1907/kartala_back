package controller;

import exception.ressourceNotFound;
import model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.EmployeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeController {

    @Autowired
    private EmployeRepository employeRepository;

    // Lister tous les employés de la base de données
    @GetMapping("/employes")
    public List<Employe> getAllEmployes(){
        return employeRepository.findAll();
    }




}
