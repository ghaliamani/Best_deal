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
public class Categorie {

    private int Id_Categorie;
    private String Nom_Categorie;
    private String Libelle_Categorie;
    private Vendeur vendeur;

    public Categorie() {
    }

    public Categorie(int Id_Categorie, String Nom_Categorie, String Libelle_Categorie, Vendeur vendeur) {
        this.Id_Categorie = Id_Categorie;
        this.Nom_Categorie = Nom_Categorie;
        this.Libelle_Categorie = Libelle_Categorie;
        this.vendeur = vendeur;
    }

    public int getId_Categorie() {
        return Id_Categorie;
    }

    public void setId_Categorie(int Id_Categorie) {
        this.Id_Categorie = Id_Categorie;
    }

    public String getNom_Categorie() {
        return Nom_Categorie;
    }

    public void setNom_Categorie(String Nom_Categorie) {
        this.Nom_Categorie = Nom_Categorie;
    }

    public String getLibelle_Categorie() {
        return Libelle_Categorie;
    }

    public void setLibelle_Categorie(String Libelle_Categorie) {
        this.Libelle_Categorie = Libelle_Categorie;
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.Id_Categorie;
        hash = 67 * hash + Objects.hashCode(this.Nom_Categorie);
        hash = 67 * hash + Objects.hashCode(this.Libelle_Categorie);
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
        final Categorie other = (Categorie) obj;
        if (this.Id_Categorie != other.Id_Categorie) {
            return false;
        }
        if (!Objects.equals(this.Nom_Categorie, other.Nom_Categorie)) {
            return false;
        }
        if (!Objects.equals(this.Libelle_Categorie, other.Libelle_Categorie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categorie{" + "Id_Categorie=" + Id_Categorie + ", Nom_Categorie=" + Nom_Categorie + ", Libelle_Categorie=" + Libelle_Categorie + '}';
    }
    
}
