/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

import java.util.Date;

/**
 *
 * @author Medoune Law
 */
public class Inscription {
     private Date date;
     private int anneeScolaire;
     //ManyToOne
     private Etudiant etudiant;
     private Classe classe;
     //Constructeur
     public Inscription() {
         
     }
     //Getters

    public Date getDate() {
        return date;
    }

    public int getAnneeScolaire() {
        return anneeScolaire;
    }
     //Setters

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAnneeScolaire(int anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }
    
}
