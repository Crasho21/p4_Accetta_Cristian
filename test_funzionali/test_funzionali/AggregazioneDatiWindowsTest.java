package test_funzionali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Dati;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione aggregazioneDati con dati del Windows Store
 * @author Accetta Cristian
 */
public class AggregazioneDatiWindowsTest {

	@Test
	public void test() {
		// Creo dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<Integer> dailyExpected = new ArrayList<Integer>();
		ArrayList<Double> ratingExpected = new ArrayList<Double>();
		int dailyEx = 0;
		double ratingEx = 0;
		double count_newEx = 0;
		double count_revisedEx = 0;
		for(int i = 0; i < 5; i++){
			//System.out.println("Valori generati:");
			ArrayList<Integer> daily = new ArrayList<Integer>();
			ArrayList<Double> rating = new ArrayList<Double>();
			for(int j = 0; j < (int)(Math.random() * 10 + 1); j++){
				int dailyTemp = (int)(Math.random() * 100);
				daily.add(dailyTemp);
				dailyEx += dailyTemp;
				double ratingTemp = Math.random() * 100;
				rating.add(ratingTemp);
				ratingEx += ratingTemp;
				//System.out.println(daily.get(j) + "\n" + rating.get(j));
			}
			//System.out.println(tot.get(0));
			Dati d = new Dati();
			d.setProvenienza(Dati.WINDOWS_STORE);
    		d.setOverview_dailyUserInstalls(daily);
    		d.setCountry_dailyUserInstalls(daily);
    		d.setOsVersion_dailyUserInstalls(daily);
    		d.setFailure_count(daily);
    		double count_newTemp = Math.random() * 100;
    		d.setCount_new(count_newTemp);
    		count_newEx += count_newTemp;
    		double count_revisedTemp = Math.random() * 100;
    		d.setCount_revised(count_revisedTemp);
    		count_revisedEx += count_revisedTemp;
    		d.setCount_average(rating);
    		d.setAverage_rating(rating);
    		d.setNumber_rating(daily);
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
		ratingExpected.add(ratingEx);
		datiAttesi.setOverview_dailyUserInstalls(dailyExpected);
		datiAttesi.setCountry_dailyUserInstalls(dailyExpected);
		datiAttesi.setOsVersion_dailyUserInstalls(dailyExpected);
		datiAttesi.setFailure_count(dailyExpected);
		datiAttesi.setCount_new(count_newEx);
		datiAttesi.setCount_revised(count_revisedEx);
		datiAttesi.setCount_average(ratingExpected);
		datiAttesi.setAverage_rating(ratingExpected);
		datiAttesi.setNumber_rating(dailyExpected);
		// Confronto i dati aggregati con quelli attesi
		assertEquals(g.getDatiAggregati(), datiAttesi);
	}

}
