package structural_tests;

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
public class AggregazioneDatiGoogleTest2 {

	@Test
	public void test() {
		// Creo dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> rating = new ArrayList<Double>();
		ArrayList<Integer> totInt = new ArrayList<Integer>();
		ArrayList<Double> totDouble = new ArrayList<Double>();
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
		d2.setProvenienza(Dati.GOOGLE_PLAY_STORE);
		d2.setOverview_dailyUserInstalls(daily);
		d2.setOverview_totUserInstalls(totInt);
		d2.setOverview_dailyUserUninstalls(daily);
		d2.setOverview_activeDeviceInstalls(daily);
		d2.setCarrier_totUserInstalls(totInt);
		d2.setCarrier_dailyUserInstalls(daily);
		d2.setCarrier_dailyUserUninstalls(daily);
		d2.setCarrier_activeDeviceInstalls(daily);
		d2.setCountry_dailyUserInstalls(daily);
		d2.setCountry_totUserInstalls(totInt);
		d2.setCountry_dailyUserUninstalls(daily);
		d2.setCountry_activeDeviceInstalls(daily);
		d2.setDevice_totUserInstalls(totInt);
		d2.setDevice_dailyUserInstalls(daily);
		d2.setDevice_dailyUserUninstalls(daily);
		d2.setDevice_activeDeviceInstalls(daily);
		d2.setLang_totUserInstalls(totInt);
		d2.setLang_dailyUserInstalls(daily);
		d2.setLang_dailyUserUninstalls(daily);
		d2.setLang_activeDeviceInstalls(daily);
		d2.setOsVersion_dailyUserInstalls(daily);
		d2.setOsVersion_totUserInstalls(totInt);
		d2.setOsVersion_dailyUserUninstalls(daily);
		d2.setOsVersion_activeDeviceInstalls(daily);
		d2.setTablet_totUserInstalls(totInt);
		d2.setTablet_dailyUserInstalls(daily);
		d2.setTablet_dailyUserUninstalls(daily);
		d2.setTablet_activeDeviceInstalls(daily);
		d2.setDaily_average_app_version(rating);
		d2.setTotal_average_app_version(totDouble);
		d2.setDaily_average_carrier(rating);
		d2.setTotal_average_carrier(totDouble);
		d2.setDaily_average_country(rating);
		d2.setTotal_average_country(totDouble);
		d2.setDaily_average_device(rating);
		d2.setTotal_average_device(totDouble);
		d2.setDaily_average_language(rating);
		d2.setTotal_average_language(totDouble);
		d2.setDaily_average_os_version(rating);
		d2.setTotal_average_os_version(totDouble);
		d2.setDaily_average_tablet(rating);
		d2.setTotal_average_tablet(totDouble);
		d2.setDaily_average_overview(rating);
		d2.setTotal_average_overview(totDouble);
		App a2 = new App();
		a2.setDati(d2);
		// Creo i dati della terza app
		Dati d3 = new Dati();
		daily.add(0);
		rating.add(0.0);
		totInt.add(0);
		totDouble.add(0.0);
		apps.add(a2);
		d3.setProvenienza(Dati.GOOGLE_PLAY_STORE);
		d3.setOverview_dailyUserInstalls(daily);
		d3.setOverview_totUserInstalls(totInt);
		d3.setOverview_dailyUserUninstalls(daily);
		d3.setOverview_activeDeviceInstalls(daily);
		d3.setCarrier_totUserInstalls(totInt);
		d3.setCarrier_dailyUserInstalls(daily);
		d3.setCarrier_dailyUserUninstalls(daily);
		d3.setCarrier_activeDeviceInstalls(daily);
		d3.setCountry_dailyUserInstalls(daily);
		d3.setCountry_totUserInstalls(totInt);
		d3.setCountry_dailyUserUninstalls(daily);
		d3.setCountry_activeDeviceInstalls(daily);
		d3.setDevice_totUserInstalls(totInt);
		d3.setDevice_dailyUserInstalls(daily);
		d3.setDevice_dailyUserUninstalls(daily);
		d3.setDevice_activeDeviceInstalls(daily);
		d3.setLang_totUserInstalls(totInt);
		d3.setLang_dailyUserInstalls(daily);
		d3.setLang_dailyUserUninstalls(daily);
		d3.setLang_activeDeviceInstalls(daily);
		d3.setOsVersion_dailyUserInstalls(daily);
		d3.setOsVersion_totUserInstalls(totInt);
		d3.setOsVersion_dailyUserUninstalls(daily);
		d3.setOsVersion_activeDeviceInstalls(daily);
		d3.setTablet_totUserInstalls(totInt);
		d3.setTablet_dailyUserInstalls(daily);
		d3.setTablet_dailyUserUninstalls(daily);
		d3.setTablet_activeDeviceInstalls(daily);
		d3.setDaily_average_app_version(rating);
		d3.setTotal_average_app_version(totDouble);
		d3.setDaily_average_carrier(rating);
		d3.setTotal_average_carrier(totDouble);
		d3.setDaily_average_country(rating);
		d3.setTotal_average_country(totDouble);
		d3.setDaily_average_device(rating);
		d3.setTotal_average_device(totDouble);
		d3.setDaily_average_language(rating);
		d3.setTotal_average_language(totDouble);
		d3.setDaily_average_os_version(rating);
		d3.setTotal_average_os_version(totDouble);
		d3.setDaily_average_tablet(rating);
		d3.setTotal_average_tablet(totDouble);
		d3.setDaily_average_overview(rating);
		d3.setTotal_average_overview(totDouble);
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
