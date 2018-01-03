/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_11_adher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    private final static String INTERVENTION_FILE_NAME = "interventions.csv";

    public void saveClients(Groupe<Client> gc){
        File file = new File(RESOURCES_PATH + CLIENT_FILE_NAME);
        ArrayList<String> gs = gc.save();
        FileWriter fw  = null;
        BufferedWriter bw = null;
 
        try {
            fw  = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            for(String s : gs){
                bw.write(s);
                bw.newLine();
            }

	} catch (IOException e) {
			e.printStackTrace();
	} finally {
		try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                    	fw.close();
		} catch (IOException ex) {
				ex.printStackTrace();
		}
        }
    }

    public void saveAdherents(Groupe<Adherent> ga) {
        File file = new File(RESOURCES_PATH + ADHERENT_FILE_NAME);
        ArrayList<String> gs = ga.save();
        FileWriter fw  = null;
        BufferedWriter bw = null;
 
        try {
            fw  = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            for(String s : gs){
                bw.write(s);
                bw.newLine();
            }

	} catch (IOException e) {
			e.printStackTrace();
	} finally {
		try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                    	fw.close();
		} catch (IOException ex) {
				ex.printStackTrace();
		}
        }
    }

    public void saveInterventions(Groupe<Intervention> gi) {
        File file = new File(RESOURCES_PATH + INTERVENTION_FILE_NAME);
        ArrayList<String> gs = gi.save();
        FileWriter fw  = null;
        BufferedWriter bw = null;
 
        try {
            fw  = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            for(String s : gs){
                bw.write(s);
                bw.newLine();
            }

	} catch (IOException e) {
			e.printStackTrace();
	} finally {
		try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                    	fw.close();
		} catch (IOException ex) {
				ex.printStackTrace();
		}
        }
    }
    
    public void save(Groupe<Client> gc, Groupe<Adherent> ga, Groupe<Intervention> gi){
        saveClients(gc);
        saveAdherents(ga);
        saveInterventions(gi);
    }
    
    public Groupe<Client> loadClients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Groupe<Adherent> loadAdherents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Groupe<Intervention> loadInterventions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
