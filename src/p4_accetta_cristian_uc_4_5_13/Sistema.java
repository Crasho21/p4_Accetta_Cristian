package p4_accetta_cristian_uc_4_5_13;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Classe per la definizione del Sistema
 * @author Accetta Cristian
 */
public class Sistema extends JFrame{ 
	
    /** Associazioni */
    private ElementAppStore appStores;
    private ArrayList<App> apps;
    private ArrayList<Gruppo> gruppi;
    
    /** Variabili per l'interfaccia grafica*/
    int height;
	int width;
	private JButton buttonCreazioneGruppo;
	private JButton buttonCancellazioneGruppo;
	private ButtonListener bl;
	
	/** Variabile per gestire input ed output su file */
	private FileIO fileIO;
	
    /**
     * Costruttore generico
     */
    public Sistema() {
    	appStores = null;
    	apps = new ArrayList<App>();
		gruppi = new ArrayList<Gruppo>();
		/* Questa parte è commentata perchè non dev'essere testata, serve a gestire la lettura dei gruppi salvati permanentemente su file
    	fileIO = new FileIO("Gruppi.dat");
    	gruppi = (ArrayList<Gruppo>)fileIO.leggiDati();
    	// Se il file non esiste viene lanciata un'eccezzione FileNotFoundException, il file verrà creato in seguito
    	// Se il file non esiste o è vuoto istanzio l'ArrayList
    	if(gruppi == null){
    		gruppi = new ArrayList<Gruppo>();
    	}*/
	}
    
    /**
     * Costruttore per utilizzare l'interfaccia grafica nel quale gestisco anche la lettura dei file salvati permanentemente su file
     * (Da non testare)
     * @param interfacciaGrafica Una stringa per distinguere il costruttore
     */
    public Sistema(String interfacciaGrafica) {
    	super("Manipolazione di dati statistici da app stores");
    	appStores = null;
    	apps = new ArrayList<App>();
    	fileIO = new FileIO("Gruppi.dat");
    	gruppi = (ArrayList<Gruppo>)fileIO.leggiDati();
    	// Se il file non esiste viene lanciata un'eccezzione FileNotFoundException, il file verrà creato in seguito
    	// Se il file non esiste o è vuoto istanzio l'ArrayList
    	if(gruppi == null){
    		gruppi = new ArrayList<Gruppo>();
    	}
    	height = 500;
    	width = 500;
    	buttonCreazioneGruppo = new JButton("Crea un gruppo");
    	buttonCancellazioneGruppo = new JButton("Cancella un gruppo");
    	bl = new ButtonListener(this);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(buttonCreazioneGruppo);
		buttonCreazioneGruppo.addActionListener(bl);
		c.add(buttonCancellazioneGruppo);
		buttonCancellazioneGruppo.addActionListener(bl);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((int)((dim.getWidth() - this.getWidth()) / 2 - width / 2), (int)((dim.getHeight() - this.getHeight()) / 2 - height / 2));
		setSize(width, height);
		setResizable(true);
		setVisible(true);
	}
    
    /**
     * Funzione per aggiungere le credenziali di un'AppStore tra quelli supportati
     *
     */
    public void aggiuntaCredenziali(){
         
    }
    
    /**
     * Funzione per inserire App nel Sistema
     *
     */
    public void inserimentoApp(){
         
    }
    
    /**
     * Funzione per cancellare App dal Sistema
     *
     */
    public void cancellazioneApp(){
 
    }
    
