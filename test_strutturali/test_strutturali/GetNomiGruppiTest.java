package test_strutturali;

import static org.junit.Assert.*;

import org.junit.Test;

import p4_accetta_cristian_uc_4_5_13.Sistema;
/**
 * Classe di test della funzione getNomiGruppi
 * @author Accetta Cristian
 */
public class GetNomiGruppiTest {

	@Test
	public void test() {
		// Inizializzo il sistema
		Sistema s = new Sistema();
		// Creo un gruppo da prendere
		boolean nomeDisponibile = s.controlloNomeGruppoCreazione(0, "GruppoDiProva");
		s.aggiuntaGruppo(nomeDisponibile, "GruppoDiProva");
		// Ottengo i gruppi del sistema
		String nomiGruppi = s.getNomiGruppi();
		// Controllo che i nomi ottenuti siano uguali a quelli attesi
		assertEquals(nomiGruppi, "GruppoDiProva\n");
	}

}
