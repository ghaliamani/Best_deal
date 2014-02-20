/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hamdi
 */
public class Client {

    private int Id_Client;
    private int Cin_Client;
    private String Nom_Client;
    private String Prenom_Client;
    private String Mot_De_Passe_Client;
    private String Adresse_Client;
    private int Code_Postal_Client;
    private String Ville_Client;
    private Date Date_Naissance_Client;
    private String Email_Client;
    private boolean Statut_Compte_Client;

    public Client() {
    }

    public Client(int Cin_Client, String Nom_Client, String Prenom_Client, String Mot_De_Passe_Client, String Adresse_Client, int Code_Postal_Client, String Ville_Client, Date Date_Naissance_Client, String Email_Client, boolean Statut_Compte_Client) {
        this.Cin_Client = Cin_Client;
        this.Nom_Client = Nom_Client;
        this.Prenom_Client = Prenom_Client;
        this.Mot_De_Passe_Client = Mot_De_Passe_Client;
        this.Adresse_Client = Adresse_Client;
        this.Code_Postal_Client = Code_Postal_Client;
        this.Ville_Client = Ville_Client;
        this.Date_Naissance_Client = Date_Naissance_Client;
        this.Email_Client = Email_Client;
        this.Statut_Compte_Client = Statut_Compte_Client;
    }

    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }
    
    public int getId_Client() {
        return Id_Client;
    }

    public int getCin_Client() {
        return Cin_Client;
    }

    public void setCin_Client(int Cin_Client) {
        this.Cin_Client = Cin_Client;
    }

    public String getNom_Client() {
        return Nom_Client;
    }

    public void setNom_Client(String Nom_Client) {
        this.Nom_Client = Nom_Client;
    }

    public String getPrenom_Client() {
        return Prenom_Client;
    }

    public void setPrenom_Client(String Prenom_Client) {
        this.Prenom_Client = Prenom_Client;
    }

    public String getMot_De_Passe_Client() {
        return Mot_De_Passe_Client;
    }

    public void setMot_De_Passe_Client(String Mot_De_Passe_Client) {
        this.Mot_De_Passe_Client = Mot_De_Passe_Client;
    }

    public String getAdresse_Client() {
        return Adresse_Client;
    }

    public void setAdresse_Client(String Adresse_Client) {
        this.Adresse_Client = Adresse_Client;
    }

    public int getCode_Postal_Client() {
        return Code_Postal_Client;
    }

    public void setCode_Postal_Client(int Code_Postal_Client) {
        this.Code_Postal_Client = Code_Postal_Client;
    }

    public String getVille_Client() {
        return Ville_Client;
    }

    public void setVille_Client(String Ville_Client) {
        this.Ville_Client = Ville_Client;
    }

    public Date getDate_Naissance_Client() {
        return Date_Naissance_Client;
    }

    public void setDate_Naissance_Client(Date Date_Naissance_Client) {
        this.Date_Naissance_Client = Date_Naissance_Client;
    }

    public String getEmail_Client() {
        return Email_Client;
    }

    public void setEmail_Client(String Email_Client) {
        this.Email_Client = Email_Client;
    }

    public boolean isStatut_Compte_Client() {
        return Statut_Compte_Client;
    }

    public void setStatut_Compte_Client(boolean Statut_Compte_Client) {
        this.Statut_Compte_Client = Statut_Compte_Client;
    }

    @Override
    public String toString() {
        return "Client{" + "Id_Client=" + Id_Client + ", Cin_Client=" + Cin_Client + ", Nom_Client=" + Nom_Client + ", Prenom_Client=" + Prenom_Client + ", Mot_De_Passe_Client=" + Mot_De_Passe_Client + ", Adresse_Client=" + Adresse_Client + ", Code_Postal_Client=" + Code_Postal_Client + ", Ville_Client=" + Ville_Client + ", Date_Naissance_Client=" + Date_Naissance_Client + ", Email_Client=" + Email_Client + ", Statut_Compte_Client=" + Statut_Compte_Client + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (this.Cin_Client != other.Cin_Client) {
            return false;
        }
        if (!Objects.equals(this.Email_Client, other.Email_Client)) {
            return false;
        }
        return true;
    }

}
