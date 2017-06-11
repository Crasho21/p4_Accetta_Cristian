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
public class CreazioneGruppoTest {

	private static Sistema s;
	private int nomeConfermato;
	private String nomeGruppo;
	private boolean assertType;
	
	public CreazioneGruppoTest(int nomeConfermato, String nomeGruppo, boolean assertType) {
		super();
		this.nomeConfermato = nomeConfermato;
		this.nomeGruppo = nomeGruppo;
		this.assertType = assertType;
	}

	@BeforeClass
	public static void setUp(){
		// Inizializzo il sistema
		s = new Sistema();
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			// Creo un gruppo
			{0, "GruppoDiProva", true},
			// Controllo che non venga creato di nuovo il gruppo del test precedente
			{0, "GruppoDiProva", false},
			// Non confermo il nome
			{1, "GruppoDiProva", false},
			// Creo un secondo gruppo
			{0, "GruppoDiProva2", true},
		});
	}
	
	@Test
	public void test() {
		// Testo la funzione controlloNomeGruppoCreazione, in modo tale da verificare se il nome inserito è disponibile
		boolean nomeDisponibile = s.controlloNomeGruppoCreazione(nomeConfermato, nomeGruppo);
		// Testo la funzione aggiuntaGruppo, in modo tale da verificare che il gruppo sia stato creato
		boolean gruppoCreato = s.aggiuntaGruppo(nomeDisponibile, nomeGruppo);
		// Se il test deve avere successo eseguo una assertTrue
		if(assertType){
			assertTrue(gruppoCreato);
		}
		// Altrimenti eseguo una assertFalse
		else{
			assertFalse(gruppoCreato);
		}
	}

}
