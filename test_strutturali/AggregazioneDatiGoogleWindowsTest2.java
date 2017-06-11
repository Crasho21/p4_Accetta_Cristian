package structural_tests;

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
public class AggregazioneDatiGoogleWindowsTest2 {

	@Test
	public void test() {
		// Creo dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> rating = new ArrayList<Double>();
		// Creo i dati della prima app
		Dati d1 = new Dati();
		d1.setProvenienza(Dati.GOOGLE_PLAY_STORE);
		App a1 = new App();
		a1.setDati(d1);
		apps.add(a1);
		// Inserisco i dati in un gruppo
		Gruppo g = new  Gruppo("Prova");
		g.setApps(apps);
		// Creo i dati della seconda app
		Dati d2 = new Dati();
		d2.setProvenienza(Dati.WINDOWS_STORE);
		d2.setOverview_dailyUserInstalls(daily);
		d2.setCountry_dailyUserInstalls(daily);
		d2.setOsVersion_dailyUserInstalls(daily);
		App a2 = new App();
		a2.setDati(d2);
		// Creo i dati della terza app
		Dati d3 = new Dati();
		daily.add(0);
		rating.add(0.0);
		apps.add(a2);
		d3.setProvenienza(Dati.WINDOWS_STORE);
		d3.setOverview_dailyUserInstalls(daily);
		d3.setCountry_dailyUserInstalls(daily);
		d3.setOsVersion_dailyUserInstalls(daily);
		App a3 = new App();
		apps.add(a3);
		// Inserisco i dati in un gruppo
		g.setApps(apps);
		// Eseguo l'aggregazione dei dati
		g.aggregazioneDati();
		// Creo i dati attesi
		Dati datiAttesi = new Dati();
		// Confronto i dati aggregati con quelli attesi
		assertEquals(g.getDatiAggregati(), datiAttesi);
	}

}