    /**
     * Funzione per controllare che nomeGruppo sia disponibile
     * @param nomeConfermato Un intero che indica se il nome è stato confermato
     * @param nomeGruppo Il nome del gruppo
     * @return Un booleano che indica se nomeGruppo è disponibile
     */
    public boolean controlloNomeGruppoCreazione(int nomeConfermato, String nomeGruppo){
    	boolean nomeDisponibile = false;
    	if(nomeConfermato == 0){
    		nomeDisponibile = true;
			// Controllo che siano presenti gruppi nel sistema
			if(gruppi != null && !gruppi.isEmpty()){
				Iterator<Gruppo> i = gruppi.iterator();
				while(i.hasNext()){
					Gruppo g = i.next();
					if(g.getNomeGruppo().equalsIgnoreCase(nomeGruppo)){
						nomeDisponibile = false;
					}
				}
			}
    	}
    	return nomeDisponibile;
    }
    
    /**
     * Funzione per aggiungere un nuovo gruppo al sistema
     * @param nomeDisponibile Un booleano che indica se nomeGruppo è disponibile
     * @param nomeGruppo Il nome del gruppo
     * @return Un booleano che indica se il gruppo è stato creato
     */
    public boolean aggiuntaGruppo(boolean nomeDisponibile, String nomeGruppo){
    	boolean gruppoCreato = false;
		// Se il nome è disonibile creo il gruppo
		if(nomeDisponibile){
			Gruppo nuovoGruppo = new Gruppo(nomeGruppo);
			gruppi.add(nuovoGruppo);
			gruppoCreato = true;
		}
		return gruppoCreato;
    }
    
    /**
     * Funzione per creare un nuovo Gruppo
     *
     */
    public void creazioneGruppo(){
    	// Istanzio ed inizializzo le variabili necessarie
    	boolean nomeDisponibile = false;
    	String nomeGruppo;
    	int nomeConfermato = -1;
    	// Eseguo un ciclo finchè il nome inserito non è disponibile
    	while(!nomeDisponibile){
    		nomeGruppo = "";
    		// Gestisco l'eccezione che viene lanciata quando si clicca il pulsante "cancel" in modo tale da far terminare la funzione
    		try{
    			// Finchè nomeGruppo è vuota chiedo il nome all'utente
    			while(nomeGruppo.isEmpty()){
    				nomeGruppo = JOptionPane.showInputDialog("Inserisci il nome del gruppo da creare");
    			}
    		} catch(NullPointerException npe){
    			return;
    		}
    		// Richiedo la conferma del nome inserito
    		nomeConfermato = JOptionPane.showConfirmDialog(null, "Confermi " + nomeGruppo + " come nome del nuovo gruppo?", "Conferma", JOptionPane.YES_NO_OPTION);
    		// Se il nome è confermato controllo se esiste un gruppo con lo stesso nome (case insensitive), altrimenti rinizio il ciclo
    		nomeDisponibile = controlloNomeGruppoCreazione(nomeConfermato, nomeGruppo);
    		boolean gruppoCreato = aggiuntaGruppo(nomeDisponibile, nomeGruppo);
    		// Se il gruppo è stato creato lo notifico all'utente e salvo la lista dei gruppi permanentermente su file
			if(gruppoCreato){
    			JOptionPane.showMessageDialog(null, "Gruppo " + nomeGruppo + " creato correttamente");
    			fileIO.salvaDati(gruppi);
			}
			// Altrimenti se il nome è stato confermato lo segnalo all'utente
			else if(nomeConfermato == 0){
				JOptionPane.showMessageDialog(null, "Nome non disponibile, inseriscine un altro");
			}
    	}
    }
    
    /**
     * Funzione per il controllo delle precondizioni di cancellazioneGruppo
     * 
     * @return true se le condizioni sono verificate, false altrimenti
     */
    public boolean precondizioniCancellazioneGruppo(){
    	if(gruppi == null || gruppi.isEmpty()){
    		return false;
    	}
    	return true;
    }
    
    /**
     * Funzione per ottenre una stringa con i nomi dei gruppi
     * @return Una stringa con i nomi dei gruppi
     */
    public String getNomiGruppi(){
    	String nomiGruppi = "";
    	Iterator<Gruppo> i = gruppi.iterator();
    	while(i.hasNext()){
    		Gruppo g = i.next();
    		nomiGruppi += g.getNomeGruppo() + "\n";
		}
    	return nomiGruppi;
    }
    
