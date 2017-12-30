/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.util.ArrayList;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author jmddu_000
 */
public class Groupe {
    private String nom;
    private ArrayList<Personne> groupe = new ArrayList<>();
    
    public Groupe(String nom){
        this.nom = nom;
    }
    
    public String getGroupeName(){
        return nom;
    }
    
    public void setGroupeName(String nom){
        this.nom = nom;
    }
    
    public ArrayList<String> getStringList(){
        ArrayList<String> l = new ArrayList<>();
        
        for(Personne p : groupe)
            l.add(p.toString());
        
        return l;
    }
    
    public Personne getPersonne(String s) throws Exception{
        for(Personne p : groupe)
            if(s.equals(p.toString()))
                return p;
        
        throw new NotFound();
    }
    
    public void addToGroupe(Personne p){
        groupe.add(p);
    }
    
}
