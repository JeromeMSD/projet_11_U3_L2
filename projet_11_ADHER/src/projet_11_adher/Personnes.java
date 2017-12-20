/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

/**
 *
 * @author romain
 */
public class Personnes {
    private String nom;
    private String prenom;
    private String libRue;
    private int codePostal;
    
    public Personnes (String nom, String prenom, String libRue, int codePostal){
        this.nom = nom;
        this.prenom = prenom;
        this.libRue = libRue;
        this.codePostal = codePostal;
    }
}
