/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.GUI;

import BestDeal.DAO.ClientDAO;
import BestDeal.entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hamdi
 */
public class TableClientModele extends AbstractTableModel {

    List<Client> liste_client = new ArrayList<>();
    String[] header = {"Id_Client", "Cin_Client", "Nom_Client", "Prenom_Client", "Mot_De_Passe_Client", "Adresse_Client", "Code_Postal_Client", "Ville_Client", "Date_Naissance_Client", "Email_Client", "Statut_Compte_Client"};

    public TableClientModele() {
        liste_client = new ClientDAO().DisplayAllClients();
    }

    @Override
    public int getRowCount() {
        return liste_client.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return liste_client.get(rowIndex).getId_Client();
            case 1:
                return liste_client.get(rowIndex).getCin_Client();
            case 2:
                return liste_client.get(rowIndex).getNom_Client();
            case 3:
                return liste_client.get(rowIndex).getPrenom_Client();
            case 4:
                return liste_client.get(rowIndex).getMot_De_Passe_Client();
            case 5:
                return liste_client.get(rowIndex).getAdresse_Client();
            case 6:
                return liste_client.get(rowIndex).getCode_Postal_Client();
            case 7:
                return liste_client.get(rowIndex).getVille_Client();
            case 8:
                return liste_client.get(rowIndex).getDate_Naissance_Client();
            case 9:
                return liste_client.get(rowIndex).getEmail_Client();
            case 10:
                return liste_client.get(rowIndex).isStatut_Compte_Client();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

}
