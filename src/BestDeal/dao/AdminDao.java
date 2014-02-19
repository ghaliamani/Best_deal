/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.dao;
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
public class AdminDao {
     public void verif_admin(String  login){

 
   Admin admin = new Admin();
     String requete = "select * from admin where login = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setLogin_Admin(resultat.getString(2));
                System.out.println("testttttttt"+admin.getLogin_Admin());
                admin.setMot_De_Passe_Admin(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
         

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur  "+ex.getMessage());
            
        }
    }

    
    
    
    
    
    
    
    
}
