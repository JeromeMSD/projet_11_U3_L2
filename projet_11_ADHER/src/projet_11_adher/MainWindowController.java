/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


/**
 * FXML Controller class
 *
 * @author jmddu_000
 */
public class MainWindowController implements Initializable {

    
    private ObservableList<Object> allComp; //liste de tout les composants du FXML
    private ObservableList<Object> raComp;  //liste des composants du FXML de la page Registre Appel
    private ObservableList<Object> csComp;  //liste des composants du FXML de la page Contrat de Service
    private ObservableList<Object> lsComp;  //liste des composants du FXML de la page Liste Services 
    private ObservableList<Object> laComp;  //liste des composants du FXML de la page Liste Activités
   
    
    @FXML
    private Label title;
    @FXML
    private Label subtitle;
    // <editor-fold defaultstate="collapsed" desc="Registre Appel FXML">
    @FXML
    private FlowPane flowDate;
    @FXML
    private FlowPane flowH;
    @FXML
    private FlowPane flowClient;
    @FXML
    private FlowPane flowTelC;
    @FXML
    private FlowPane flowHr;
    @FXML
    private FlowPane flowDem;
    @FXML
    private FlowPane flowAt;
    @FXML
    private FlowPane flowAc;
    @FXML
    private Label res;
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Registre Appel FXML">
    @FXML
    private FlowPane flowDateDebut;
    @FXML
    private FlowPane flowNomRais;
    @FXML
    private FlowPane flowAddr;
    @FXML
    private FlowPane flowResp;
    @FXML
    private FlowPane flowSec;
    @FXML
    private FlowPane flowTarif;
// </editor-fold>
    
    @FXML
    private Button reset;
    @FXML
    private Button valid;
    
    
    
    public void badBtn(){
        title.setText("EH !! On touche pas à mon bouton !! :(");
    }
    public void resetBtn(){
        title.setText("ADHER Service");
    }
    
    public void cleanScreen(){
        subtitle.setText("");
        flowDate.setVisible(false);
        flowH.setVisible(false);
        flowClient.setVisible(false);
        flowTelC.setVisible(false);
        flowHr.setVisible(false);
        flowAt.setVisible(false);
        flowAc.setVisible(false);
        flowDem.setVisible(false);
        res.setVisible(false);
        
        flowDateDebut.setVisible(false);
        flowNomRais.setVisible(false);
        flowAddr.setVisible(false);
        flowResp.setVisible(false);
        flowSec.setVisible(false);
        flowTarif.setVisible(false);
        
        reset.setVisible(false);
        valid.setVisible(false);
    }
    
    
    public void showRegistreAppel(){
        cleanScreen();
        subtitle.setText("Registre d'appel");
        flowDate.setVisible(true);
        flowH.setVisible(true);
        flowClient.setVisible(true);
        flowTelC.setVisible(true);
        flowHr.setVisible(true);
        flowAt.setVisible(true);
        flowAc.setVisible(true);
        flowDem.setVisible(true);
        res.setVisible(true);
        reset.setVisible(true);
        valid.setVisible(true);
    }
    public void showContratService(){
        cleanScreen();
        subtitle.setText("Contrat Service");
        reset.setVisible(true);
        valid.setVisible(true);
        
               
        flowDateDebut.setVisible(true);
        flowNomRais.setVisible(true);
        flowAddr.setVisible(true);
        flowResp.setVisible(true);
        flowSec.setVisible(true);
        flowTarif.setVisible(true);
    } 
    public void showListeServices(){
        cleanScreen();
        subtitle.setText("Liste Services");
        
        
    }
    public void showListeActivites(){
        cleanScreen();
        subtitle.setText("Liste d'Activités");
        
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cleanScreen();
        showRegistreAppel();
    }    
    
    
    
    
    
}
