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
public enum Activité {

  Jardinage("Jardinage"),
  Plomberie("Plomberie"),
  Serrurerie("Serrurerie"),
  Maçonnerie("Maçonnerie"),
  Electricité("Électricité"),
  Alarme("Alarme");
   
  private String nomActivité = "";
   
  Activité(String nom){
    this.nomActivité = nom;
  }
   
  public void getNomActivité(){
      System.out.println("Domaine d\'activité :" + nomActivité);
  }
  
  public String toString(){
    return nomActivité;
  }
}
