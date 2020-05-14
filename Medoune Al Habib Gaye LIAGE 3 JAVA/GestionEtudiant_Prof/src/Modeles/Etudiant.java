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
public class Etudiant extends Personne{
    private int id;
    //private static int cpt;
    private String tuteur;
    //ONeToMany
    private Inscription [] inscription;

    //Constructeur
public Etudiant() {
    super();
    this.attributeNumero("ET");
}   
    //Getters

    public String getTuteur() {
        return tuteur;
    }
   //Setters

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    //ToString
  @Override
    public String toString() {
        return super.toString()+ "tuteur=" + tuteur + ')';
    }
    protected void SetDateNaiss (int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     protected void SetDateNaiss (String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void attributeNumero(String et) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
