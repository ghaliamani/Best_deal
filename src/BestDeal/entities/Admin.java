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
public class Admin {

    private String Login_Admin;
    private String Mot_De_Passe_Admin;
    private String u;
    public Admin() {
    }

    public Admin(String Login_Admin, String Mot_De_Passe_Admin) {
        this.Login_Admin = Login_Admin;
        this.Mot_De_Passe_Admin = Mot_De_Passe_Admin;
    }

    public String getLogin_Admin() {
        return Login_Admin;
    }

    public void setLogin_Admin(String Login_Admin) {
        this.Login_Admin = Login_Admin;
    }

    public String getMot_De_Passe_Admin() {
        return Mot_De_Passe_Admin;
    }

    public void setMot_De_Passe_Admin(String Mot_De_Passe_Admin) {
        this.Mot_De_Passe_Admin = Mot_De_Passe_Admin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Login_Admin);
        hash = 53 * hash + Objects.hashCode(this.Mot_De_Passe_Admin);
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
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.Login_Admin, other.Login_Admin)) {
            return false;
        }
        if (!Objects.equals(this.Mot_De_Passe_Admin, other.Mot_De_Passe_Admin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Admin{" + "Login_Admin=" + Login_Admin + ", Mot_De_Passe_Admin=" + Mot_De_Passe_Admin + '}';
    }   
}
