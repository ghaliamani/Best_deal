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
public class Deals {

    private int Id_Deal;
    private String Nom_Deal;
    private String Description_Deal;
    private String Description_Detaillé_Deal;
    private String Image_Deal;
    private Double Prix_De_Vente_Deal;
    private Double Prix_Original_Deal;
    private Date Date_Publication_Deal;
    private Date Date_Expiration_Deal;
    private String Condition_De_Vente_Deal;
    private int Quantite_Deal;
    private int Nbr_Max_Reservation_Deal;

    public Deals() {
    }

    public Deals(int Id_Deal, String Nom_Deal, String Description_Deal, String Description_Detaillé_Deal, String Image_Deal, Double Prix_De_Vente_Deal, Double Prix_Original_Deal, Date Date_Publication_Deal, Date Date_Expiration_Deal, String Condition_De_Vente_Deal, int Quantite_Deal, int Nbr_Max_Reservation_Deal) {
        this.Id_Deal = Id_Deal;
        this.Nom_Deal = Nom_Deal;
        this.Description_Deal = Description_Deal;
        this.Description_Detaillé_Deal = Description_Detaillé_Deal;
        this.Image_Deal = Image_Deal;
        this.Prix_De_Vente_Deal = Prix_De_Vente_Deal;
        this.Prix_Original_Deal = Prix_Original_Deal;
        this.Date_Publication_Deal = Date_Publication_Deal;
        this.Date_Expiration_Deal = Date_Expiration_Deal;
        this.Condition_De_Vente_Deal = Condition_De_Vente_Deal;
        this.Quantite_Deal = Quantite_Deal;
        this.Nbr_Max_Reservation_Deal = Nbr_Max_Reservation_Deal;
    }

    public int getId_Deal() {
        return Id_Deal;
    }

    public void setId_Deal(int Id_Deal) {
        this.Id_Deal = Id_Deal;
    }

    public String getNom_Deal() {
        return Nom_Deal;
    }

    public void setNom_Deal(String Nom_Deal) {
        this.Nom_Deal = Nom_Deal;
    }

    public String getDescription_Deal() {
        return Description_Deal;
    }

    public void setDescription_Deal(String Description_Deal) {
        this.Description_Deal = Description_Deal;
    }

    public String getDescription_Detaillé_Deal() {
        return Description_Detaillé_Deal;
    }

    public void setDescription_Detaillé_Deal(String Description_Detaillé_Deal) {
        this.Description_Detaillé_Deal = Description_Detaillé_Deal;
    }

    public String getImage_Deal() {
        return Image_Deal;
    }

    public void setImage_Deal(String Image_Deal) {
        this.Image_Deal = Image_Deal;
    }

    public Double getPrix_De_Vente_Deal() {
        return Prix_De_Vente_Deal;
    }

    public void setPrix_De_Vente_Deal(Double Prix_De_Vente_Deal) {
        this.Prix_De_Vente_Deal = Prix_De_Vente_Deal;
    }

    public Double getPrix_Original_Deal() {
        return Prix_Original_Deal;
    }

    public void setPrix_Original_Deal(Double Prix_Original_Deal) {
        this.Prix_Original_Deal = Prix_Original_Deal;
    }

    public Date getDate_Publication_Deal() {
        return Date_Publication_Deal;
    }

    public void setDate_Publication_Deal(Date Date_Publication_Deal) {
        this.Date_Publication_Deal = Date_Publication_Deal;
    }

    public Date getDate_Expiration_Deal() {
        return Date_Expiration_Deal;
    }

    public void setDate_Expiration_Deal(Date Date_Expiration_Deal) {
        this.Date_Expiration_Deal = Date_Expiration_Deal;
    }

    public String getCondition_De_Vente_Deal() {
        return Condition_De_Vente_Deal;
    }

    public void setCondition_De_Vente_Deal(String Condition_De_Vente_Deal) {
        this.Condition_De_Vente_Deal = Condition_De_Vente_Deal;
    }

    public int getQuantite_Deal() {
        return Quantite_Deal;
    }

    public void setQuantite_Deal(int Quantite_Deal) {
        this.Quantite_Deal = Quantite_Deal;
    }

    public int getNbr_Max_Reservation_Deal() {
        return Nbr_Max_Reservation_Deal;
    }

    public void setNbr_Max_Reservation_Deal(int Nbr_Max_Reservation_Deal) {
        this.Nbr_Max_Reservation_Deal = Nbr_Max_Reservation_Deal;
    }

    @Override
    public String toString() {
        return "Deals{" + "Id_Deal=" + Id_Deal + ", Nom_Deal=" + Nom_Deal + ", Description_Deal=" + Description_Deal + ", Description_Detaill\u00e9_Deal=" + Description_Detaillé_Deal + ", Image_Deal=" + Image_Deal + ", Prix_De_Vente_Deal=" + Prix_De_Vente_Deal + ", Prix_Original_Deal=" + Prix_Original_Deal + ", Date_Publication_Deal=" + Date_Publication_Deal + ", Date_Expiration_Deal=" + Date_Expiration_Deal + ", Condition_De_Vente_Deal=" + Condition_De_Vente_Deal + ", Quantite_Deal=" + Quantite_Deal + ", Nbr_Max_Reservation_Deal=" + Nbr_Max_Reservation_Deal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.Id_Deal;
        hash = 59 * hash + Objects.hashCode(this.Nom_Deal);
        hash = 59 * hash + Objects.hashCode(this.Description_Deal);
        hash = 59 * hash + Objects.hashCode(this.Description_Detaillé_Deal);
        hash = 59 * hash + Objects.hashCode(this.Image_Deal);
        hash = 59 * hash + Objects.hashCode(this.Prix_De_Vente_Deal);
        hash = 59 * hash + Objects.hashCode(this.Prix_Original_Deal);
        hash = 59 * hash + Objects.hashCode(this.Date_Publication_Deal);
        hash = 59 * hash + Objects.hashCode(this.Date_Expiration_Deal);
        hash = 59 * hash + Objects.hashCode(this.Condition_De_Vente_Deal);
        hash = 59 * hash + this.Quantite_Deal;
        hash = 59 * hash + this.Nbr_Max_Reservation_Deal;
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
        final Deals other = (Deals) obj;
        if (this.Id_Deal != other.Id_Deal) {
            return false;
        }
        if (!Objects.equals(this.Nom_Deal, other.Nom_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Description_Deal, other.Description_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Description_Detaillé_Deal, other.Description_Detaillé_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Image_Deal, other.Image_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Prix_De_Vente_Deal, other.Prix_De_Vente_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Prix_Original_Deal, other.Prix_Original_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Date_Publication_Deal, other.Date_Publication_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Date_Expiration_Deal, other.Date_Expiration_Deal)) {
            return false;
        }
        if (!Objects.equals(this.Condition_De_Vente_Deal, other.Condition_De_Vente_Deal)) {
            return false;
        }
        if (this.Quantite_Deal != other.Quantite_Deal) {
            return false;
        }
        if (this.Nbr_Max_Reservation_Deal != other.Nbr_Max_Reservation_Deal) {
            return false;
        }
        return true;
    }
    
    

}
