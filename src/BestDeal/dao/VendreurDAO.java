/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import BestDeal.entities.*;
import BestDeal.util.MyConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class VendreurDAO {
    
    
     public void insertVendeur(Vendeur v){
           // DepotDAO depdao=new DepotDAO();

         String requete = "INSERT INTO vendreur(nom_vendreur, logo_vendreur, adresse_vendreur, telephone_vendreur, mail_vendreur, respensable_vendreur)values (?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, v.getNom_Vendeur());
            ps.setString(2, v.getImage_Vendeur());
            ps.setString(3,v.getAdresse_Vendeur());
            ps.setInt(4,v.getTelephone_Vendeur());
            ps.setString(5,v.getEmail_Vendeur());
            ps.setString(6,v.getResponsable());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     
     public void updateVendeur(Vendeur v){
        String requete = "UPDATE vendreur SET ,nom_vendreur=?,logo_vendreur=?,adresse_vendreur=?,telephone_vendreur=?,mail_vendreur=?,respensable_vendreur=? where id_vendreur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, v.getNom_Vendeur());
            ps.setString(2, v.getImage_Vendeur());
            ps.setString(3,v.getAdresse_Vendeur());
            ps.setInt(4,v.getTelephone_Vendeur());
            ps.setString(5,v.getEmail_Vendeur());
            ps.setString(6,v.getResponsable());
            ps.setInt(7, v.getId_Vendeur());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
     
      public void deleteVendeur(int num){

          String requete = "DELETE FROM vendreur WHERE id_vendreur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
      
         public Vendeur findVendeurByNum(int num){

        String requete = "select * from vendreur WHERE id_vendreur=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, num);
        ResultSet resultat = ps.executeQuery();
        //DepotDAO depotDAO = new DepotDAO();
        Vendeur vendreur = new Vendeur();
        while (resultat.next()){

            vendreur.setId_Vendeur(resultat.getInt(1));
            vendreur.setNom_Vendeur(resultat.getString(2));
            vendreur.setImage_Vendeur(resultat.getString(3));
            vendreur.setAdresse_Vendeur(resultat.getString(4));
            vendreur.setTelephone_Vendeur(resultat.getInt(5));
            vendreur.setEmail_Vendeur(resultat.getString(6));
            vendreur.setResponsable(resultat.getString(7));
            //vendreur.setDepot(depotDAO.findDepotById(resultat.getInt(4)));
        }
        return vendreur;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
         
    public List<Vendeur> DisplayAllVendeur (){


        List<Vendeur> listevendeur = new ArrayList<Vendeur>();

        String requete = "select * from vendreur";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
           ResultSet resultat = statement.executeQuery(requete);
           //DepotDAO depotDAO = new DepotDAO();
           
            while(resultat.next()){
                Vendeur vendreur = new Vendeur();
                vendreur.setId_Vendeur(resultat.getInt(1));
                vendreur.setNom_Vendeur(resultat.getString(2));
                vendreur.setImage_Vendeur(resultat.getString(3));
                vendreur.setAdresse_Vendeur(resultat.getString(4));
                vendreur.setTelephone_Vendeur(resultat.getInt(5));
                vendreur.setEmail_Vendeur(resultat.getString(6));
                vendreur.setResponsable(resultat.getString(7));
                listevendeur.add(vendreur);
            }
            return listevendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
}
