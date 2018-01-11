/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Demande extends ObjectE {
    private Client client;
    private int heureAppel;
    private int minAppel;
    private String demande;
    
    public Demande (Client client, int heureAppel,int minAppel, String demande){
        this.client=client;
        this.heureAppel=heureAppel;
        this.minAppel=minAppel;
        this.demande=demande;
    }
    
    public Client getClient(){
        return this.client;
    }
    
    public int getHeureAppel(){
        return this.heureAppel;
    }
    
    public int getMinAppel(){
        return this.minAppel;
    }
    
    public String getDemande(){
        return demande;
    }
    
    @Override
    public String toString(){
        return this.client.toString()+";"+this.heureAppel+";"+this.minAppel+";"+this.demande;
    }
    
    public String toSave(){
        return this.client.toSave()+";"+this.heureAppel+";"+this.minAppel+";"+this.demande;
    }
}

