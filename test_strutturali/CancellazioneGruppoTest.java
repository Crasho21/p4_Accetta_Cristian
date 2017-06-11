package structural_tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import p4_accetta_cristian_uc_4_5_13.Sistema;
/**
 * Classe di test della funzionalità di creazione di un nuovo gruppo
 * @author Accetta Cristian
 */
@RunWith(Parameterized.class)
public class CancellazioneGruppoTest {

	private static Sistema s;
	private String nomeGruppo;
	private int conferma;
	private boolean assertType1;
	private boolean assertType2;
	
	public CancellazioneGruppoTest(String nomeGruppo, int conferma, boolean assertType1, boolean assertType2) {
		super();
		this.nomeGruppo = nomeGruppo;
		this.conferma = conferma;
		this.assertType1 = assertType1;
		this.assertType2 = assertType2;
	}

	@BeforeClass
	public static void setUp(){
		// Inizializzo il sistema
		s = new Sistema();
		// Creo un gruppo da cancellare
		boolean nomeDisponibile = s.controlloNomeGruppoCreazione(0, "GruppoDiProva");
		s.aggiuntaGruppo(nomeDisponibile, "GruppoDiProva");
		// Creo un altro gruppo da cancellare
		nomeDisponibile = s.controlloNomeGruppoCreazione(0, "GruppoDiProva2");
		s.aggiuntaGruppo(nomeDisponibile, "GruppoDiProva2");
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			// Non do la conferma alla cancellazione del gruppo
			{"GruppoDiProva", 1, true, false},
			// Cancello un gruppo
			{"GruppoDiProva", 0, true, true},
			// Provo a cancellare un gruppo che non esiste
			{"GruppoDiProva3", 0, true, false},
			// Cancello un gruppo
			{"GruppoDiProva2", 0, true, true},
			// Precondizioni non verificate
			{"GruppoDiProva", 1, false, false},
		});
	}
	
	@Test
	public void test() {
		// Testo la funzione precondizioniCancellazioneGruppo, in modo tale da verificare le precondizioni
		boolean precondizioni = s.precondizioniCancellazioneGruppo();
		if(precondizioni){
			// Testo la funzione controlloNomeGruppoCancellazione, in modo tale da verificare che il gruppo esista
			int removeIndex = s.controlloNomeGruppoCancellazione(nomeGruppo);
			// Testo la funzione rimozioneGruppo
			boolean gruppoRimosso = false;
			if(removeIndex < s.getGruppi().size()){
				gruppoRimosso = s.rimozioneGruppo(conferma, removeIndex);
			}
			// Se il test deve avere successo eseguo una assertTrue
			if(assertType2){
				assertTrue(gruppoRimosso);
			}
			// Altrimenti eseguo una assertFalse
			else{
				assertFalse(gruppoRimosso);
			}
		}
		// Se il test deve avere successo eseguo una assertTrue
		if(assertType1){
			assertTrue(precondizioni);
		}
		// Altrimenti eseguo una assertFalse
		else{
			assertFalse(precondizioni);
		}
	}

}