    /**
     * Funzione per controllare che nomeGruppo sia un nuome di un gruppo presente nel sistema
     * @param nomeGruppo Il nome del gruppo da controllare
     * @return L'indice del gruppo da rimuovere
     */
    public int controlloNomeGruppoCancellazione(String nomeGruppo){
    	int removeIndex = 0;
    	Iterator<Gruppo> i = gruppi.iterator();
		// Controllo che il nome del gruppo inserito esista
    	while(i.hasNext()){
    		Gruppo g = i.next();
    		if(g.getNomeGruppo().equalsIgnoreCase(nomeGruppo)){
    			break;
    		}
    		removeIndex++;
    	}
    	return removeIndex;
    }
    
    /**
     * Funzione per cancellare il gruppo selezionato se l'utente ha confermato la scelta
     * @param conferma La conferma
     * @param removeIndex L'indice dell'elemento da cancellare
     * @return true se il gruppo è stato rimosso, false altrimenti
     */
    public boolean rimozioneGruppo(int conferma, int removeIndex){
    	if(conferma == 0){
    		gruppi.remove(removeIndex);
    		return true;
    	}
    	return false;
    }
    
	/**
     * Funzione per cancellare un Gruppo
     *
     */
    public void cancellazioneGruppo(){
    	// Istanzio ed inizializzo le variabili necessarie
    	int conferma = -1;
    	String nomiGruppi = "";
    	String nomeGruppo = "";
    	boolean gruppoScelto = false;
    	int removeIndex = -1;
		// Se non sono presenti gruppi nel sistema lo notifico all'utente e termino la funzione 
    	if(!precondizioniCancellazioneGruppo()){
    		JOptionPane.showMessageDialog(null, "Nessun gruppo presente nel sistema");
    		return;
		}
    	// Altrimenti salvo in una stringa i nomi di tutti i gruppi
    	nomiGruppi = getNomiGruppi();
    	// Eseguo un ciclo finchè l'utente non inserisce un nome di un gruppo presente nel sistema
    	while(!gruppoScelto){
    		nomeGruppo = JOptionPane.showInputDialog("Scegli un gruppo da cancellare (inserisci il nome del gruppo)\n" + nomiGruppi);
    		removeIndex = controlloNomeGruppoCancellazione(nomeGruppo);
    		// Se l'indice è minore del numero dei gruppi il gruppo può essere cancellato
    		if(removeIndex < gruppi.size()){
    			gruppoScelto = true;
    		}
    	}
    	// Chiedo conferma della cancellazione
    	conferma = JOptionPane.showConfirmDialog(null, "Confermi di voler cancellare il gruppo " + nomeGruppo + "?", "Conferma", JOptionPane.YES_NO_OPTION);
    	// Cancello il gruppo
    	rimozioneGruppo(conferma, removeIndex);
    	// Se l'utente ha confermato la scelta aggiorno la lista dei gruppi su file
    	if(conferma == 0){
    		fileIO.salvaDati(gruppi);
    	}
    }
    
    /**
     * Funzione per cancellare le credenziali di un'AppStore 
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean cancellazioneCredenziali(){
 
    	return false;
    }
    
    /**
     * Funzione per modificare le credenziali di un'AppStore
     * 
     */
    public void modificaCredenziali(){

    }
    
    /**
     * Funzione per aggiungere un'App ad un Gruppo
     *
     */
    public void aggiuntaAppGruppo(){
        
    }
    
    /**
     * Funzione per cancellare un'App da un Gruppo
     *
     */
    public void cancellazioneAppGruppo(){
    	
    }

	public ArrayList<Gruppo> getGruppi() {
		return gruppi;
	}
    
	public void setGruppi(ArrayList<Gruppo> gruppi){
		this.gruppi = gruppi;
	}
}