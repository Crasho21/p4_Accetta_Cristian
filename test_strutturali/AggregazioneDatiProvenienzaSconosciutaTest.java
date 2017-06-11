package structural_tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Dati;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione aggregazioneDati, nel quale non viene fatta l'aggregazione, poichè i dati non hanno provenienza o ne hanno una non valida
 * @author Accetta Cristian
 */
public class AggregazioneDatiProvenienzaSconosciutaTest {

	@Test
	public void test() {
		// Creo un gruppo di prova
		Gruppo g = new  Gruppo("Prova");
		// Creo delle App di prova con dei dati di prova
		ArrayList<App> apps = new ArrayList<App>();
		// Dati senza provenienza
		Dati d1 = new Dati();
		App a1 = new App();
		a1.setDati(d1);
		apps.add(a1);
		// Dati con provenienza sconosciuta
		Dati d2 = new Dati();
		d2.setProvenienza(-1);
		App a2 = new App();
		a2.setDati(d2);
		apps.add(a2);
		g.setApps(apps);
		// Eseguo l'aggregazione dei dati
		g.aggregazioneDati();
		// Creo i dati attesi
		Dati datiAttesi = new Dati();
		// Confronto i dati aggregati con quelli attesi
		assertEquals(g.getDatiAggregati(), datiAttesi);
	}

}
