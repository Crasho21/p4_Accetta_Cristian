package p4_accetta_cristian_uc_4_5_13;
import java.io.File;
/**
 * Classe per la definizione di App
 * @author Accetta Cristian
 */
public class App{
    /** Attributi */
    private int id;
    private String nomeApp;
    /** Associazioni */
    private Dati dati;
    
    public Dati getDati(){
    	return dati;
    }
    
    public void setDati(Dati d){
    	this.dati = d;
    }
    /**
     * Funzione per la visualizzazione dei dati dell'App
     *
     */
    public void visualizzazioneDati(){

    }
    /**
     * Funzione per l'estrazione dei dati di un'App dal suo AppStore
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiApp(){
    	
    	return false;
    }
    /**
     * Funzione per la normalizzazione dei dati di un App
     *
     */
    public void normalizzazioneDati(){
    	
    }
    /**
     * Funzione per scaricare i dati di un'App
     *
     * @return Il file contente i dati dell'App
     */
    public File scaricamentoDati(){
        
    	return null;
    }
}