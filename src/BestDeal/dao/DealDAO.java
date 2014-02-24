
package BestDeal.dao;

import BestDeal.entities.Deal;
import BestDeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class DealDAO {
    
 public void insertDeal(Deal de){
     
     String requete = "insert into deals (id_categorie,Nom_deal,Description_deal,Description_detaille_,image_deal,prix_de_vente_deal,prix_original_deal,Date_publication_deal,Date_expiration_deal,Condition_de_vente_deal,Quantite_deal,nbr_max_par_reservation_deal) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
           
            ps.setInt(1, de.getCategorie().getId_Categorie());
            ps.setString(2,de.getNom_Deal());
            ps.setString(3,de.getDescription_Deal());
            ps.setString(4,de.getDescription_Detaillé_Deal());
            ps.setString(5,de.getImage_Deal());
            ps.setDouble(6, de.getPrix_De_Vente_Deal());
            ps.setDouble(7, de.getPrix_Original_Deal());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(dateFormat.format(de.getDate_Publication_Deal()));
            ps.setString(8,dateFormat.format(de.getDate_Publication_Deal()));
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(dateFormat2.format(de.getDate_Expiration_Deal()));
            ps.setString(9,dateFormat.format(de.getDate_Expiration_Deal()));
            ps.setString(10,de.getCondition_De_Vente_Deal());
            ps.setInt(11, de.getQuantite_Deal());
            ps.setInt(12, de.getNbr_Max_Reservation_Deal());
             
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
 
 
 
   public void updateDeal(Deal de){
        String requete = "update deals set id_categorie=?,Nom_deal=?,Description_deal=?,Description_detaille_=?,image_deal=?,prix_de_vente_deal=?,prix_original_deal=?,Date_publication_deal=?,Date_expiration_deal=?,Condition_de_vente_deal=?,Quantite_deal=?,nbr_max_par_reservation_deal=? where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setInt(1, de.getCategorie().getId_Categorie());
            ps.setString(2,de.getNom_Deal());
            ps.setString(3,de.getDescription_Deal());
            ps.setString(4,de.getDescription_Detaillé_Deal());
            ps.setString(5,de.getImage_Deal());
            ps.setDouble(6, de.getPrix_De_Vente_Deal());
            ps.setDouble(7, de.getPrix_Original_Deal());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(dateFormat.format(de.getDate_Publication_Deal()));
            ps.setString(8,dateFormat.format(de.getDate_Publication_Deal()));
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(dateFormat2.format(de.getDate_Expiration_Deal()));
            ps.setString(9,dateFormat.format(de.getDate_Expiration_Deal()));
            ps.setString(10,de.getCondition_De_Vente_Deal());
            ps.setInt(11, de.getQuantite_Deal());
            ps.setInt(12, de.getNbr_Max_Reservation_Deal());
             
            ps.setInt(13, de.getId_Deal());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
   
      public void deleteDeal(int num){

          String requete = "delete from deals where id_deal=?";
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
   
      
     public Deal findDealById(int id){
     
        Deal deal = new Deal();
        CategorieDAO categorieDAO = new CategorieDAO();
        String requete = "select * from deals where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {

                
                deal.setId_Deal(resultat.getInt(1));                
                deal.setCategorie(categorieDAO.findCategorieByNum(resultat.getInt(2)));
                deal.setNom_Deal(resultat.getString(3));
                deal.setDescription_Deal(resultat.getString(4));
                deal.setDescription_Detaillé_Deal(resultat.getString(5));
                deal.setImage_Deal(resultat.getString(6));
                deal.setPrix_De_Vente_Deal(resultat.getDouble(7));
                deal.setPrix_Original_Deal(resultat.getDouble(8));
                deal.setDate_Publication_Deal(resultat.getDate(9));
                deal.setDate_Expiration_Deal(resultat.getDate(10));
                deal.setCondition_De_Vente_Deal(resultat.getString(11));
                deal.setQuantite_Deal(resultat.getInt(12));
                deal.setNbr_Max_Reservation_Deal(resultat.getInt(13));

            }
            return deal;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
      public List<Deal> DisplayAllDeal (){


        List<Deal> listedeal = new ArrayList<Deal>();

        String requete = "select * from deals";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
           ResultSet resultat = statement.executeQuery(requete);
           //DepotDAO depotDAO = new DepotDAO();
           CategorieDAO categorieDAO = new CategorieDAO();
            while(resultat.next()){
                Deal deal = new Deal();
                deal.setId_Deal(resultat.getInt(1));                
                deal.setCategorie(categorieDAO.findCategorieByNum(resultat.getInt(2)));
                deal.setNom_Deal(resultat.getString(3));
                deal.setDescription_Deal(resultat.getString(4));
                deal.setDescription_Detaillé_Deal(resultat.getString(5));
                deal.setImage_Deal(resultat.getString(6));
                deal.setPrix_De_Vente_Deal(resultat.getDouble(7));
                deal.setPrix_Original_Deal(resultat.getDouble(8));
                deal.setDate_Publication_Deal(resultat.getDate(9));
                deal.setDate_Expiration_Deal(resultat.getDate(10));
                deal.setCondition_De_Vente_Deal(resultat.getString(11));
                deal.setQuantite_Deal(resultat.getInt(12));
                deal.setNbr_Max_Reservation_Deal(resultat.getInt(13));
                listedeal.add(deal);
            }
            return listedeal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
      
 }





