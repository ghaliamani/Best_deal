/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.entities;

/**
 *
 * @author hamdi
 */
public class LigneReservation {
    
    private int Num_Resrvation;
    private Reservation reservation;
    private Deals deals;
    private int Quantite_Commande;

    public LigneReservation() {
    }

    public LigneReservation(int Num_Resrvation, Reservation reservation, Deals deals, int Quantite_Commande) {
        this.Num_Resrvation = Num_Resrvation;
        this.reservation = reservation;
        this.deals = deals;
        this.Quantite_Commande = Quantite_Commande;
    }

    

    public int getNum_Resrvation() {
        return Num_Resrvation;
    }

    public void setNum_Resrvation(int Num_Resrvation) {
        this.Num_Resrvation = Num_Resrvation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Deals getDeals() {
        return deals;
    }

    public void setDeals(Deals deals) {
        this.deals = deals;
    }
    
    public int getQuantite_Commande() {
        return Quantite_Commande;
    }

    public void setQuantite_Commande(int Quantite_Commande) {
        this.Quantite_Commande = Quantite_Commande;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.Num_Resrvation;
        hash = 59 * hash + this.Quantite_Commande;
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
        final LigneReservation other = (LigneReservation) obj;
        if (this.Num_Resrvation != other.Num_Resrvation) {
            return false;
        }
        if (this.Quantite_Commande != other.Quantite_Commande) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneReservation{" + "Num_Resrvation=" + Num_Resrvation + ", Quantite_Commande=" + Quantite_Commande + '}';
    }
    
    
    
}
