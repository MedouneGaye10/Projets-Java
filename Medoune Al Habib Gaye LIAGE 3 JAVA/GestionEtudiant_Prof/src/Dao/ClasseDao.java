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
public class ClasseDao implements IDao<Classe> {
     private final String SQL_BY_ID="Select * From classe";
    private final String SQL_INSERT="INSERT INTO `classe` (`id`, `libelle`) VALUES (NULL, ?)";
    
    private MysqlDB mysql;

    public ClasseDao() {
        mysql=new MysqlDB();
    }
    
    
    @Override
    public int create(Classe obj) {
        int result=0;
        try {
              mysql.initPS(SQL_INSERT);
              mysql.getPstm().setInt(1, obj.getId());
              mysql.getPstm().setString(2, obj.getLibelle());
             //5 Execution de la requete
              mysql.executeMaj();
              //REturn ID client ID
              ResultSet rs=mysql.getPstm().getGeneratedKeys();
              if(rs.first())  result=rs.getInt(1);
             
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public boolean update(Classe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Classe> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classe selectById(int id) {
        try {
            //PreparedStatement ps = cnx.prepareStatement(requete);
            mysql.initPS(SQL_BY_ID);
            //ps.setString(1, numero);
            mysql.getPstm().setInt(1, id);
            ResultSet rs = mysql.executeSelect();
            if(rs.first()){
                Classe cl = new Classe();
                cl.setId(rs.getInt("id"));
                cl.setLibelle(rs.getString("libelle"));
                
                return cl;
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Classe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public Classe selectByNumero(String numero) {
        try {
            //PreparedStatement ps = cnx.prepareStatement(requete);
            mysql.initPS(SQL_BY_ID);
            //ps.setString(1, numero);
            mysql.getPstm().setString(1, numero);
            ResultSet rs = mysql.executeSelect();
            if(rs.first()){
                Classe cl = new Classe();
                cl.setId(rs.getInt("id"));
                cl.setLibelle(rs.getString("libelle"));
           
                return cl;
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
