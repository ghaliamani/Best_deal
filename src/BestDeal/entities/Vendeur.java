/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.entities;

import java.util.Objects;

/**
 *
 * @author hamdi
 */
public class Vendeur {

    private int Id_Vendeur;
    private String Nom_Vendeur;
    private String Image_Vendeur;
    private String Adresse_Vendeur;
    private int Telephone_Vendeur;
    private String Email_Vendeur;
    private String Responsable;
    private double localisation;

    public Vendeur() {
    }

    public Vendeur(int Id_Vendeur, String Nom_Vendeur, String Image_Vendeur, String Adresse_Vendeur, int Telephone_Vendeur, String Email_Vendeur, String Responsable, double localisation) {
        this.Id_Vendeur = Id_Vendeur;
        this.Nom_Vendeur = Nom_Vendeur;
        this.Image_Vendeur = Image_Vendeur;
        this.Adresse_Vendeur = Adresse_Vendeur;
        this.Telephone_Vendeur = Telephone_Vendeur;
        this.Email_Vendeur = Email_Vendeur;
        this.Responsable = Responsable;
        this.localisation = localisation;
    }

    public int getId_Vendeur() {
        return Id_Vendeur;
    }

    public void setId_Vendeur(int Id_Vendeur) {
        this.Id_Vendeur = Id_Vendeur;
    }

    public String getNom_Vendeur() {
        return Nom_Vendeur;
    }

    public void setNom_Vendeur(String Nom_Vendeur) {
        this.Nom_Vendeur = Nom_Vendeur;
    }

    public String getImage_Vendeur() {
        return Image_Vendeur;
    }

    public void setImage_Vendeur(String Image_Vendeur) {
        this.Image_Vendeur = Image_Vendeur;
    }

    public String getAdresse_Vendeur() {
        return Adresse_Vendeur;
    }

    public void setAdresse_Vendeur(String Adresse_Vendeur) {
        this.Adresse_Vendeur = Adresse_Vendeur;
    }

    public int getTelephone_Vendeur() {
        return Telephone_Vendeur;
    }

    public void setTelephone_Vendeur(int Telephone_Vendeur) {
        this.Telephone_Vendeur = Telephone_Vendeur;
    }

    public String getEmail_Vendeur() {
        return Email_Vendeur;
    }

    public void setEmail_Vendeur(String Email_Vendeur) {
        this.Email_Vendeur = Email_Vendeur;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public double getLocalisation() {
        return localisation;
    }

    public void setLocalisation(double localisation) {
        this.localisation = localisation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.Id_Vendeur;
        hash = 59 * hash + Objects.hashCode(this.Nom_Vendeur);
        hash = 59 * hash + Objects.hashCode(this.Image_Vendeur);
        hash = 59 * hash + Objects.hashCode(this.Adresse_Vendeur);
        hash = 59 * hash + this.Telephone_Vendeur;
        hash = 59 * hash + Objects.hashCode(this.Email_Vendeur);
        hash = 59 * hash + Objects.hashCode(this.Responsable);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.localisation) ^ (Double.doubleToLongBits(this.localisation) >>> 32));
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
        final Vendeur other = (Vendeur) obj;
        if (this.Id_Vendeur != other.Id_Vendeur) {
            return false;
        }
        if (!Objects.equals(this.Nom_Vendeur, other.Nom_Vendeur)) {
            return false;
        }
        if (!Objects.equals(this.Image_Vendeur, other.Image_Vendeur)) {
            return false;
        }
        if (!Objects.equals(this.Adresse_Vendeur, other.Adresse_Vendeur)) {
            return false;
        }
        if (this.Telephone_Vendeur != other.Telephone_Vendeur) {
            return false;
        }
        if (!Objects.equals(this.Email_Vendeur, other.Email_Vendeur)) {
            return false;
        }
        if (!Objects.equals(this.Responsable, other.Responsable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.localisation) != Double.doubleToLongBits(other.localisation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "Id_Vendeur=" + Id_Vendeur + ", Nom_Vendeur=" + Nom_Vendeur + ", Image_Vendeur=" + Image_Vendeur + ", Adresse_Vendeur=" + Adresse_Vendeur + ", Telephone_Vendeur=" + Telephone_Vendeur + ", Email_Vendeur=" + Email_Vendeur + ", Responsable=" + Responsable + ", localisation=" + localisation + '}';
    }
    
    
}
