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
public class CommentaireDeal {
    
    private int Id_Commentaire;
    private Client client;
    private Deals deals;
    private String Titre_Commentaire;
    private String Libelle_Commentaire;
    private Date Date_Commentaire;
    private int Note;

    public CommentaireDeal() {
    }

    public CommentaireDeal(int Id_Commentaire, Client client, Deals deals, String Titre_Commentaire, String Libelle_Commentaire, Date Date_Commentaire, int Note) {
        this.Id_Commentaire = Id_Commentaire;
        this.client = client;
        this.deals = deals;
        this.Titre_Commentaire = Titre_Commentaire;
        this.Libelle_Commentaire = Libelle_Commentaire;
        this.Date_Commentaire = Date_Commentaire;
        this.Note = Note;
    }

    public int getId_Commentaire() {
        return Id_Commentaire;
    }

    public void setId_Commentaire(int Id_Commentaire) {
        this.Id_Commentaire = Id_Commentaire;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Deals getDeals() {
        return deals;
    }

    public void setDeals(Deals deals) {
        this.deals = deals;
    }

    public String getTitre_Commentaire() {
        return Titre_Commentaire;
    }

    public void setTitre_Commentaire(String Titre_Commentaire) {
        this.Titre_Commentaire = Titre_Commentaire;
    }

    public String getLibelle_Commentaire() {
        return Libelle_Commentaire;
    }

    public void setLibelle_Commentaire(String Libelle_Commentaire) {
        this.Libelle_Commentaire = Libelle_Commentaire;
    }

    public Date getDate_Commentaire() {
        return Date_Commentaire;
    }

    public void setDate_Commentaire(Date Date_Commentaire) {
        this.Date_Commentaire = Date_Commentaire;
    }

    public int getNote() {
        return Note;
    }

    public void setNote(int Note) {
        this.Note = Note;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.Id_Commentaire;
        hash = 71 * hash + Objects.hashCode(this.client);
        hash = 71 * hash + Objects.hashCode(this.deals);
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
        final CommentaireDeal other = (CommentaireDeal) obj;
        if (this.Id_Commentaire != other.Id_Commentaire) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.deals, other.deals)) {
            return false;
        }
        return true;
    }

    

   
   

    @Override
    public String toString() {
        return "CommentaireDeal{" + "Id_Commentaire=" + Id_Commentaire + ", Titre_Commentaire=" + Titre_Commentaire + ", Libelle_Commentaire=" + Libelle_Commentaire + ", Date_Commentaire=" + Date_Commentaire + ", Note=" + Note + '}';
    }
    
}
