package test_strutturali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Dati;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione precondizioniAggregazioneDati
 * @author Accetta Cristian
 */
public class PrecondizioniAggregazioneDatiTest {

	@Test
	public void test() {
		// Creo un gruppo di prova
		Gruppo g = new  Gruppo("Prova");
		// Faccio fallire il test delle precondizioni
		ArrayList<App> apps = null;
		g.setApps(apps);
		boolean precondizioni = g.precondizioniAggregazioneDati();
		assertFalse(precondizioni);
		// Faccio fallire di nuovo il test delle precondizioni
		apps = new ArrayList<App>();
		g.setApps(apps);
		precondizioni = g.precondizioniAggregazioneDati();
		assertFalse(precondizioni);
		// Faccio fallire di nuovo il test delle precondizioni
		Dati d1 = null;
		App a1 = new App();
		a1.setDati(d1);
		apps.add(a1);
		Dati d2 = null;
		App a2 = new App();
		a2.setDati(d2);
		apps.add(a2);
		g.setApps(apps);
		precondizioni = g.precondizioniAggregazioneDati();
		assertFalse(precondizioni);
		// Faccio eseguire correttamente il test delle precondizioni
		apps = new ArrayList<App>();
		d1 = new Dati();
		d2 = new Dati();
		a1 = new App();
		a1.setDati(d1);
		apps.add(a1);
		a2 = new App();
		a2.setDati(d2);
		apps.add(a2);
		g.setApps(apps);
		precondizioni = g.precondizioniAggregazioneDati();
		assertTrue(precondizioni);
	}

}
