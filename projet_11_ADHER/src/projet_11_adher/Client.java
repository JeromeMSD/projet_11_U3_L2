/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

/**
 *
 * @author Nicolas
 */
public class Client extends Personne{
    private String numTel;
    
    public Client (String nom, String prenom, String numTel, String libRue, SecteurGeographique secteur){
        super(nom,prenom,libRue,secteur);
        this.numTel=numTel;
    }
    
    public String getNumTel(){
        return numTel;
    }

    public void appeler (){
        
    }
    
    @Override
    public String toSave(){
        return toString()+";"+this.getNumTel()+";"+getLibRue()+";"+getSecteurGeographique();
    }
}
