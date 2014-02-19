/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.DAO;

import BestDeal.entities.Client;
import BestDeal.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hamdi
 */
public class ClientDAO {

    public void insertClient(Client c) {

        String requete = "Insert into Client (cin_client,nom_client,prenom_client,motdepasse_client,adresse_client,Codepostal_client,ville_client,datenaissance_client,email_client,statu_compte_client) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getCin_Client());
            ps.setString(2, c.getNom_Client());
            ps.setString(3, c.getPrenom_Client());
            ps.setString(4, c.getMot_De_Passe_Client());
            ps.setString(5, c.getAdresse_Client());
            ps.setInt(7, c.getCode_Postal_Client());
            ps.setString(8, c.getVille_Client());
            ps.setDate(9, (Date) c.getDate_Naissance_Client());
            ps.setString(10, c.getEmail_Client());
            ps.setBoolean(11, c.isStatut_Compte_Client());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

}
