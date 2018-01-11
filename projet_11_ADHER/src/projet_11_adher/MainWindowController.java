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
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author jmddu_000
 */
public class MainWindowController implements Initializable {
    private DAO saveAndLoad = new DAO();
    
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
    private ChoiceBox clientA;
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
    
    // <editor-fold defaultstate="collapsed" desc="Intervention List FXML">
    @FXML
    private ListView interventionsList;
    @FXML
    private Button rmInter;
    @FXML
    private Button nInter;
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="List FXML">
    @FXML
    private ListView activityList;
    @FXML
    private ListView secGeoList;
    @FXML
    private VBox vboxAct;
    @FXML
    private VBox vboxSec;
    @FXML
    private VBox vboxAl;
    @FXML
    private VBox vboxCl;
    @FXML
    private ListView clientL;
    @FXML
    private ListView adherentL;
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Affichage composant FXML">
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
        
        interventionsList.setVisible(false);
        nInter.setVisible(false);
        rmInter.setVisible(false);
        
        vboxAct.setVisible(false);
        vboxSec.setVisible(false);
        vboxAl.setVisible(false);
        vboxCl.setVisible(false);
        
        reset.setVisible(false);
        valid.setVisible(false);
        refresh();
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
    public void showListeInterventions(){
        cleanScreen();
        if(ls.isSelected() == false)
            ls.selectedProperty().set(true);
        subtitle.setText("Liste intervention");
       
        interventionsList.setVisible(true);
        nInter.setVisible(true);
        rmInter.setVisible(true);
    }
    public void showGestionListe(){
        cleanScreen();
        if(la.isSelected() == false)
            la.selectedProperty().set(true);
        subtitle.setText("Gestion des liste");
        
        vboxAct.setVisible(true);
        vboxSec.setVisible(true);
        
        vboxAl.setVisible(true);
        vboxCl.setVisible(true);
    }
    
    //</editor-fold>
    
    
    
    
    //Non FXML attribut
    public Groupe<Client> groupeClient = new Groupe("Groupe Client");
    public Groupe<Adherent> groupeAdherent = new Groupe("Groupe Adherent");
    public Groupe<Intervention> groupeInter = new Groupe("Groupe Intervention");
    public Groupe<Demande> groupeDem = new Groupe("Groupe Demande");
    
    
    private Activité enumActivite = Activité.Alarme;
    
    private ObservableList<String> listeActivites = FXCollections.observableArrayList();
    private ObservableList<String> listeSecteurGeographique = FXCollections.observableArrayList();
    
    
    public void validBtn() throws IOException{
        groupeClient.addToGroupe(new Client("Michel","Le brezil", "0202020202", "rue des fenetres", new SecteurGeographique("100-Les Velux")));
        groupeAdherent.addToGroupe(new Adherent("bob", "le bricoleur", "rue des clou", new Date(1000), new Date(1000),new SecteurGeographique("100-Les Velux")));
        if(ra.isSelected()){
            //Validation registre d'appel
            ;
        }else if(cs.isSelected()){
            //validation contrat de service
            ;
        }
        
        
        ///Validation et affectation automatique
        
    }
    public void resetBtn(){
        Intervention i = new Intervention(new Client("l", "b", "dqsdqsd", "dqd", new SecteurGeographique("100-Les Velux")), new Adherent("bob", "le bricoleur", "rue des clou", new Date(1000), new Date(1000),new SecteurGeographique("100-Les Velux")),new Date(10000), new Date(10000), new SecteurGeographique(63000,"Clermont"), enumActivite, Integer.SIZE, "Tpue");
        title.setText("ADHER Service");
        groupeInter.addToGroupe(i);
        
        refresh();
    }
    
    public void rmIntervention(){
       String s = (String) interventionsList.getSelectionModel().getSelectedItem();
       groupeInter.rm(s);
    }
    
    public void newIntervention() throws IOException{
        Stage stage = new Stage();
        
        FXMLLoader fl = new FXMLLoader(getClass().getResource("/fxml/InterventionWindow.fxml"));
        InterventionWindowController iwc = new InterventionWindowController(groupeClient, groupeAdherent,groupeInter);
        fl.setController(iwc);
        
        Parent root = fl.load();

        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("ADHER Service - Nouvelle Intervention");
        stage.setScene(scene);
        stage.show();
    }
    
    
    public void newClient() throws IOException{
        NewClientFXMLController nCC = new NewClientFXMLController(groupeClient);
        
        FXMLLoader fl = new FXMLLoader(getClass().getResource("/fxml/NewClientFXML.fxml"));
        fl.setController(nCC);
        
        Parent root = fl.load();
        
        Stage stage = new Stage();
        Scene scene = new Scene(root, 300, 450);
        
        stage.setTitle("ADHER Service - Nouveau Client");
        stage.setScene(scene);
        stage.showAndWait();
        refresh();
    }
    
    void ajouterAdherent(){
        ;
    }
    
    public void supprimerAdherent() {
        System.out.println("coucou");
    }
    void ajouteAdherent(Adherent x) {
        ;
    }
    void renouvellementAdherent() {
        ;
    }
    public void supprimerClient(){
        System.out.println("coucou");
    }
    
    void supprimeAppel() {
        ;
    }
    void ajouterAppel() {
        ;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //load();
        cleanScreen();
        showRegistreAppel();
        
        listeActivites.addAll(enumActivite.getActivites());
        activityList.setItems(listeActivites);
        
        refresh();
        clientA.getSelectionModel().selectFirst();
    }    
    
    
    public void refresh(){
        clientA.setItems(FXCollections.observableArrayList(groupeClient.getStringList()));
        clientL.setItems(FXCollections.observableArrayList(groupeClient.getStringList()));
        adherentL.setItems(FXCollections.observableArrayList(groupeAdherent.getStringList()));
        interventionsList.setItems(FXCollections.observableArrayList(groupeInter.getStringList()));
    }

    void save() {
        System.out.println("Sauvegarde des différentes Instances.");
        saveAndLoad.save(groupeClient, groupeAdherent, groupeInter,groupeDem);
    }

    void load(){
        System.out.println("Chargement de la Base de Donnée..");

        groupeClient.addList(saveAndLoad.loadClients());
        groupeAdherent.addList(saveAndLoad.loadAdherents());
        groupeInter.addList(saveAndLoad.loadInterventions(groupeClient,groupeAdherent));
        groupeDem.addList(saveAndLoad.loadDemandes(groupeClient));
        
        System.out.println("Base de Donnée chargé !");
    }
}
