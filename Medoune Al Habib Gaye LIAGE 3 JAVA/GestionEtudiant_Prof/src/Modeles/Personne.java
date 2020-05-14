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
public abstract class Personne {
    private int id;
    private static int cpt; //
    protected String nom;
    protected String prenom;
    protected Date dateNaiss;
    protected String numero;
    //Constructeur
    public Personne() {
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

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public String getNumero() {
        return numero;
    }
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public static void setCpt(int cpt) {
        Personne.cpt = cpt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    //ToString
    @Override
    public String toString() {
        return "Personne(" + "nom=" + nom + ", prenom" + prenom + ", dateNaiss=" + dateNaiss + ')';
    }
    protected void attrivuteNumero (String debut) {
        String id= Integer.toString(this.getId());
        numero = debut + "0" +id;
    }
    }

