package test_strutturali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.App;
import p4_accetta_cristian_uc_4_5_13.Gruppo;
/**
 * Classe di test della funzione aggregazioneDati, nel quale non viene fatta l'aggregazione, poichè le precondizioni non sono verificate
 * @author Accetta Cristian
 */
public class AggregazioneDatiNonFunzionanteTest {

	@Test
	public void test() {
		// Creo un gruppo di prova
		Gruppo g = new  Gruppo("Prova");
		// Faccio fallire il test delle precondizioni
		ArrayList<App> apps = null;
		g.setApps(apps);
		boolean precondizioni = g.precondizioniAggregazioneDati();
		g.aggregazioneDati();
		assertFalse(precondizioni);
	}

}
