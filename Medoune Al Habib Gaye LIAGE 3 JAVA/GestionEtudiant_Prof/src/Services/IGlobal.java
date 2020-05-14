/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Modeles.Classe;
import Modeles.Detail;
import Modeles.Etudiant;
import Modeles.Inscription;
import Modeles.Personne;
import Modeles.Professeur;
import java.util.ArrayList;
/**
 *
 * @author Medoune Law
 */
public interface IGlobal {
    public boolean Inscrire();
    public int AddEtudiant (Etudiant et);
    public ArrayList<Etudiant> listerEtudiant();
    public Etudiant rechercheEtudiantById(int idEtudiant);
    public boolean AddClasse(Classe c);
    public ArrayList<Classe> listerClasse();
    public Classe rechercherClasseByLibelle(String libelle);
    public int AddProfesseur(Professeur prof);
    public boolean AffecterClasseProfesseur();
    public Professeur rechercherProfesseur(String numeroProfesseur);
    public ArrayList<Professeur> listerProfesseur();
    public Professeur rechercherProfesseurById(int Idprofesseur);
    
}
