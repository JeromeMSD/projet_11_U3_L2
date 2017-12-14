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
public class Client {
    private String nom;
    private String prenom;
    private static int genID = 0;
    private int numCli = 0;
    private String numTel;
    private String libRue;
    private int codePostal;
    private String nomVille;
    
    public Client (String nom, String prenom, String numTel, String libRue, int codePostal, String nomVille){
        
        this.nom=nom;
        this.prenom=prenom;
        this.numTel=numTel;
        this.libRue=libRue;
        this.codePostal=codePostal;
        this.nomVille=nomVille;
        genID ++;
        this.numCli=genID;     
    }
    
    public void appeler (){
        
    }
        
}
