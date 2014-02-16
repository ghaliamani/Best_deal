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
public class Abonnement {
    
    private int Num_Abonnement;
    private Date Date_Abonnement;

    public Abonnement() {
    }

    public Abonnement(int Num_Abonnement, Date Date_Abonnement) {
        this.Num_Abonnement = Num_Abonnement;
        this.Date_Abonnement = Date_Abonnement;
    }

    public int getNum_Abonnement() {
        return Num_Abonnement;
    }

    public void setNum_Abonnement(int Num_Abonnement) {
        this.Num_Abonnement = Num_Abonnement;
    }

    public Date getDate_Abonnement() {
        return Date_Abonnement;
    }

    public void setDate_Abonnement(Date Date_Abonnement) {
        this.Date_Abonnement = Date_Abonnement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.Num_Abonnement;
        hash = 97 * hash + Objects.hashCode(this.Date_Abonnement);
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
        final Abonnement other = (Abonnement) obj;
        if (this.Num_Abonnement != other.Num_Abonnement) {
            return false;
        }
        if (!Objects.equals(this.Date_Abonnement, other.Date_Abonnement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Abonnement{" + "Num_Abonnement=" + Num_Abonnement + ", Date_Abonnement=" + Date_Abonnement + '}';
    }
    
    
}
