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
public class Classe {
    private int id;
    private static int cpt;
    private String libelle;
    //OneToMany
    private Inscription [] inscriptions;
    //ManyToOne
    private Detail details;
    //Constructeur
     public Classe() {
        cpt++;
        id=cpt;
    }
     //Getters

    public int getId() {
        return id;
    }

    public static int getCpt() {
        return cpt;
    }

    public String getLibelle() {
        return libelle;
    }
    //Setters

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    //ToString
   @Override
   public String toString() {
    return "Classe(" + "libelle=" + libelle + ')';
   }
 }
     
    
