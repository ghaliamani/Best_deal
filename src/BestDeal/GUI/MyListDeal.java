/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.GUI;

import BestDeal.dao.CategorieDAO;
import BestDeal.dao.DealDAO;
import javax.swing.table.AbstractTableModel;
import BestDeal.entities.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class MyListDeal extends AbstractTableModel{

   List<Deal> listdeal = new ArrayList<Deal>();
    String []header = {"id","Catégorie","Nom","Description","Image","Prix de vente", "Prix Original","Date publication", "Date Expiration","Quantité"};

    public MyListDeal() {
        listdeal= new DealDAO().DisplayAllDeal();
    }
    
   @Override
    public int getRowCount() { 
        return listdeal.size();
    }

   @Override
    public int getColumnCount() { //nombre de colonnes de la table
        return 10;
    }
   @Override
     public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return listdeal.get(rowIndex).getId_Deal();
            case 1://colonne type_vetement
                return listdeal.get(rowIndex).getCategorie().getNom_Categorie();
            case 2://colonne quantité
                return listdeal.get(rowIndex).getNom_Deal();
            case 3://colonne adresse depot
                return listdeal.get(rowIndex).getDescription_Deal();
            case 4://colonne adresse depot
                return listdeal.get(rowIndex).getImage_Deal();
            case 5://colonne adresse depot
                return listdeal.get(rowIndex).getPrix_De_Vente_Deal();
            case 6://colonne adresse depot
                return listdeal.get(rowIndex).getPrix_Original_Deal();
            case 7://colonne adresse depot
                return listdeal.get(rowIndex).getDate_Publication_Deal();
            case 8://colonne adresse depot
                return listdeal.get(rowIndex).getDate_Expiration_Deal();
            case 9://colonne adresse depot
                return listdeal.get(rowIndex).getQuantite_Deal();
            default:
                return null;
        }
    }
     
     @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}
