package structural_tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * Test suite per i test strutturali
 * @author Accetta Cristian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AggregazioneDatiGoogleTest1.class, AggregazioneDatiGoogleTest2.class, AggregazioneDatiGoogleWindowsTest1.class, 
					 AggregazioneDatiGoogleWindowsTest2.class, AggregazioneDatiNonFunzionanteTest.class, AggregazioneDatiProvenienzaSconosciutaTest.class, 
					 AggregazioneDatiWindowsTest1.class, AggregazioneDatiWindowsTest2.class, CancellazioneGruppoTest.class, 
					 ControlloNomeGruppoCreazioneTest.class, CreazioneGruppoTest.class, GetNomiGruppiTest.class, PrecondizioniAggregazioneDatiTest.class, 
					 PrecondizioniCancellazioneGruppoTest.class})
public class StructuralTestSuite {

}
