/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
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

    private ArrayList<Client> lc = new ArrayList<>();
    private ArrayList<Adherents> la = new ArrayList<>();
    private ArrayList<String> lcs = new ArrayList<>();
    private ArrayList<String> las = new ArrayList<>();
    
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
        ;
    }
    
    public void resetBtn(){
        ;
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
