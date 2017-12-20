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
public class Interventions {
    private Client client;
    private Adherents adherent;
    private Date heureDebut;
    private Date heureFin;
    private SecteurGeographique secteur;
    private Activité activité;
    private Integer num;
    private String typeInteger;
 
    public Interventions(Client client, Adherents adherent, Date heureDebut, Date heureFin, SecteurGeographique secteur, Activité activité, Integer Num, String Type){
        this.client=client;
        this.adherent=adherent;
        this.heureDebut = heureDebut;
        this.heureFin=heureFin;
        this.secteur=secteur;
        this.activité=activité;
        this.num=Num;
        this.typeInteger=Type;
    }
}
