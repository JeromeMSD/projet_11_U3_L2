/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import com.sun.javaws.ui.SplashScreen;
import fxml.other.NumberField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jmddu
 */
public class NewClientFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label subtitle;
    
    @FXML
    private TextField nomCli;
    @FXML
    private TextField prenomCli;
    @FXML
    private NumberField telCli;
    @FXML
    private TextField libRue;
    @FXML
    private TextField villeCli;
    @FXML
    private NumberField cdeVCli;
    @FXML
    private Button valid;
    
    
    
    private ArrayList<Client> lc = new ArrayList<>();
    private Client c;
    private Stage stage;
                                 
    
    public NewClientFXMLController(ArrayList<Client> l,Client c){
        this.lc = l;
        this.c = c;
    }
    
    public void validBtn(){
        if(!"".equals(nomCli.getText())){
            if(!"".equals(prenomCli.getText()))
                if(!"".equals(telCli.getText()))
                    if(!"".equals(libRue.getText()))
                        if(!"".equals(villeCli.getText()))
                            if(!"".equals(cdeVCli.getText())){
                                 lc.add( new Client(nomCli.getText(),prenomCli.getText(),telCli.getText(),libRue.getText(),Integer.parseInt(cdeVCli.getText()), villeCli.getText()) );
                                 subtitle.setText("Client Ajouté !");
                                 stage = (Stage) valid.getScene().getWindow();
                                 stage.close();
                            }
        }else{
           subtitle.setText("Certains champs sont vide.");
        }
    }
    
    public void resetBtn(){
        nomCli.setText("");
        prenomCli.setText("");
        telCli.setText("");
        libRue.setText("");
        villeCli.setText("");
        cdeVCli.setText("");
        subtitle.setText("Nouveau Client");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
