package test_strutturali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Dati;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione aggregazioneDati con dati del Google Play Store
 * @author Accetta Cristian
 */
public class AggregazioneDatiGoogleTest1 {

	@Test
	public void test() {
		// Creo dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<Integer> dailyExpected = new ArrayList<Integer>();
		ArrayList<Double> ratingExpected = new ArrayList<Double>();
		ArrayList<Integer> totIntExpected = new ArrayList<Integer>();
		ArrayList<Double> totDoubleExpected = new ArrayList<Double>();
		int dailyEx = 0;
		double ratingEx = 0;
		int totIntEx = 0;
		double totDoubleEx = 0;
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
			ArrayList<Integer> totInt = new ArrayList<Integer>();
			int totIntTemp = (int)(Math.random() * 100);
			totInt.add(totIntTemp);
			totIntEx += totIntTemp;
			ArrayList<Double> totDouble = new ArrayList<Double>();
			double totDoubleTemp = Math.random() * 100;
			totDouble.add(totDoubleTemp);
			totDoubleEx += totDoubleTemp;
			//System.out.println(totInt.get(totInt.size() - 1) + " " + totDouble.get(totDouble.size() - 1));
			Dati d = new Dati();
			d.setProvenienza(Dati.GOOGLE_PLAY_STORE);
    		d.setOverview_dailyUserInstalls(daily);
    		d.setOverview_totUserInstalls(totInt);
    		d.setOverview_dailyUserUninstalls(daily);
    		d.setOverview_activeDeviceInstalls(daily);
    		d.setCarrier_totUserInstalls(totInt);
    		d.setCarrier_dailyUserInstalls(daily);
    		d.setCarrier_dailyUserUninstalls(daily);
    		d.setCarrier_activeDeviceInstalls(daily);
    		d.setCountry_dailyUserInstalls(daily);
    		d.setCountry_totUserInstalls(totInt);
    		d.setCountry_dailyUserUninstalls(daily);
    		d.setCountry_activeDeviceInstalls(daily);
    		d.setDevice_totUserInstalls(totInt);
    		d.setDevice_dailyUserInstalls(daily);
    		d.setDevice_dailyUserUninstalls(daily);
    		d.setDevice_activeDeviceInstalls(daily);
    		d.setLang_totUserInstalls(totInt);
    		d.setLang_dailyUserInstalls(daily);
    		d.setLang_dailyUserUninstalls(daily);
    		d.setLang_activeDeviceInstalls(daily);
    		d.setOsVersion_dailyUserInstalls(daily);
    		d.setOsVersion_totUserInstalls(totInt);
    		d.setOsVersion_dailyUserUninstalls(daily);
    		d.setOsVersion_activeDeviceInstalls(daily);
    		d.setTablet_totUserInstalls(totInt);
    		d.setTablet_dailyUserInstalls(daily);
    		d.setTablet_dailyUserUninstalls(daily);
    		d.setTablet_activeDeviceInstalls(daily);
    		d.setDaily_average_app_version(rating);
    		d.setTotal_average_app_version(totDouble);
    		d.setDaily_average_carrier(rating);
    		d.setTotal_average_carrier(totDouble);
    		d.setDaily_average_country(rating);
    		d.setTotal_average_country(totDouble);
    		d.setDaily_average_device(rating);
    		d.setTotal_average_device(totDouble);
    		d.setDaily_average_language(rating);
    		d.setTotal_average_language(totDouble);
    		d.setDaily_average_os_version(rating);
    		d.setTotal_average_os_version(totDouble);
    		d.setDaily_average_tablet(rating);
    		d.setTotal_average_tablet(totDouble);
    		d.setDaily_average_overview(rating);
    		d.setTotal_average_overview(totDouble);
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
		totIntExpected.add(totIntEx);
		totDoubleExpected.add(totDoubleEx);
		datiAttesi.setOverview_dailyUserInstalls(dailyExpected);
		datiAttesi.setOverview_totUserInstalls(totIntExpected);
		datiAttesi.setOverview_dailyUserUninstalls(dailyExpected);
		datiAttesi.setOverview_activeDeviceInstalls(dailyExpected);
		datiAttesi.setCarrier_totUserInstalls(totIntExpected);
		datiAttesi.setCarrier_dailyUserInstalls(dailyExpected);
		datiAttesi.setCarrier_dailyUserUninstalls(dailyExpected);
		datiAttesi.setCarrier_activeDeviceInstalls(dailyExpected);
		datiAttesi.setCountry_dailyUserInstalls(dailyExpected);
		datiAttesi.setCountry_totUserInstalls(totIntExpected);
		datiAttesi.setCountry_dailyUserUninstalls(dailyExpected);
		datiAttesi.setCountry_activeDeviceInstalls(dailyExpected);
		datiAttesi.setDevice_totUserInstalls(totIntExpected);
		datiAttesi.setDevice_dailyUserInstalls(dailyExpected);
		datiAttesi.setDevice_dailyUserUninstalls(dailyExpected);
		datiAttesi.setDevice_activeDeviceInstalls(dailyExpected);
		datiAttesi.setLang_totUserInstalls(totIntExpected);
		datiAttesi.setLang_dailyUserInstalls(dailyExpected);
		datiAttesi.setLang_dailyUserUninstalls(dailyExpected);
		datiAttesi.setLang_activeDeviceInstalls(dailyExpected);
		datiAttesi.setOsVersion_dailyUserInstalls(dailyExpected);
		datiAttesi.setOsVersion_totUserInstalls(totIntExpected);
		datiAttesi.setOsVersion_dailyUserUninstalls(dailyExpected);
		datiAttesi.setOsVersion_activeDeviceInstalls(dailyExpected);
		datiAttesi.setTablet_totUserInstalls(totIntExpected);
		datiAttesi.setTablet_dailyUserInstalls(dailyExpected);
		datiAttesi.setTablet_dailyUserUninstalls(dailyExpected);
		datiAttesi.setTablet_activeDeviceInstalls(dailyExpected);
		datiAttesi.setDaily_average_app_version(ratingExpected);
		datiAttesi.setTotal_average_app_version(totDoubleExpected);
		datiAttesi.setDaily_average_carrier(ratingExpected);
		datiAttesi.setTotal_average_carrier(totDoubleExpected);
		datiAttesi.setDaily_average_country(ratingExpected);
		datiAttesi.setTotal_average_country(totDoubleExpected);
		datiAttesi.setDaily_average_device(ratingExpected);
		datiAttesi.setTotal_average_device(totDoubleExpected);
		datiAttesi.setDaily_average_language(ratingExpected);
		datiAttesi.setTotal_average_language(totDoubleExpected);
		datiAttesi.setDaily_average_os_version(ratingExpected);
		datiAttesi.setTotal_average_os_version(totDoubleExpected);
		datiAttesi.setDaily_average_tablet(ratingExpected);
		datiAttesi.setTotal_average_tablet(totDoubleExpected);
		datiAttesi.setDaily_average_overview(ratingExpected);
		datiAttesi.setTotal_average_overview(totDoubleExpected);
		// Confronto i dati aggregati con quelli attesi
		assertEquals(g.getDatiAggregati(), datiAttesi);
	}

}
