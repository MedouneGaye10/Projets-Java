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
public class Professeur extends Personne{
    private int id;
    private String grade;
    //ManyToOne
    private Detail details;
    //Constructeur

    public Professeur() {
       super();
       this.attributeNumero("Prof");
    }
    //Getters
    public String getGrade() {
        return grade;
    }

    //Setters

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //ToString
  @Override
    public String toString() {
        return super.toString()+ "grade=" + grade + ')';
    }
    protected void SetDateNaiss (int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void attributeNumero(String prof) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
