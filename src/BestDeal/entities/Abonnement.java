/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BestDeal.entities;

import java.util.Date;

/**
 *
 * @author hamdi
 */
public class Abonnement {
    
    private Client client;
    private Categorie ategorie;
    private Date Date_Abonnement;

    public Abonnement() {
    }

    public Abonnement(Client client, Categorie ategorie, Date Date_Abonnement) {
        this.client = client;
        this.ategorie = ategorie;
        this.Date_Abonnement = Date_Abonnement;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Categorie getAtegorie() {
        return ategorie;
    }

    public void setAtegorie(Categorie ategorie) {
        this.ategorie = ategorie;
    }

    public Date getDate_Abonnement() {
        return Date_Abonnement;
    }

    public void setDate_Abonnement(Date Date_Abonnement) {
        this.Date_Abonnement = Date_Abonnement;
    }

    @Override
    public String toString() {
        return "Abonnement{" + "client=" + client + ", ategorie=" + ategorie + ", Date_Abonnement=" + Date_Abonnement + '}';
    }

    
    

    
    
    
}
