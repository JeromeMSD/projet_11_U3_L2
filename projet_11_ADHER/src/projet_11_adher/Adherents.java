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
public class Adherents {
    private String nom;
    private String prenom;
    private String adresse;
    private Date dateEntree;
    private Date dateSortie;
    private Boolean disponibilite;
    
    public Adherents(String nom,String prenom, String adresse, Date dateEntree, Date dateSortie){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.disponibilite = true;
    }
}

