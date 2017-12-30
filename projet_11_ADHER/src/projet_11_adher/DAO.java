/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author jmddu_000
 */
public class DAO {
     private final static String RESOURCES_PATH = "/res/save/";
     private final static String SEPARATOR = ";";
     private final static String CLIENT_FILE_NAME = "clients.csv";
     private final static String ADHERENT_FILE_NAME = "adherents.csv";
     
     public ArrayList<Personne> loadClient() throws FileNotFoundException{
         ArrayList<Personne> clients = new ArrayList<>();
         
         File file = new File(RESOURCES_PATH + CLIENT_FILE_NAME);
         FileReader fr = new FileReader(file);
         
         //CSVReader csvReader = new CSVReader(fr,SEPARATOR);
         
         return clients;
     }

    void saveClients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void saveAdherents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void saveInterventions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Groupe loadAdherent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String[] loadIntervention() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
