/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeles;

/**
 *
 * @author Medoune Law
 */
public class Detail {
    private int anneeScolaire;
    //OneToMany
    private Professeur [] professeurs;
    private Classe [] classes;
    //Constructeur
    public Detail() {
        
    }
    //Getters

    public int getAnneeScolaire() {
        return anneeScolaire;
    }
    //Setters

    public void setAnneeScolaire(int anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }
    
}
