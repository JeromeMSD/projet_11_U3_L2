/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.util.Date;

/**
 *
 * @author romain
 */
public class Adherents extends Personnes {
    private Date dateEntree;
    private Date dateSortie;
    private Boolean disponibilite;
    private Activité activité;
    
    public Adherents(String nom,String prenom, String adresse, Date dateEntree, Date dateSortie, int codePostal, Activité activité){
        super(nom, prenom, adresse, codePostal);
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.disponibilite = true;
        this.activité=activité;
    }
}

