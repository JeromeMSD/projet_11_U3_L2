/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
  
  public ObservableList<String> getActivites(){
      return FXCollections.observableArrayList("Jadinage","Plomberie","Serrurerie","Maçonnerie","Electricité","Alarme");
  }
  
  public String toString(){
    return nomActivité;
  }
}
