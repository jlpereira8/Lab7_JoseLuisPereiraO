/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.io.Serializable;

/**
 *
 * @author j0c3lwiz
 */
public class Intereses implements Serializable{
    private String nom_interes;
    //public static final long serialVersionUID = 333L;
    public Intereses(String nom_interes) {
        this.nom_interes = nom_interes;
    }

    public String getNom_interes() {
        return nom_interes;
    }

    public void setNom_interes(String nom_interes) {
        this.nom_interes = nom_interes;
    }

    @Override
    public String toString() {
        return nom_interes ;
    }
    
    
    
}
