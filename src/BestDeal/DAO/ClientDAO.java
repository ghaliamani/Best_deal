/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.DAO;

import BestDeal.entities.Client;
import BestDeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hamdi
 */
public class ClientDAO {

    public void insertClient(Client c) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String requete = "Insert into Client (cin_client,nom_client,prenom_client,motdepasse_client,adresse_client,Codepostal_client,Ville_client,date_naissance_client,email_client,Statut_compte_client) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getCin_Client());
            ps.setString(2, c.getNom_Client());
            ps.setString(3, c.getPrenom_Client());
            ps.setString(4, c.getMot_De_Passe_Client());
            ps.setString(5, c.getAdresse_Client());
            ps.setInt(6, c.getCode_Postal_Client());
            ps.setString(7, c.getVille_Client());
            ps.setString(8, dateFormat.format(c.getDate_Naissance_Client()));
            ps.setString(9, c.getEmail_Client());
            ps.setBoolean(10, c.isStatut_Compte_Client());
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

    public Client findClientByCin(int cin) {
        Client cl = new Client();
        String requete = "select * from client where cin_client = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, cin);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                cl.setId_Client(resultat.getInt(1));
                cl.setCin_Client(resultat.getInt(2));
                cl.setNom_Client(resultat.getString(3));
                cl.setPrenom_Client(resultat.getString(4));
                cl.setMot_De_Passe_Client(resultat.getString(5));
                cl.setAdresse_Client(resultat.getString(6));
                cl.setCode_Postal_Client(resultat.getInt(7));
                cl.setVille_Client(resultat.getString(8));
                cl.setDate_Naissance_Client(resultat.getDate(9));
                cl.setEmail_Client(resultat.getString(10));
                cl.setStatut_Compte_Client(resultat.getBoolean(11));
                System.out.println(cl.toString());
            }
            return cl;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client " + ex.getMessage());
            return null;
        }
    }
      

    public void BloquerClient(Client cl) {
        String requete = "update client set Statut_compte_client=? where cin_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, cl.getCin_Client());
            ps.setBoolean(2,cl.isStatut_Compte_Client());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
}

