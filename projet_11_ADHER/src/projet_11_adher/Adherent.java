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
public class Adherent extends Personne {
    private Date dateEntree;
    private Date dateSortie;
    private Boolean disponibilite;
    private Activité activité;
    
    public Adherent(String nom,String prenom, String adresse, Date dateEntree, Date dateSortie, SecteurGeographique s){
        super(nom, prenom, adresse, s);
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.disponibilite = true;
        this.activité=activité;
    }
    
    @Override
    public Boolean estDisponnible(){
        return disponibilite;
    }
    
    @Override
    public String toSave(){
        return super.toSave()+";"+dateEntree + ";" + dateSortie + ";" + disponibilite + ";" +activité + ";";
    }
    
    @Override
    public String toString(){
        return this.getNom() + this.getPrenom();
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }
}

