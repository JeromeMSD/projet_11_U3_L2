/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
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
    private Button valid;
    @FXML
    private DatePicker dateDeb;
    @FXML
    private DatePicker dateFin;
  
            

    private ArrayList<Client> lc = new ArrayList<>();
    private ArrayList<Adherents> la = new ArrayList<>();
    private ArrayList<String> lcs = new ArrayList<>();
    private ArrayList<String> las = new ArrayList<>();
    
    private String nonSelectionne = new String("-------");
    private Stage stage;
    
    
    public InterventionWindowController(ArrayList<Client> lc,ArrayList<Adherents> la){
        this.la = la;
        this.lc = lc;
        this.lcs = lcs;
        this.las = las;
    }
    
    
    public void showClientExist(){
        ce.setSelected(true);       
    }
        
    public void showNewClient() throws IOException{
        nc.setSelected(true);
        NewClientFXMLController nCC = new NewClientFXMLController(lc,null);
        
        FXMLLoader fl = new FXMLLoader(getClass().getResource("/fxml/NewClientFXML.fxml"));
        fl.setController(nCC);
        
        Parent root = fl.load();
        
        Stage stage = new Stage();
        Scene scene = new Scene(root, 300, 450);
        
        stage.setTitle("ADHER Service - Nouveau Client");
        stage.setScene(scene);
        stage.showAndWait();
        
        
        ce.setSelected(true);
    }
    
    public void validBtn(){
        // Si un client a été selectionner
            // Si Un adherent à été selectionner
                //Si secteur et activité selecttionner
                    // Si la date de début des antérieur ou egal a la date de fin 
                        //Ajouter l'intervention au registre
                        stage = (Stage) valid.getScene().getWindow();
                        stage.close();
                    // Sinon probleme concordance date
        // sinon probleme de champs vide
        
    }
    
    public void resetBtn(){
        client.getSelectionModel().select(nonSelectionne);

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showClientExist();
        // TODO
    }    

    
}
