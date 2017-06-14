package test_funzionali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Dati;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione aggregazioneDati con dati del Google Play Store e del Windows Store
 * @author Accetta Cristian
 */
public class AggregazioneDatiGoogleWindowsTest {

	@Test
	public void test() {
		// Creo dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<Integer> dailyExpected = new ArrayList<Integer>();
		int dailyEx = 0;
		for(int i = 0; i < 5; i++){
			//System.out.println("Valori generati:");
			ArrayList<Integer> daily = new ArrayList<Integer>();
			for(int j = 0; j < (int)(Math.random() * 10 + 1); j++){
				int dailyTemp = (int)(Math.random() * 100);
				daily.add(dailyTemp);
				dailyEx += dailyTemp;
				//System.out.println(daily.get(j));
			}
			Dati d = new Dati();
			if(Math.random() > 0.5){
				d.setProvenienza(Dati.GOOGLE_PLAY_STORE);
			} else{
				d.setProvenienza(Dati.WINDOWS_STORE);
			}
    		d.setOverview_dailyUserInstalls(daily);
    		d.setCountry_dailyUserInstalls(daily);
    		d.setOsVersion_dailyUserInstalls(daily);
			App a = new App();
			a.setDati(d);
			apps.add(a);
		}
		// Inserisco i dati in un gruppo
		Gruppo g = new  Gruppo("Prova");
		g.setApps(apps);
		// Eseguo l'aggregazione dei dati
		g.aggregazioneDati();
		// Creo i dati attesi
		Dati datiAttesi = new Dati();
		dailyExpected.add(dailyEx);
		datiAttesi.setOverview_dailyUserInstalls(dailyExpected);
		datiAttesi.setCountry_dailyUserInstalls(dailyExpected);
		datiAttesi.setOsVersion_dailyUserInstalls(dailyExpected);
		// Confronto i dati aggregati con quelli attesi
		assertEquals(g.getDatiAggregati(), datiAttesi);
	}

}
