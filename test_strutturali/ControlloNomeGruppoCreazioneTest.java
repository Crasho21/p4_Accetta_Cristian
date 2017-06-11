package structural_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.Sistema;
/**
 * Classe di test della funzione controlloNomeGruppoCreazione
 * @author Accetta Cristian
 */
public class ControlloNomeGruppoCreazioneTest {

	@Test
	public void test() {
		// Inizializzo il sistema
		Sistema s = new Sistema();
		// Setto i gruppi a null
		s.setGruppi(null);
		// Eseguo il test
		boolean nomeDisponibile = s.controlloNomeGruppoCreazione(0, "GruppoDiProva");
		assertTrue(nomeDisponibile);
	}

}
