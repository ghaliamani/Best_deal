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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hamdi
 */
public class ClientDAO {

    public void insertClient(Client c) {

        String requete = "Insert into Client (id_client,cin_client,nom_client,prenom_client,motdepasse_client,adresse_client,Codepostal_client,Ville_client,datenaissance_client,email_client,Statut_compte_client) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getId_Client());
            ps.setInt(2, c.getCin_Client());
            ps.setString(3, c.getNom_Client());
            ps.setString(4, c.getPrenom_Client());
            ps.setString(5, c.getMot_De_Passe_Client());
            ps.setString(6, c.getAdresse_Client());
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

    public List<Client> DisplayAllClients() {
        List<Client> clientlist = new ArrayList<>();
        String requete = "Select * from client";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Client cli = new Client();
                cli.setId_Client(resultat.getInt(1));
                cli.setCin_Client(resultat.getInt(2));
                cli.setNom_Client(resultat.getString(3));
                cli.setPrenom_Client(resultat.getString(4));
                cli.setMot_De_Passe_Client(resultat.getString(5));
                cli.setAdresse_Client(resultat.getString(6));
                cli.setCode_Postal_Client(resultat.getInt(7));
                cli.setVille_Client(resultat.getString(8));
                cli.setDate_Naissance_Client(resultat.getDate(9));
                cli.setEmail_Client(resultat.getString(10));
                cli.setStatut_Compte_Client(resultat.getBoolean(11));
                clientlist.add(cli);
            }
            return clientlist;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la liste des clients " + ex.getMessage());
            return null;
        }
    }

}
