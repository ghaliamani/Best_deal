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
public class CategorieDAO {
    
    public void insertCategorie(Categorie c){
           // DepotDAO depdao=new DepotDAO();

         String requete = "INSERT INTO categorie(id_vendreur, nom_categorie, libele_categorie)values (?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getVendeur().getId_Vendeur());
            ps.setString(2, c.getNom_Categorie());
            ps.setString(3,c.getLibelle_Categorie());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     
     public void updateCategorie(Categorie c){
        String requete = "UPDATE categorie SET id_vendreur=?,nom_categorie=?,libele_categorie=? WHERE id_categorie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getVendeur().getId_Vendeur());
            ps.setString(2, c.getNom_Categorie());
            ps.setString(3,c.getLibelle_Categorie());
            ps.setInt(4, c.getId_Categorie());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
     
      public void deleteCategorie(int num){

          String requete = "DELETE FROM categorie WHERE id_categorie=?";
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
      
         public Categorie findCategorieByNum(int num){

        String requete = "select * from categorie WHERE id_categorie=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, num);
        ResultSet resultat = ps.executeQuery();
        //DepotDAO depotDAO = new DepotDAO();
        VendreurDAO vendeurDAO = new VendreurDAO();
        
        Categorie categorie = new Categorie();
        while (resultat.next()){
            
            categorie.setId_Categorie(resultat.getInt(1));
            categorie.setVendeur(vendeurDAO.findVendeurByNum(resultat.getInt(2)));
            categorie.setNom_Categorie(resultat.getString(3));
            categorie.setLibelle_Categorie(resultat.getString(4));
        }
        return categorie;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
         
    public List<Categorie> DisplayAllCategorie (){


        List<Categorie> listecategorie = new ArrayList<Categorie>();

        String requete = "select * from categorie";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
           ResultSet resultat = statement.executeQuery(requete);
           
           VendreurDAO vendeurDAO = new VendreurDAO();
            while(resultat.next()){
                Categorie categorie = new Categorie();
                categorie.setId_Categorie(resultat.getInt(1));
                categorie.setVendeur(vendeurDAO.findVendeurByNum(resultat.getInt(2)));
                categorie.setNom_Categorie(resultat.getString(3));
                categorie.setLibelle_Categorie(resultat.getString(4));
                listecategorie.add(categorie);
            }
            return listecategorie;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
}
