/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.util.Callback;


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
    
    private Set<String> stringSet;
    ObservableList observableList = FXCollections.observableArrayList();
    
    @FXML
    private Label title;
    @FXML
    private Label subtitle;
    
    @FXML
    private RadioButton ra;
    @FXML
    private RadioButton cs;
    @FXML
    private RadioButton la;
    @FXML
    private RadioButton ls;
    
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Contrat Service FXML">
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Services List FXML">
    @FXML
    private ListView servicesList;
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Activity List FXML">
    @FXML
    private ListView activityList;
// </editor-fold>
    
    
    @FXML
    private Button reset;
    @FXML
    private Button valid;
    @FXML
    private ToggleGroup addOption;
    @FXML
    private RowConstraints row;
    @FXML
    private ColumnConstraints col;
    @FXML
    private RadioButton ce;
    @FXML
    private RadioButton nc;
    
    
    //Non FXML attribut
    public ArrayList<Client> clients= new ArrayList<>();
    public ArrayList<Adherents> adherents = new ArrayList<>();
    
    public void badBtn() throws IOException{
        title.setText("EH !! On touche pas à mon bouton !! :(");
        Stage stage = new Stage();
        
        clients.add(new Client("Michel","Le brezil", "0202020202", "rue des fenetres", 100, "Les Velux"));
        clients.add(new Client("Michel","Le brezil", "0202020202", "rue des fenetres", 100, "Les Velux"));
        
        FXMLLoader fl = new FXMLLoader(getClass().getResource("/fxml/InterventionWindow.fxml"));
        InterventionWindowController iwc = new InterventionWindowController(clients, adherents);
        fl.setController(iwc);
        Parent root = fl.load();

        Scene scene = new Scene(root, 400, 600);

        stage.setTitle("ADHER Service - Nouvelle Intervention");
        stage.setScene(scene);
        stage.show();
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
        
        servicesList.setVisible(false);
        activityList.setVisible(false);
        
        reset.setVisible(false);
        valid.setVisible(false);
    }
    
    
    @FXML
    public void showRegistreAppel(){
        if(ra.isSelected() == false)
            ra.selectedProperty().set(true);
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
    @FXML
    public void showContratService(){
        cleanScreen();
        if(cs.isSelected() == false)
            cs.selectedProperty().set(true);
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
        if(ls.isSelected() == false)
            ls.selectedProperty().set(true);
        subtitle.setText("Liste Services");
       
        servicesList.setVisible(true);
    }
    public void showListeActivites(){
        cleanScreen();
        if(la.isSelected() == false)
            la.selectedProperty().set(true);
        subtitle.setText("Liste d'Activités");
        activityList.setVisible(true);
    }
    
    void supprimeAdherents() {
    ;
    }
    void ajouteAdherents(Adherents x) {
        ;
    }
    void renouvellementAdherents() {
        ;
    }
    void supprimeAppel() {
        ;
    }
    void ajouterAppel() {
        ;
    }
    void supprimeIntervention() {
        ;
    }
    void ajouterIntervention(Interventions x) {
        ;
    }
    void modifierIntervention() {
        ;
    }
    void trouverIntervention() {
        ;
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
