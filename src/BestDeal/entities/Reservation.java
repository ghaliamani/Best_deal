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
public class Reservation {
    
    private int Num_Reservation;
    private Client client;
    private boolean Statut_Reservation;
    private Date Date_Reservation;

    public Reservation() {
    }

    public Reservation(int Num_Reservation, boolean Statut_Reservation, Date Date_Reservation) {
        this.Num_Reservation = Num_Reservation;
        this.Statut_Reservation = Statut_Reservation;
        this.Date_Reservation = Date_Reservation;
    }

    public int getNum_Reservation() {
        return Num_Reservation;
    }

    public void setNum_Reservation(int Num_Reservation) {
        this.Num_Reservation = Num_Reservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
    public boolean isStatut_Reservation() {
        return Statut_Reservation;
    }

    public void setStatut_Reservation(boolean Statut_Reservation) {
        this.Statut_Reservation = Statut_Reservation;
    }

    public Date getDate_Reservation() {
        return Date_Reservation;
    }

    public void setDate_Reservation(Date Date_Reservation) {
        this.Date_Reservation = Date_Reservation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.Num_Reservation;
        hash = 67 * hash + (this.Statut_Reservation ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.Date_Reservation);
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
        final Reservation other = (Reservation) obj;
        if (this.Num_Reservation != other.Num_Reservation) {
            return false;
        }
        if (this.Statut_Reservation != other.Statut_Reservation) {
            return false;
        }
        if (!Objects.equals(this.Date_Reservation, other.Date_Reservation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservation{" + "Num_Reservation=" + Num_Reservation + ", Statut_Reservation=" + Statut_Reservation + ", Date_Reservation=" + Date_Reservation + '}';
    }
    
}
