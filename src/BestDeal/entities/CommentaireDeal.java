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
    private String Titre_Commentaire;
    private String Libelle_Commentaire;
    private Date Date_Commentaire;
    private int Note;

    public CommentaireDeal() {
    }

    public CommentaireDeal(int Id_Commentaire, String Titre_Commentaire, String Libelle_Commentaire, Date Date_Commentaire, int Note) {
        this.Id_Commentaire = Id_Commentaire;
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
        int hash = 3;
        hash = 67 * hash + this.Id_Commentaire;
        hash = 67 * hash + Objects.hashCode(this.Titre_Commentaire);
        hash = 67 * hash + Objects.hashCode(this.Libelle_Commentaire);
        hash = 67 * hash + Objects.hashCode(this.Date_Commentaire);
        hash = 67 * hash + this.Note;
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
        if (!Objects.equals(this.Titre_Commentaire, other.Titre_Commentaire)) {
            return false;
        }
        if (!Objects.equals(this.Libelle_Commentaire, other.Libelle_Commentaire)) {
            return false;
        }
        if (!Objects.equals(this.Date_Commentaire, other.Date_Commentaire)) {
            return false;
        }
        if (this.Note != other.Note) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommentaireDeal{" + "Id_Commentaire=" + Id_Commentaire + ", Titre_Commentaire=" + Titre_Commentaire + ", Libelle_Commentaire=" + Libelle_Commentaire + ", Date_Commentaire=" + Date_Commentaire + ", Note=" + Note + '}';
    }
    
}
