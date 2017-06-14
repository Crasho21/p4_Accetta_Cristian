package test_strutturali;

import static org.junit.Assert.*;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.Sistema;
/**
 * Classe di test della funzione precondizioniCancellazioneGruppo
 * @author Accetta Cristian
 */
public class PrecondizioniCancellazioneGruppoTest {

	@Test
	public void test() {
		// Inizializzo il sistema
		Sistema s = new Sistema();
		// Setto i gruppi a null
		s.setGruppi(null);
		// Faccio fallire il test
		boolean precondizioni = s.precondizioniCancellazioneGruppo();
		assertFalse(precondizioni);
	}

}
