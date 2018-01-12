/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jmddu
 */
public class InterventionWindowController implements Initializable {
    
    @FXML
    private RadioButton ce;
    @FXML
    private RadioButton nc;
    @FXML
    private FlowPane exist; 
    @FXML
    private ChoiceBox client;
    @FXML
    private ChoiceBox adherent;
    @FXML
    private Button valid;
    @FXML
    private DatePicker dateDeb;
    @FXML
    private DatePicker dateFin;
    @FXML
    private TextField sec;
    @FXML
    private ChoiceBox act;
  
    private Groupe<Intervention> gi = new Groupe<>("Intervention");
    private Groupe<Client> gc = new Groupe<>("Client");
    private Groupe<Adherent> ga = new Groupe<>("Adherent");
    
    private String nonSelectionne = new String("----------");
    private Stage stage;
        
    
    public InterventionWindowController(Groupe gc, Groupe ga, Groupe<Intervention> li){
        this.ga = ga;
        this.gc = gc;
        this.gi = li;
    }
    
    
    public void showClientExist(){
        ce.setSelected(true);       
    }
        
    public void showNewClient() throws IOException{
        nc.setSelected(true);
        NewClientFXMLController nCC = new NewClientFXMLController(gc);
        
        FXMLLoader fl = new FXMLLoader(getClass().getResource("/fxml/NewClientFXML.fxml"));
        fl.setController(nCC);
        
        Parent root = fl.load();
        
        Stage stage = new Stage();
        Scene scene = new Scene(root, 300, 450);
        
        stage.setTitle("ADHER Service - Nouveau Client");
        stage.setScene(scene);
        stage.showAndWait();
        
        refresh();
        ce.setSelected(true);
    }
    
    public void validBtn() throws Exception{
        Date debut;
        Date fin;
        Client c;
        Adherent a;/*
        // Si un client a été selectionner
            // Si Un adherent à été selectionner
                //Si secteur et activité selecttionner
                    // Si la date de début des antérieur ou egal a la date de fin
                    debut = dateDeb.get;
                    fin = 
                    if( < ) {
                        //Ajouter l'intervention au registre
                        c = gc.getPersonne((String) client.getSelectionModel().getSelectedItem());
                        a = ga.getPersonne((String) adherent.getSelectionModel().getSelectedItem());
                        gi.addToGroupe(new Intervention(, adherent, dateDebut, dateFin, secteur, Activité.Electricité, Integer.SIZE, nonSelectionne));*/
                        stage = (Stage) valid.getScene().getWindow();
                        stage.close();
                    //}
                    // Sinon probleme concordance date
        // sinon probleme de champs vide
        
    }
    
    public void resetBtn(){
        client.getSelectionModel().select(nonSelectionne);
    }
    
    public void clientC() throws Exception{
        Client c = gc.getPersonne((String) client.getSelectionModel().getSelectedItem());
        sec.setText(c.getSecteurGeographique().toString());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showClientExist();
        refresh();
        client.getSelectionModel().selectFirst();
        adherent.getSelectionModel().selectFirst();
        
        
        // TODO
    }    
    
    public void refresh(){
        client.setItems(FXCollections.observableArrayList(gc.getStringList()));
        adherent.setItems(FXCollections.observableArrayList(ga.getDisponnible()));
    }

    
}
