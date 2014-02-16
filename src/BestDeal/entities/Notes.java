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
public class Notes {
    
    private String Note;
    private Date Date_note;

    public Notes() {
    }

    public Notes(String Note, Date Date_note) {
        this.Note = Note;
        this.Date_note = Date_note;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Date getDate_note() {
        return Date_note;
    }

    public void setDate_note(Date Date_note) {
        this.Date_note = Date_note;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Note);
        hash = 59 * hash + Objects.hashCode(this.Date_note);
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
        final Notes other = (Notes) obj;
        if (!Objects.equals(this.Note, other.Note)) {
            return false;
        }
        if (!Objects.equals(this.Date_note, other.Date_note)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notes{" + "Note=" + Note + ", Date_note=" + Date_note + '}';
    }
    
   
    
    
}
