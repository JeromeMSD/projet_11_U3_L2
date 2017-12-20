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
public class Client extends Personnes{
    private String numTel;
    private String nomVille;
    
    public Client (String nom, String prenom, String numTel, String libRue, int codePostal, String nomVille){
        super(nom,prenom,libRue,codePostal);
        this.numTel=numTel;
        this.nomVille=nomVille; 
    }
    
    public void appeler (){
        
    }
        
}
