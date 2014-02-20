/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.DAO;

import BestDeal.entities.Admin;
import BestDeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lovely
 */
public class AdminDAO {
 
     public static boolean verif_admin(String  login ,String mdp){

 
   Admin admin = new Admin();
     String requete = "select * from admin where Login=? and Motdepasse=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2, mdp);
            ResultSet resultat = ps.executeQuery();
           if (resultat.next())
               return true;
           else return false;
        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur  "+ex.getMessage()); return false;
            
        }
    }

    
    
    
    
    
    
    
    
}


