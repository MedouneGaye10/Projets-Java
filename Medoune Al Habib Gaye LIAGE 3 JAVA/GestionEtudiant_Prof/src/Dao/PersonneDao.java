/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modeles.Classe;
import Modeles.Detail;
import Modeles. Etudiant;
import Modeles.Inscription;
import Modeles.Personne;
import Modeles.Professeur;

/**
 *
 * @author hp
 */
public class PersonneDao implements IDao<Personne> {
  private final String SQL_ALL="Select * From personne ";
  private final String SQL_INSERT="INSERT INTO `compte` (`id`, `nom`, `prenom`, `datenaiss`, `numero`, `type`, `tuteur`, `grade`) VALUES ( NULL, ?, ?, ?, ?, ?, ?, ?);";
    
    private MysqlDB mysql;
    private PersonneDao daoPersonne;
    public PersonneDao() {
        mysql=new MysqlDB();
        daoPersonne=new PersonneDao();
    }
    @Override
    public int create(Personne obj) {
        
       int result=0;
        try {
              mysql.initPS(SQL_INSERT);
              mysql.getPstm().setInt(1, obj.getId());
              mysql.getPstm().setString(2, obj.getNom());
               mysql.getPstm().setString(3, obj.getPrenom());
              mysql.getPstm().setDate(4, null);
              mysql.getPstm().setDouble(5,obj.getNumero());
              mysql.getPstm().setString(6,null);
            mysql.getPstm().setString(7,null);
            mysql.getPstm().setString(8,null);
        
             //5 Execution de la requete
              result=mysql.executeMaj();
             
        } catch (SQLException ex) {
            Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
        
        
    }

    @Override
    public boolean update(Personne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Personne> selectAll() {
            ArrayList<Personne> comptes=null;
                try {
                    comptes=new ArrayList<Personne>(); 
            //PreparedStatement ps = cnx.prepareStatement(requete);
            mysql.initPS(SQL_ALL);
            ResultSet rs = mysql.executeSelect();
            while(rs.next()){
                Personne personne=null ;
                
                personne.setId(rs.getInt("id"));
                personne.setNom(rs.getString("nom"));
                personne.setPrenom(rs.getString("prenom"));
                 personne.setDateNaiss(null);
                personne.setNumero(rs.getString("numero"));
                personne.setType(rs.getString("type"));
                 personne.setTuteur(rs.getString("tuteur"));
                personne.setGrade(rs.getString("grade"));
                int id=rs.getInt("idPersonne");
                personne.setPersonne(daoPersonne.selectById(id));
                comptes.add(personne);
                
               
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return comptes;

        
    }

    @Override
    public Personne selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne selectByNumero(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Personne> selectCompteByClient(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
