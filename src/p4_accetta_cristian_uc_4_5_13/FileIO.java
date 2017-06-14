package p4_accetta_cristian_uc_4_5_13;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * Classe per gestire il salvataggio su file dei dati in modo tale da renderli permanenti
 * @author Accetta Cristian
 */
public class FileIO {

	private String file;
	private Object dati;

	public FileIO(String f){
		file = f;
		dati = new Object();
	}
	/**
	 * Funzione per salvare dati permanentemente su file
	 * 
	 * @param dati I dati da salvare
	 */
	public void salvaDati(Object dati){
		try{
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dati);
			oos.close();
			fos.close();
			System.out.println("File " + file + " salvato");
		} catch(Exception e){
			e.printStackTrace();
		}	
	}
	/**
	 * Funzione per leggere i dati salvati su file
	 * 
	 * @return dati I dati letti da file
	 */
	public Object leggiDati(){
		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			dati = ois.readObject();
			ois.close();
			fis.close();
			System.out.println("File " + file + " letto");
		} catch(Exception e){
			//e.printStackTrace();
			System.out.println("File " + file + " non trovato");
			return null;
		}
		return dati;
	}
}
