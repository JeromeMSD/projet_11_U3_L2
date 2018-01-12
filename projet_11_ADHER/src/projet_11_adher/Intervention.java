/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author romain
 */
public class Intervention extends ObjectE{
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
    private Client client;
    private Adherent adherent;
    private Date dateDebut;
    private Date dateFin;
    private SecteurGeographique secteur;
    private Activité activité;
    private Integer num;
    private String typeInteger;
 
    public Intervention(Client client, Adherent adherent, Date dateDebut, Date dateFin, SecteurGeographique secteur, Activité activité, Integer Num, String Type){
        this.client=client;
        this.adherent=adherent;
        this.dateDebut = dateDebut;
        this.dateFin=dateFin;
        this.secteur=secteur;
        this.activité=activité;
        this.num=Num;
        this.typeInteger=Type;
    }
    
    @Override
    public String toString(){
        return client.toString()+" -> "+adherent.toString()+"|"+format.format(dateDebut)+"|"+format.format(dateFin)+"|";
    }
    
    @Override
    public String toSave(){
        return  client.toString() + ";" + adherent.toString() +";" + format.format(dateDebut) +";" + format.format(dateFin) +";"+ secteur + ";" + activité + ";" + num + ";" + typeInteger + ";";
    }
}
